package example.com.hb.reportproblem.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.hb.reportproblem.R;
import example.com.hb.reportproblem.connection.APIService;
import example.com.hb.reportproblem.connection.ApiUtils;
import example.com.hb.reportproblem.fragment.DateFragment;
import example.com.hb.reportproblem.fragment.DateTimeFragment;
import example.com.hb.reportproblem.fragment.InputStringFragment;
import example.com.hb.reportproblem.fragment.MotaFragment;
import example.com.hb.reportproblem.fragment.RadioButtonFragment;
import example.com.hb.reportproblem.model.DangLoiAM;
import example.com.hb.reportproblem.model.DangNguyCo;
import example.com.hb.reportproblem.model.DangNguyHiem;
import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;
import example.com.hb.reportproblem.model.Logistic;
import example.com.hb.reportproblem.model.NguoiVietTag;
import example.com.hb.reportproblem.model.brewing.Brewing;
import example.com.hb.reportproblem.model.packaging.Packaging;
import example.com.hb.reportproblem.model.response.Message;
import example.com.hb.reportproblem.model.utility.Utility;
import example.com.hb.reportproblem.utils.BitmapUtils;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;

import static example.com.hb.reportproblem.fragment.DateTimeFragment.AM_TAG;
import static example.com.hb.reportproblem.fragment.DateTimeFragment.DATE;
import static example.com.hb.reportproblem.fragment.DateTimeFragment.MONTH;
import static example.com.hb.reportproblem.fragment.DateTimeFragment.YEAR;
import static example.com.hb.reportproblem.fragment.InputStringFragment.INPUT_DEFAULT;
import static example.com.hb.reportproblem.fragment.InputStringFragment.TITLE;
import static example.com.hb.reportproblem.fragment.MotaFragment.MO_TA_CHI_TIET;
import static example.com.hb.reportproblem.fragment.RadioButtonFragment.CURRENT_SELECTED;
import static example.com.hb.reportproblem.fragment.RadioButtonFragment.LIST;
import static example.com.hb.reportproblem.fragment.RadioButtonFragment.MESSAGE;

public class ReportProblemActivity extends FragmentActivity {
    public static final int TAKE_PHOTO_CODE = 10;
    public static final String FIRST_FRAGMENT = "FIRST";
    public static final String SECOND_FRAGMENT = "SECOND";
    public static final String THIRD_FRAGMENT = "THIRD";
    public static final String FRAGMENT_04TH = "FR_04";
    public static final String FRAGMENT_05TH = "FR_05";
    public static final String FRAGMENT_06TH = "FR_06";
    public static final String FRAGMENT_07TH = "FR_07";
    public static final String FRAGMENT_08TH = "FR_08";
    public static final String FRAGMENT_09TH = "FR_09";
    public static final String FRAGMENT_10TH = "FR_10";
    public static final String FRAGMENT_11TH = "FR_11";
    public static final String FRAGMENT_12TH = "FR_12";
    public static final String FRAGMENT_13TH = "FR_13";
    public static final String FRAGMENT_14TH = "FR_14";
    public static final String FRAGMENT_15TH = "FR_15";

    Bitmap bitmap;
    File imgFile;
    ArrayList listNode = new ArrayList();
    String strBoPhan = "", strKhuVucMay = "", strMay = "", strCumMay = "", strChiTietMay = "",
            strNguoiViet = "", strDangNguyHiem = "", strDangLoi = "", strDangNguyCo = "",
            strMoTaChiTiet = "", strNgayViet = "",
    //strAM_PMTag = "",
    //strHqCaoOrThap = "",
    strWeekToDo = "", strGiaiPhap = "",
            strSoNgayTonDong = "",
            strNgayXuLy = "",
            strAmTeam = "", strType = "", strRank = "", strDone = "", strCode = "",
            strSafeCode = "", strTimeline = "", strWoNumber = "";
    boolean am_pmTag = true, hqCaoThap = true;
    Calendar ngayViet = Calendar.getInstance();
    Calendar ngayThucTeXuLy = Calendar.getInstance();
    int currentPos, maxPos;
    Object currentNode;
    private String TAG = "ReportProblemActivity";
    @BindView(R.id.flContent)
    FrameLayout flContent;

    @BindView(R.id.ivProblem)
    ImageView ivProblem;

    @BindView(R.id.flProblem)
    LinearLayout flProblem;

