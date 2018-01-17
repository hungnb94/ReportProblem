package example.com.hb.reportproblem.fragment;

import android.app.DatePickerDialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.hb.reportproblem.R;

public class DateTimeFragment extends Fragment {
    public static final String YEAR = "year";
    public static final String MONTH = "month";
    public static final String DATE = "date";
    public static final String AM_TAG = "amTag";
    Calendar calendar = Calendar.getInstance();
    int date, month, year;
    boolean amTag;
    View view;
    @BindView(R.id.tvDate)
    TextView tvDate;
    @BindView(R.id.rbtAM)
    RadioButton rbtAM;
    @BindView(R.id.rbtPM)
    RadioButton rbtPM;

    public DateTimeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            year = args.getInt(YEAR, calendar.get(Calendar.YEAR));
            month = args.getInt(MONTH, calendar.get(Calendar.MONTH));
            date = args.getInt(DATE, calendar.get(Calendar.DATE));
            calendar.set(year, month, date);
            amTag = args.getBoolean(AM_TAG,true);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_date_time, container, false);
            ButterKnife.bind(this, view);
            tvDate.setText("Ngày: "+ calendar.get(Calendar.DATE)
                    + "/" + (calendar.get(Calendar.MONTH)+1)
                    + "/" + calendar.get(Calendar.YEAR));
            if (amTag) {
                rbtAM.setChecked(true);
            } else {
                rbtPM.setChecked(true);
            }
        }
        return view;
    }

    DatePickerDialog.OnDateSetListener callback = new DatePickerDialog.OnDateSetListener() {
        //Sự kiện khi click vào nút Done trên Dialog
        @Override
        public void onDateSet(DatePicker datePicker, int yy, int mm, int dd) {
            // Set text cho textView
            tvDate.setText("Ngày: "+ dd + "/" + (mm+1) + "/" + yy);
            calendar.set(yy, mm, dd);
        }
    };

    public Calendar getCalendar(){
        return calendar;
    }

    public Boolean getAmPmTag() {
        if (rbtAM.isChecked())
            return true;
        else if (rbtPM.isChecked())
            return false;
        return null;
    }

    @OnClick(R.id.tvDate)
    void changeDate(View view){
        DatePickerDialog pic=new DatePickerDialog(
                getActivity(),
                callback, year, month, date);
        pic.setTitle("Chọn ngày");
        pic.show();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
