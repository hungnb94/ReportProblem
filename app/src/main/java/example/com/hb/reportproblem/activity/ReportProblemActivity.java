package example.com.hb.reportproblem.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.hb.reportproblem.R;
import example.com.hb.reportproblem.connection.APIService;
import example.com.hb.reportproblem.fragment.RadioButtonFragment;
import example.com.hb.reportproblem.model.Brewing;
import example.com.hb.reportproblem.model.Logistic;
import example.com.hb.reportproblem.model.Packaging;
import example.com.hb.reportproblem.model.Utility;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static example.com.hb.reportproblem.fragment.RadioButtonFragment.LIST;
import static example.com.hb.reportproblem.fragment.RadioButtonFragment.MESSAGE;

public class ReportProblemActivity extends FragmentActivity {
    public static final int TAKE_PHOTO_CODE = 10;
    File imgFile;
    ArrayList<String> sendStrings = new ArrayList();
    int curentPos, maxPos;
    APIService apiService;
    private String TAG = "ReportProblemActivity";
    private FragmentTransaction fragmentTransaction;
    @BindView(R.id.flContent)
    FrameLayout flContent;

    @BindView(R.id.ivProblem)
    ImageView ivProblem;
    @BindView(R.id.flProblem)
    FrameLayout flProblem;

    @BindView(R.id.tvNext)
    TextView tvNext;
    @BindView(R.id.tvBack)
    TextView tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_problem);
        ButterKnife.bind(this);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
    }

    @OnClick(R.id.tvNext)
    public void next(View view) {
        flProblem.setVisibility(View.GONE);
        curentPos++;
        if (maxPos<curentPos) maxPos=cu
        switch (curentPos){
            case 0:
                firstFragment();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    private void firstFragment() {
        ArrayList<String> list = new ArrayList();
        list.add(new Brewing().getName());
        list.add(new Packaging().getName());
        list.add(new Utility().getName());
        list.add(new Logistic().getName());
        radioFragment(list, getResources().getString(R.string.bo_phan));
    }

    private void radioFragment(ArrayList<String> list, String msg) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(LIST, list);
        bundle.putString(MESSAGE, msg);
        RadioButtonFragment fragment = new RadioButtonFragment();
        fragment.setArguments(bundle);
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right,R.anim.enter_from_left,
                R.anim.enter_from_right, R.anim.enter_from_left);
//        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right,
//                android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        fragmentTransaction.add(R.id.flContent, fragment, "SELECT").addToBackStack(null).commit();
    }

    @OnClick(R.id.tvBack)
    public void back(View view) {
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (imgFile == null) {
            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == TAKE_PHOTO_CODE && resultCode == Activity.RESULT_OK) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            ivProblem.setImageBitmap(bitmap);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0 /*ignored for PNG*/, bos);
            byte[] bitmapdata = bos.toByteArray();
            try {
                //create a file to write bitmap data
                imgFile = new File(getCacheDir(), "tmp.png");
                imgFile.createNewFile();
                //write the bytes in file
                FileOutputStream fos = new FileOutputStream(imgFile);
                fos.write(bitmapdata);
                fos.flush();
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendPost(String title, String body) {
        apiService.savePost(title, body, 1).enqueue(new Callback<Objects>() {
            @Override
            public void onResponse(Call<Objects> call, Response<Objects> response) {
                if (response.isSuccessful()) {
                }
            }

            @Override
            public void onFailure(Call<Objects> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }
}