    @BindView(R.id.tvNext)
    TextView tvNext;

    @BindView(R.id.tvBack)
    TextView tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_problem);
        showToast("Chụp ảnh sự cố");
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
        ButterKnife.bind(this);
        for (int i = 0; i < 30; i++)
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
                fragment_4th();
                break;
            case 4:
                fragment_5th();
                break;
            case 5:
                fragment_6th();
                break;
            case 6:
                fragment_7th();
                break;
            case 7:
                fragment_8th();
                break;
            case 8:
                fragment_9th();
                break;
            case 9:
                fragment_10th();
                break;
            default:
                sendData();
                break;
        }
        if (maxPos < currentPos) maxPos = currentPos;
    }

    private void sendData() {
        Log.e(TAG, "Send Data");
        RequestBody requestFile =
                RequestBody.create(MediaType.parse("image/*"), imgFile);
        MultipartBody.Part filePart = MultipartBody.Part.createFormData("image",
                imgFile.getName(), requestFile);
        RequestBody bodyBoPhan = RequestBody.create(MediaType.parse("text/plain"),
                strBoPhan);
        RequestBody bodyKhuVucMay = RequestBody.create(MediaType.parse("text/plain"),
                strKhuVucMay);
        RequestBody bodyMay = RequestBody.create(MediaType.parse("text/plain"),
                strMay);
        RequestBody bodyCumMay = RequestBody.create(MediaType.parse("text/plain"),
                strCumMay);
        RequestBody bodyChiTietMay = RequestBody.create(MediaType.parse("text/plain"),
                strChiTietMay);
        RequestBody bodyNguoiVietTag = RequestBody.create(MediaType.parse("text/plain"),
                strNguoiViet);
        RequestBody bodyDangNguyHiem = RequestBody.create(MediaType.parse("text/plain"),
                strDangNguyHiem);
        RequestBody bodyDangLoi = RequestBody.create(MediaType.parse("text/plain"),
                strDangLoi);
        RequestBody bodyDangNguyCo = RequestBody.create(MediaType.parse("text/plain"),
                strDangNguyCo);
        MotaFragment prevFragment = (MotaFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_10TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            strMoTaChiTiet = prevFragment.getMoTaChiTiet();
            ngayViet = prevFragment.getNgayViet();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            strNgayViet = sdf.format(ngayViet.getTime());
            am_pmTag = prevFragment.getAMTag();
            hqCaoThap = prevFragment.getHQState();
            Log.e(TAG, "Input 10: Mô tả: " + strMoTaChiTiet
                    + "\nNgày viết: " + strNgayViet
                    + "\n AM Tag: " + am_pmTag
                    + "\n HQ: " + hqCaoThap);
            currentPos = 11;
        }
        RequestBody bodyMoTaChiTiet = RequestBody.create(MediaType.parse("text/plain"),
                strMoTaChiTiet);
        RequestBody bodyNgayVietTag = RequestBody.create(MediaType.parse("text/plain"),
                strNgayViet);
        RequestBody bodyAMTag = RequestBody.create(MediaType.parse("text/plain"),
                String.valueOf(am_pmTag));
        RequestBody bodyHQCao = RequestBody.create(MediaType.parse("text/plain"),
                String.valueOf(hqCaoThap));
        RequestBody bodyWeekToDo = RequestBody.create(MediaType.parse("text/plain"),
                strWeekToDo);
        RequestBody bodyGiaiPhapTrietDe = RequestBody.create(MediaType.parse("text/plain"),
                strGiaiPhap);
        RequestBody bodySoNgayTonDong = RequestBody.create(MediaType.parse("text/plain"),
                strSoNgayTonDong);

//        DateFragment prevFragment = (DateFragment) getSupportFragmentManager()
//                .findFragmentByTag(FRAGMENT_13TH);
//        if (prevFragment != null && prevFragment.isVisible()) {
//            ngayThucTeXuLy = prevFragment.getCalendar();
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            strNgayXuLy = sdf.format(ngayThucTeXuLy.getTime());
//            Log.e(TAG, "Ngay xu ly: " + strNgayXuLy);
//        }
        RequestBody bodyNgayXuLy = RequestBody.create(MediaType.parse("text/plain"),
                strNgayXuLy);

        RequestBody bodyAMTeam = RequestBody.create(MediaType.parse("text/plain"),
                strAmTeam);
        RequestBody bodyType = RequestBody.create(MediaType.parse("text/plain"),
                strType);
        RequestBody bodyRank = RequestBody.create(MediaType.parse("text/plain"),
                strRank);
        RequestBody bodyDone = RequestBody.create(MediaType.parse("text/plain"),
                strDone);
        RequestBody bodyCode = RequestBody.create(MediaType.parse("text/plain"),
                strCode);
        RequestBody bodySafetyCode = RequestBody.create(MediaType.parse("text/plain"),
                strSafeCode);
        RequestBody bodyTimeline = RequestBody.create(MediaType.parse("text/plain"),
                strTimeline);
        RequestBody bodyWONumber = RequestBody.create(MediaType.parse("text/plain"),
                strWoNumber);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Gửi dữ liệu");
        builder.setMessage("Vui lòng chờ");
        builder.setNegativeButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
        APIService apiService = ApiUtils.getAPIService();
//        Call<ResponseBody> call = apiService.newProblem(bodyBoPhan, bodyKhuVucMay, bodyMay,
//                bodyCumMay, bodyChiTietMay, bodyNguoiVietTag, bodyDangNguyHiem, bodyDangLoi,
//                bodyDangNguyCo, bodyMoTaChiTiet, bodyNgayVietTag, bodyAMTag, bodyHQCao,
//                bodyWeekToDo, bodyGiaiPhapTrietDe, bodyNgayXuLy, filePart);
        Call<ResponseBody> call = apiService.addProblem(bodyBoPhan, bodyKhuVucMay, bodyMay,
                bodyCumMay, bodyChiTietMay, bodyNguoiVietTag, bodyDangNguyHiem, bodyDangLoi,
                bodyDangNguyCo, bodyMoTaChiTiet, bodyNgayVietTag, bodyAMTag, bodyHQCao,
                bodyWeekToDo, bodyGiaiPhapTrietDe, bodySoNgayTonDong, bodyNgayXuLy,
                bodyAMTeam, bodyType, bodyRank, bodyDone, bodyCode, bodySafetyCode,
                bodyTimeline, bodyWONumber, filePart);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call,
                                   retrofit2.Response<ResponseBody> response) {
                alertDialog.dismiss();
                try {
                    String res = response.body().string();
                    Log.e(TAG, "Response from add problem: " + res);
                    Gson gson = new Gson();
                    Message message = gson.fromJson(res, Message.class);
                    if (message.getError() == false) {
                        AlertDialog.Builder builder
                                = new AlertDialog.Builder(ReportProblemActivity.this);
                        builder.setTitle("Thành công")
                                .setCancelable(false)
                                .setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                        finish();
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    } else {
                        showToast("Có lỗi: " + message.getMessage());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                alertDialog.dismiss();
                showToast("Có lỗi xảy ra: " + t.getMessage());
            }
        });
        logData();
    }

    private void logData() {
        Log.e(TAG, "All input to send:");
        Log.e(TAG, "Bo phan: "+strBoPhan);
        Log.e(TAG, "Khu vuc may: "+strKhuVucMay);
        Log.e(TAG, "May: "+strMay);
        Log.e(TAG, "Cum may: "+strCumMay);
        Log.e(TAG, "Chi tiet may: "+strChiTietMay);
        Log.e(TAG, "Nguoi viet: "+strNguoiViet);
        Log.e(TAG, "Dang nguy hiem: "+strDangNguyHiem);
        Log.e(TAG, "Dang loi: "+strDangLoi);
        Log.e(TAG, "Dang nguy co: "+strDangNguyCo);
        Log.e(TAG, "Mo ta chi tiet: "+strMoTaChiTiet);
        Log.e(TAG, "Ngay viet: "+strNgayViet);
        Log.e(TAG, "AM TAG: "+String.valueOf(am_pmTag));
        Log.e(TAG, "HQ: "+String.valueOf(hqCaoThap));
        Log.e(TAG, "Week to do: "+strWeekToDo);
        Log.e(TAG, "Giai phap: "+strGiaiPhap);
        Log.e(TAG, "Ngay xu ly: "+strNgayXuLy);
    }

    private void fragmentNgayXuLy() {
        InputStringFragment prevFragment = (InputStringFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_12TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            strGiaiPhap = prevFragment.getInputData();
            Log.e(TAG, "Input 12: " + strGiaiPhap);
            currentPos = 13;
            ngayXuLyFragment(ngayThucTeXuLy, FRAGMENT_13TH);
        }
    }

    private void fragmentGiaiPhap() {
        InputStringFragment prevFragment = (InputStringFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_11TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            strWeekToDo = prevFragment.getInputData();
            Log.e(TAG, "Input 11: " + strWeekToDo);
            currentPos = 12;
            stringFragment("Giải Pháp Xử Lý Triệt Để", strGiaiPhap, FRAGMENT_12TH);
        }
    }

