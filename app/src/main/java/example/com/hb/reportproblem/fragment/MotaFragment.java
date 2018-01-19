package example.com.hb.reportproblem.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.hb.reportproblem.R;

public class MotaFragment extends Fragment {
    public static final String MO_TA_CHI_TIET = "mo_ta";
    public static final String YEAR = "year";
    public static final String MONTH = "month";
    public static final String DATE = "date";
    public static final String AM_TAG = "am_tag";
    public static final String HQ_CAO = "hq_cao";
    String strMoTa;
    Calendar ngayViet = Calendar.getInstance();
    int date, month, year;
    boolean amTag, hqCao;
    View view;

    @BindView(R.id.edtMoTa)
    EditText edtMoTa;
    @BindView(R.id.tvDate)
    TextView tvDate;
    @BindView(R.id.rbtAM)
    RadioButton rbtAM;
    @BindView(R.id.rbtPM)
    RadioButton rbtPM;
    @BindView(R.id.rbtHQCao)
    RadioButton rbtHQCao;
    @BindView(R.id.rbtHQThap)
    RadioButton rbtHQThap;

    public MotaFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            strMoTa = args.getString(MO_TA_CHI_TIET, "");
            year = args.getInt(YEAR, ngayViet.get(Calendar.YEAR));
            month = args.getInt(MONTH, ngayViet.get(Calendar.MONTH));
            date = args.getInt(DATE, ngayViet.get(Calendar.DATE));
            ngayViet.set(year, month, date);
            amTag = args.getBoolean(AM_TAG,true);
            hqCao = args.getBoolean(HQ_CAO,true);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_mota, container, false);
            ButterKnife.bind(this, view);
            initView();
        }
        return view;
    }

    private void initView() {
        edtMoTa.setText(strMoTa);
        tvDate.setText("Ngày: " + ngayViet.get(Calendar.DATE)
                + "/" + (ngayViet.get(Calendar.MONTH) + 1)
                + "/" + ngayViet.get(Calendar.YEAR));
        if (amTag)
            rbtAM.setChecked(true);
        else
            rbtPM.setChecked(true);
        if (hqCao)
            rbtHQCao.setChecked(true);
        else
            rbtHQThap.setChecked(true);
    }

    @OnClick(R.id.tvDate)
    void changeDate(View view){
        DatePickerDialog pic=new DatePickerDialog(
                getActivity(),
                callback, year, month, date);
        pic.setTitle("Chọn ngày");
        pic.show();
    }

    DatePickerDialog.OnDateSetListener callback = new DatePickerDialog.OnDateSetListener() {
        //Sự kiện khi click vào nút Done trên Dialog
        @Override
        public void onDateSet(DatePicker datePicker, int yy, int mm, int dd) {
            // Set text cho textView
            tvDate.setText("Ngày: "+ dd + "/" + (mm+1) + "/" + yy);
            ngayViet.set(yy, mm, dd);
        }
    };

    public String getMoTaChiTiet(){
        return edtMoTa.getText().toString();
    }

    public Calendar getNgayViet(){
        return ngayViet;
    }

    public boolean getAMTag(){
        return rbtAM.isChecked();
    }

    public boolean getHQState(){
        return rbtHQCao.isChecked();
    }
}
