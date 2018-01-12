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
import android.widget.Toast;

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
import example.com.hb.reportproblem.fragment.InputStringFragment;
import example.com.hb.reportproblem.fragment.RadioButtonFragment;
import example.com.hb.reportproblem.model.Brewing;
import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;
import example.com.hb.reportproblem.model.Logistic;
import example.com.hb.reportproblem.model.Packaging;
import example.com.hb.reportproblem.model.Utility;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static example.com.hb.reportproblem.fragment.InputStringFragment.INPUT_DEFAULT;
import static example.com.hb.reportproblem.fragment.InputStringFragment.TITLE;
import static example.com.hb.reportproblem.fragment.RadioButtonFragment.CURRENT_SELECTED;
import static example.com.hb.reportproblem.fragment.RadioButtonFragment.LIST;
import static example.com.hb.reportproblem.fragment.RadioButtonFragment.MESSAGE;

public class ReportProblemActivity extends FragmentActivity {
    public static final int TAKE_PHOTO_CODE = 10;
    public static final String FIRST_FRAGMENT = "FIRST";
    public static final String SECOND_FRAGMENT = "SECOND";
    public static final String THIRD_FRAGMENT = "THIRD";
    public static final String FOURTH_FRAGMENT = "FOURTH";
    public static final String FIVETH_FRAGMENT = "FIVETH";
    File imgFile;
    ArrayList listNode = new ArrayList();
    String strBoPhan, strKhuVucMay, strMay, strCumMay, strChiTietMay, strNguoiViet,
            strDangNguyHiem, strDangLoi, strDangNguyCo, strMoTaChiTiet, strNgayViet,
            strGioViet, strHqCaoOrThap, strWeekToDo, strGiaiPhap, strSoNgayTonDong,
            strNgayXuLy, strAmTeam, strType, strTank, strDone, strCode, strSafeCode,
            strTimeline, strWoNumber;
    int currentPos, maxPos;
    Object currentNode;
    APIService apiService;
    private String TAG = "ReportProblemActivity";
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
        for (int i=0; i< 30;i++)
            listNode.add(new Object());
    }

    @OnClick(R.id.tvNext)
    public void next(View view) {
        flProblem.setVisibility(View.GONE);
        switch (currentPos) {
            case 0:
                firstFragment();
                break;
            case 1:
                secondFragment();
                break;
            case 2:
                thirdFragment();
                break;
            case 3:
                fragment4th();
                break;
            case 4:
                fragment5th();
                break;
            case 5:
                fragment6th();
                break;
            default:
                break;
        }
        if (maxPos < currentPos) maxPos = currentPos;
    }

    private void fragment6th() {
        InputStringFragment prevFragment = (InputStringFragment) getSupportFragmentManager()
                .findFragmentByTag(FIVETH_FRAGMENT);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 5: " + inputData);
                currentPos = 6;
                if (!inputData.equals(strChiTietMay)) {
                    strChiTietMay = inputData;
                    maxPos = currentPos;
                }
                String currentString = null;
                if (currentPos < maxPos) {
                    Log.e(TAG, "Fragment 6: Position < MaxPosition");
                    try {
                        ISimpleNode node = (ISimpleNode) listNode.get(currentPos+1);
                        currentString = node.getName();
                    } catch (Exception e){
                    }
                }
                ArrayList<String> list = null;
                try {
                    INode node = (INode) listNode.get(currentPos-1);
                    for (Object object : node.getChilds()) {
                        ISimpleNode simpleNode = (ISimpleNode) object;
                        if (inputData.equals(simpleNode.getName())) {
                            currentNode = simpleNode;
                            list = ((INode) currentNode).getList();
                            listNode.set(currentPos, currentNode);
                        }
                    }
                } catch (Exception e) {
                }
                radioFragment(list, "Người viết Tag", currentString, FOURTH_FRAGMENT);
            } else {
                showToast("Bạn phải chọn 1");
            }
        }
    }

    private void fragment5th() {
        RadioButtonFragment prevFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(FOURTH_FRAGMENT);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 4: " + inputData);
                currentPos = 5;
                if (!inputData.equals(strCumMay)) {
                    strCumMay = inputData;
                    maxPos = currentPos;
                }
                stringFragment("Chi tiết máy", strChiTietMay, FIVETH_FRAGMENT);
            } else {
                showToast(getResources().getString(R.string.chon_mot));
            }
        }
    }

    private void fragment4th() {
        RadioButtonFragment thirdFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(THIRD_FRAGMENT);
        if (thirdFragment != null && thirdFragment.isVisible()) {
            String inputData = thirdFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 3: " + inputData);
                currentPos = 4;
                if (!inputData.equals(strMay)) {
                    strMay = inputData;
                    maxPos = currentPos;
                }
                String currentString = null;
                ArrayList<String> list = null;
                if (currentPos < maxPos) {
                    Log.e(TAG, "Fragment 4: Position < MaxPosition");
                    try {
                        ISimpleNode node = (ISimpleNode) listNode.get(currentPos+1);
                        currentString = node.getName();
                    } catch (Exception e){
                    }
                }
                try {
                    INode node = (INode) listNode.get(currentPos-1);
                    for (Object object : node.getChilds()) {
                        ISimpleNode simpleNode = (ISimpleNode) object;
                        if (inputData.equals(simpleNode.getName())) {
                            currentNode = simpleNode;
                            list = ((INode) currentNode).getList();
                            listNode.set(currentPos, currentNode);
                        }
                    }
                } catch (Exception e) {
                }
                radioFragment(list, "Cụm máy", currentString, FOURTH_FRAGMENT);
            } else {
                showToast(getResources().getString(R.string.chon_mot));
            }
        }
    }

    private void thirdFragment() {
        RadioButtonFragment secondFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(SECOND_FRAGMENT);
        if (secondFragment != null && secondFragment.isVisible()) {
            String inputData = secondFragment.getInputData();
            Log.e(TAG, "Input 2: " + inputData);
            if (inputData != null) {
                currentPos = 3;
                if (!inputData.equals(strKhuVucMay)) {
                    strKhuVucMay = inputData;
                    maxPos = currentPos;
                }
                String currentString = null;
                ArrayList<String> list = null;
                if (currentPos < maxPos) {
                    Log.e(TAG, "Fragment 3: Position < MaxPosition");
                    try {
                        ISimpleNode node = (ISimpleNode) listNode.get(currentPos+1);
                        currentString = node.getName();
                    } catch (Exception e){
                    }
                }
                try {
                    INode node = (INode) listNode.get(currentPos-1);
                    for (Object object : node.getChilds()) {
                        ISimpleNode simpleNode = (ISimpleNode) object;
                        if (inputData.equals(simpleNode.getName())) {
                            currentNode = simpleNode;
                            list = ((INode) currentNode).getList();
                            listNode.set(currentPos, currentNode);
                        }
                    }
                } catch (Exception e) {
                }
                radioFragment(list, "Máy", currentString, THIRD_FRAGMENT);
            } else {
                showToast("Bạn phải chọn 1");
            }
        }
    }

    private void secondFragment() {
        RadioButtonFragment firstFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(FIRST_FRAGMENT);
        if (firstFragment != null && firstFragment.isVisible()) {
            String inputData = firstFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 1: " + inputData);
                currentPos = 2;
                if (!inputData.equals(strBoPhan)) {
                    strBoPhan = inputData;
                    maxPos = currentPos;
                }
                String currentString = null;
                if (currentPos < maxPos) {
                    Log.e(TAG, "Fragment 2: Position < MaxPosition");
                    try {
                        ISimpleNode node = (ISimpleNode) listNode.get(currentPos+1);
                        currentString = node.getName();
                    } catch (Exception e){
                    }
                }
                ArrayList<String> list = null;
                Brewing brewing = new Brewing();
                Packaging packaging = new Packaging();
                Utility utility = new Utility();
                Logistic logistic = new Logistic();
                if (inputData.equals(brewing.getName())) {
                    list = brewing.getList();
                    currentNode = brewing;
                } else if (inputData.equals(packaging.getName())) {
                    list = packaging.getList();
                    currentNode = packaging;
                } else if (inputData.equals(utility.getName())) {
                    list = utility.getList();
                    currentNode = utility;
                } else if (inputData.equals(logistic.getName())) {
                    list = logistic.getList();
                    currentNode = logistic;
                }
                listNode.set(currentPos, currentNode);
                radioFragment(list, getResources().getString(R.string.khu_vuc_may),
                        currentString, SECOND_FRAGMENT);
            } else {
                showToast("Bạn phải chọn 1");
            }
        }
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    private void firstFragment() {
        currentPos = 1;
        ArrayList<String> list = getListFirst();
        String currentString = strBoPhan;
        radioFragment(list, getResources().getString(R.string.bo_phan),
                currentString, FIRST_FRAGMENT);
    }

    public ArrayList<String> getListFirst() {
        ArrayList<String> list = new ArrayList();
        list.add(new Brewing().getName());
        list.add(new Packaging().getName());
        list.add(new Utility().getName());
        list.add(new Logistic().getName());
        return list;
    }

    private void radioFragment(ArrayList<String> list, String msg, String currentStr, String tag) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(LIST, list);
        bundle.putString(MESSAGE, msg);
        bundle.putString(CURRENT_SELECTED, currentStr);
        RadioButtonFragment fragment = new RadioButtonFragment();
        fragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.enter_from_left,
//                R.anim.enter_from_right, R.anim.enter_from_left);
//        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right,
//                android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        fragmentTransaction.replace(R.id.flContent, fragment, tag);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        try {
            ISimpleNode node = (ISimpleNode) currentNode;
            Log.e(TAG, "Current fragment: " + node.getName());
        } catch (Exception e) {
        }
    }

    private void stringFragment(String title, String inputDefault, String tag){
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, title);
        bundle.putString(INPUT_DEFAULT, inputDefault);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        InputStringFragment fragment = new InputStringFragment();
        fragment.setArguments(bundle);
        ft.replace(R.id.flContent, fragment, tag);
        ft.addToBackStack(null);
        ft.commit();
    }
    @OnClick(R.id.tvBack)
    public void back(View view) {
        if (currentPos > 0) {
            currentPos--;
            getSupportFragmentManager().popBackStack();
            if (currentPos == 0)
                flProblem.setVisibility(View.VISIBLE);
            return;
        }
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