//    private void fragment_13th() {
//        RadioButtonFragment prevFragment = (RadioButtonFragment) getSupportFragmentManager()
//                .findFragmentByTag(FRAGMENT_12TH);
//        if (prevFragment != null && prevFragment.isVisible()) {
//            String hqType = prevFragment.getInputData();
//            if (hqType != null) {
//                Log.e(TAG, "Input 12: " + hqType);
//                if (hqType.equals(HQState.HQ_CAO))
//                    hqCaoThap = true;
//                else
//                    hqCaoThap = false;
//                currentPos = 13;
//                stringFragment("Week to do", strWeekToDo, FRAGMENT_13TH);
//            } else {
//                showToast(getResources().getString(R.string.chon_mot));
//            }
//        }
//    }

//    private void fragment_12th() {
//        DateTimeFragment prevFragment = (DateTimeFragment) getSupportFragmentManager()
//                .findFragmentByTag(FRAGMENT_11TH);
//        if (prevFragment != null && prevFragment.isVisible()) {
//            ngayViet = prevFragment.getCalendar();
//            Log.e(TAG, "Input 11: " + ngayViet.getTime());
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            strNgayViet = sdf.format(ngayViet.getTime());
//            Boolean amTag = prevFragment.getAmPmTag();
//            if (amTag != null) {
//                currentPos = 12;
//                am_pmTag = amTag;
//                String currentSelected = (hqCaoThap ? HQState.HQ_CAO : HQState.HQ_THAP);
//                HQState hqState = new HQState();
//                radioFragment(hqState.getList(), hqState.getName(),
//                        currentSelected, FRAGMENT_12TH);
//            } else {
//                showToast(getResources().getString(R.string.chon_mot));
//            }
//        }
//    }

