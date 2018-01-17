package example.com.hb.reportproblem.activity;

import android.Manifest;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.hb.reportproblem.R;
import example.com.hb.reportproblem.model.response.Download;
import example.com.hb.reportproblem.utils.DownloadService;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE_PROGRESS = "message_progress";
    private static final int PERMISSION_REQUEST_CODE = 1;
    @BindView(R.id.llReportProblem)
    LinearLayout llReportProblem;
    private String TAG = "MainActivity";
    private ProgressDialog loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        registerReceiver();
    }

    private void registerReceiver() {
        LocalBroadcastManager bManager = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(MESSAGE_PROGRESS);
        bManager.registerReceiver(broadcastReceiver, intentFilter);
    }

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            if (intent.getAction().equals(MESSAGE_PROGRESS)) {
                Download download = intent.getParcelableExtra("download");
                loading.setProgress(download.getProgress());
                if (download.getProgress() == 100) {
                    loading.dismiss();
                    showDialogOpenFile();
                }
            }
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        if (!isOnline()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Internet không khả dụng");
            builder.setMessage("Vui lòng kết nối mạng");
            builder.setNegativeButton("Đóng", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }

    @OnClick(R.id.llReportProblem)
    public void reportProblem(View view) {
        Intent intent = new Intent(this, ReportProblemActivity.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.llDownload)
    public void download(View view) {
//        DownloadFile downloadFile = new DownloadFile(this);
//        downloadFile.execute();
        if (checkPermission()) {
            startDownload();
        } else {
            requestPermission();
        }
    }

    private void startDownload() {
        Intent intent = new Intent(this, DownloadService.class);
        startService(intent);
        loading = ProgressDialog.show(this, "Downloading...",
                null, true, true);
    }

    private void requestPermission() {

        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);

    }

    private boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);
        return (result == PackageManager.PERMISSION_GRANTED);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startDownload();
                } else {
                    Toast.makeText(this,
                            "Permission Denied, Please allow to proceed !",
                            LENGTH_LONG)
                            .show();
                }
                break;
        }
    }

    private void showDialogOpenFile() {
        android.support.v7.app.AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new android.support.v7.app.AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new android.support.v7.app.AlertDialog.Builder(this);
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
        File file = new File(
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                "report.xlsx");
        String mime = null;
        try {
            mime = URLConnection.guessContentTypeFromStream(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (mime == null) mime = URLConnection.guessContentTypeFromName(file.getName());
        myIntent.setDataAndType(Uri.fromFile(file), mime);
        startActivity(myIntent);
    }

    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
