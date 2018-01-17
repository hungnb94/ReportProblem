package example.com.hb.reportproblem.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import example.com.hb.reportproblem.connection.ApiUtils;

/**
 * Created by hung on 1/17/2018.
 */

public class DownloadFile extends AsyncTask<Void, Integer, Void> {
    private static final String TAG = "DownloadFileTask";
    Context context;
//    NotificationManager mNotifyManager;
//    NotificationCompat.Builder mBuilder;

    //initialize root directory
    File rootDir = Environment.getExternalStorageDirectory();
    String fileName = "report.xlsx";
    private String dirName = "/heineken_report";
    private ProgressDialog loading;


    public DownloadFile(Context context) {
        this.context = context;
    }

//    ProgressDialog loading;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.e(TAG, "Pre Excute");
        loading = ProgressDialog.show(context, "Downloading...",
                null, true, true);
        checkAndCreateDirectory();
//        mNotifyManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//        mBuilder = new NotificationCompat.Builder(context);
//        mBuilder.setContentTitle("Downloading...")
//                .setContentText("Download in progress");
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.e(TAG, "Post excute");
        loading.dismiss();
//        mBuilder.setContentText("Download complete");
//        // Removes the progress bar
//        mBuilder.setProgress(0,0,false);
//        mNotifyManager.notify(0, mBuilder.build());
        showDialogOpenFile();
    }

    protected void onProgressUpdate(Integer... progress) {
        loading.setProgress((progress[0]));
//        mBuilder.setProgress(100, progress[0], false);
//        // Displays the progress bar on notification
//        mNotifyManager.notify(0, mBuilder.build());
    }

    @Override
    protected Void doInBackground(Void... params) {
        String strUrl = ApiUtils.BASE_URL + "/Report/public/download";
        try {
            //connecting to url
            URL url = new URL(strUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            //lenghtOfFile is used for calculating download progress
            int lenghtOfFile = urlConnection.getContentLength();

            //this is where the file will be seen after the download
            FileOutputStream outputStream = new FileOutputStream(
                    new File(rootDir + dirName + "/", fileName));
            //file input is from the url
            InputStream inputStream = urlConnection.getInputStream();

            //here’s the download code
            byte[] buffer = new byte[1024];
            int leng = 0;
            Integer total = 0;

            while ((leng = inputStream.read(buffer)) > 0) {
                total += leng; //total = total + leng
                publishProgress(total * 100 / lenghtOfFile);
                outputStream.write(buffer, 0, leng);
            }
            outputStream.close();

        } catch (Exception e) {
            Log.d(TAG, e.getMessage());
        }
        return null;
    }

    private void showDialogOpenFile() {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(context, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setTitle("Tải về hoàn tất")
                .setMessage("Bạn muốn mở file?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        openFile();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private void openFile() {
        Intent myIntent = new Intent(Intent.ACTION_VIEW);
        File file = new File(rootDir + dirName + "/", fileName);
        String mime = null;
        try {
            mime = URLConnection.guessContentTypeFromStream(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (mime == null) mime = URLConnection.guessContentTypeFromName(file.getName());
        myIntent.setDataAndType(Uri.fromFile(file), mime);
        context.startActivity(myIntent);
    }

    //function to verify if directory exists
    public void checkAndCreateDirectory() {
        File new_dir = new File(rootDir + dirName);
        if (!new_dir.exists()) {
            new_dir.mkdirs();
        }
    }
}