//    private void fragment_11th() {
//        MotaFragment prevFragment = (MotaFragment) getSupportFragmentManager()
//                .findFragmentByTag(FRAGMENT_10TH);
//        if (prevFragment != null && prevFragment.isVisible()) {
//            strMoTaChiTiet = prevFragment.getMoTaChiTiet();
//            ngayViet = prevFragment.getNgayViet();
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            strNgayViet = sdf.format(ngayViet.getTime());
//            am_pmTag = prevFragment.getAMTag();
//            hqCaoThap = prevFragment.getHQState();
//            Log.e(TAG, "Input 10: Mô tả: " + strMoTaChiTiet
//                    + "\nNgày viết: " + strNgayViet
//                    + "\n AM Tag: " + am_pmTag
//                    + "\n HQ: " + hqCaoThap);
//            currentPos = 11;
//            stringFragment("Week to do", strWeekToDo, FRAGMENT_11TH);
//        }
//    }

    private void fragment_10th() {
        RadioButtonFragment prevFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_09TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 9: " + inputData);
                currentPos = 10;
                if (!inputData.equals(strDangLoi)) {
                    strDangLoi = inputData;
                    maxPos = currentPos;
                }
                currentNode = inputData;
                listNode.set(currentPos, inputData);
                motaFragment(FRAGMENT_10TH);
            } else {
                showToast(getResources().getString(R.string.chon_mot));
            }
        }
    }

    private void fragment_9th() {
        if (strDangNguyHiem.equals(DangNguyHiem.KHONG_CO_NGUY_CO)){
            Log.e(TAG, "Chuyển fragment 9 do không có nguy cơ");
            DangLoiAM dangLoiAM = new DangLoiAM();
            ArrayList<String> list = dangLoiAM.getList();
            radioFragment(list, dangLoiAM.getName(), strDangLoi, FRAGMENT_09TH);
            return;
        }
        RadioButtonFragment prevFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_08TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 8: " + inputData);
                currentPos = 9;
                if (!inputData.equals(strDangNguyCo)) {
                    strDangNguyCo = inputData;
                    maxPos = currentPos;
                }
                DangLoiAM dangLoiAM = new DangLoiAM();
                ArrayList<String> list = dangLoiAM.getList();
                currentNode = dangLoiAM;
                listNode.set(currentPos, dangLoiAM);
                radioFragment(list, dangLoiAM.getName(), strDangLoi, FRAGMENT_09TH);
            } else {
                showToast(getResources().getString(R.string.chon_mot));
            }
        }
    }

    private void fragment_8th() {
        RadioButtonFragment prevFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_07TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 7: " + inputData);
                currentPos = 8;
                if (!inputData.equals(strDangNguyHiem)) {
                    strDangNguyHiem = inputData;
                    maxPos = currentPos;
                }
                if (strDangNguyHiem.equals(DangNguyHiem.KHONG_CO_NGUY_CO)){
                    Log.e(TAG, "Không có nguy cơ nên nhảy sang fragment sau");
                    currentPos=9;
                    fragment_9th();
                } else {
                    DangNguyCo dangNguyCo = new DangNguyCo();
                    ArrayList<String> list = dangNguyCo.getList();
                    currentNode = dangNguyCo;
                    listNode.set(currentPos, dangNguyCo);
                    radioFragment(list, dangNguyCo.getName(), strDangNguyCo, FRAGMENT_08TH);
                }
            } else {
                showToast(getResources().getString(R.string.chon_mot));
            }
        }
    }

    private void fragment_7th() {
        RadioButtonFragment prevFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_06TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 6: " + inputData);
                currentPos = 7;
                if (!inputData.equals(strNguoiViet)) {
                    strNguoiViet = inputData;
                    maxPos = currentPos;
                }
                DangNguyHiem dangNguyHiem = new DangNguyHiem();
                ArrayList<String> list = dangNguyHiem.getList();
                currentNode = dangNguyHiem;
                listNode.set(currentPos, dangNguyHiem);
                radioFragment(list, dangNguyHiem.getName(), strDangNguyHiem, FRAGMENT_07TH);
            } else {
                showToast(getResources().getString(R.string.chon_mot));
            }
        }
    }

    private void fragment_6th() {
        InputStringFragment prevFragment = (InputStringFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_05TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            Log.e(TAG, "Input 5: " + inputData);
            currentPos = 6;
            if (!inputData.equals(strChiTietMay)) {
                strChiTietMay = inputData;
                maxPos = currentPos;
            }
            NguoiVietTag nguoiVietTag = new NguoiVietTag();
            ArrayList<String> list = nguoiVietTag.getList();
            currentNode = nguoiVietTag;
            listNode.set(currentPos, inputData);
            radioFragment(list, nguoiVietTag.getName(), strNguoiViet, FRAGMENT_06TH);
        }
    }

    private void fragment_5th() {
        RadioButtonFragment prevFragment = (RadioButtonFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_04TH);
        if (prevFragment != null && prevFragment.isVisible()) {
            String inputData = prevFragment.getInputData();
            if (inputData != null) {
                Log.e(TAG, "Input 4: " + inputData);
                currentPos = 5;
                if (!inputData.equals(strCumMay)) {
                    strCumMay = inputData;
                    maxPos = currentPos;
                }
                try {
                    INode node = (INode) listNode.get(currentPos - 1);
                    for (Object object : node.getChilds()) {
                        ISimpleNode simpleNode = (ISimpleNode) object;
                        if (inputData.equals(simpleNode.getName())) {
                            currentNode = simpleNode;
                            listNode.set(currentPos, currentNode);
                        }
                    }
                } catch (Exception e) {
                }
                stringFragment("Chi tiết máy", strChiTietMay, FRAGMENT_05TH);
            } else {
                showToast(getResources().getString(R.string.chon_mot));
            }
        }
    }

    private void fragment_4th() {
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
                ArrayList<String> list = null;
                try {
                    INode node = (INode) listNode.get(currentPos - 1);
                    for (Object object : node.getChilds()) {
                        ISimpleNode simpleNode = (ISimpleNode) object;
                        if (inputData.equals(simpleNode.getName())) {
                            currentNode = simpleNode;
                            list = ((INode) currentNode).getList();
                            listNode.set(currentPos, currentNode);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                radioFragment(list, getResources().getString(R.string.cum_may),
                        strCumMay, FRAGMENT_04TH);
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
                ArrayList<String> list = null;
                try {
                    INode node = (INode) listNode.get(currentPos - 1);
                    for (Object object : node.getChilds()) {
                        ISimpleNode simpleNode = (ISimpleNode) object;
                        if (inputData.equals(simpleNode.getName())) {
                            currentNode = simpleNode;
                            list = ((INode) currentNode).getList();
                            listNode.set(currentPos, currentNode);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                radioFragment(list, "Máy", strMay, THIRD_FRAGMENT);
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
                        strKhuVucMay, SECOND_FRAGMENT);
            } else {
                showToast("Bạn phải chọn 1");
            }
        }
    }

    private void firstFragment() {
        currentPos = 1;
        ArrayList<String> list = getListFirst();
        String currentString = strBoPhan;
        radioFragment(list, getResources().getString(R.string.bo_phan),
                currentString, FIRST_FRAGMENT);
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
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
//        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left,
//                android.R.anim.slide_out_right,
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

    private void stringFragment(String title, String inputDefault, String tag) {
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

    private void dateFragment(Calendar ngayViet, boolean am_pmTag, String tag) {
        Bundle bundle = new Bundle();
        bundle.putInt(YEAR, ngayViet.get(Calendar.YEAR));
        bundle.putInt(MONTH, ngayViet.get(Calendar.MONTH));
        bundle.putInt(DATE, ngayViet.get(Calendar.DATE));
        bundle.putBoolean(AM_TAG, am_pmTag);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        DateTimeFragment fragment = new DateTimeFragment();
        fragment.setArguments(bundle);
        ft.replace(R.id.flContent, fragment, tag);
        ft.addToBackStack(null);
        ft.commit();
    }

    private void ngayXuLyFragment(Calendar ngayXuLy, String tag) {
        Bundle bundle = new Bundle();
        bundle.putInt(YEAR, ngayXuLy.get(Calendar.YEAR));
        bundle.putInt(MONTH, ngayXuLy.get(Calendar.MONTH));
        bundle.putInt(DATE, ngayXuLy.get(Calendar.DATE));
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        DateFragment fragment = new DateFragment();
        fragment.setArguments(bundle);
        ft.replace(R.id.flContent, fragment, tag);
        ft.addToBackStack(null);
        ft.commit();
    }

    private void motaFragment(String tag) {
        Bundle bundle = new Bundle();
        bundle.putString(MO_TA_CHI_TIET, strMoTaChiTiet);
        bundle.putInt(MotaFragment.YEAR, ngayViet.get(Calendar.YEAR));
        bundle.putInt(MotaFragment.MONTH, ngayViet.get(Calendar.MONTH));
        bundle.putInt(MotaFragment.DATE, ngayViet.get(Calendar.DATE));
        bundle.putBoolean(MotaFragment.AM_TAG, am_pmTag);
        bundle.putBoolean(MotaFragment.HQ_CAO, hqCaoThap);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MotaFragment fragment = new MotaFragment();
        fragment.setArguments(bundle);
        ft.replace(R.id.flContent, fragment, tag);
        ft.addToBackStack(null);
        ft.commit();
    }

    @OnClick(R.id.tvBack)
    public void back(View view) {
        if (currentPos > 0) {
            if (currentPos==8 && strDangNguyHiem.equals(DangNguyHiem.KHONG_CO_NGUY_CO))
                currentPos--;
            currentPos--;
            getSupportFragmentManager().popBackStack();
            if (currentPos == 0)
                flProblem.setVisibility(View.VISIBLE);
            return;
        }
        finish();
    }

    @OnClick(R.id.ivRotateLeft)
    public void rotateLeft(View view) {
        bitmap = BitmapUtils.rotateBitmap(bitmap, -90);
        ivProblem.setImageBitmap(bitmap);
        updateFile();
    }

    @OnClick(R.id.ivRotateRight)
    public void rotateRight(View view) {
        bitmap = BitmapUtils.rotateBitmap(bitmap, 90);
        ivProblem.setImageBitmap(bitmap);
        updateFile();
    }

    private void updateFile() {
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

    @Override
    protected void onResume() {
        super.onResume();
        if (imgFile == null) {
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == TAKE_PHOTO_CODE && resultCode == Activity.RESULT_OK) {
//            fileUri = data.getData();
            bitmap = (Bitmap) data.getExtras().get("data");
            ivProblem.setImageBitmap(bitmap);
            updateFile();
        } else {
            finish();
        }
    }

}
