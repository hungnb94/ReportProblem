package example.com.hb.reportproblem.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import example.com.hb.reportproblem.R;

public class RadioButtonFragment extends Fragment implements IBaseFragment {
    String TAG="RadioButtonFragment";
    public static final String LIST = "list";
    public static final String MESSAGE = "message";
    public static final String CURRENT_SELECTED = "current";
    ArrayList<String> list;
    String message;
    String curentSelected;
    @BindView(R.id.llRadioGroup)
    LinearLayout linearLayout;
    @BindView(R.id.tvTitle)
    TextView tvTitle;

    private OnFragmentInteractionListener mListener;
    private RadioButton[] radioButtons;
    private RadioGroup radioGroup;

    View view;

    public RadioButtonFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            list = args.getStringArrayList(LIST);
            message = args.getString(MESSAGE);
            curentSelected = args.getString(CURRENT_SELECTED);
            Log.e(TAG, "Current selected: " + curentSelected);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_radio_button, container, false);
            ButterKnife.bind(this, view);
            createRadioButton();
        }
        return view;
    }

    @Override
    public String getInputData() {
        if (list == null || list.size() == 0)
            return "";
        try {
            int selected = radioGroup.getCheckedRadioButtonId();
            if (selected > 0) {
                RadioButton radioButton = (RadioButton) getView().findViewById(selected);
                return radioButton.getText().toString();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void createRadioButton() {
        tvTitle.setText(message);
        int size = 0;
        if (list != null)
            size = list.size();
        radioButtons = new RadioButton[size];
        radioGroup = new RadioGroup(getContext());   //create the RadioGroup
        radioGroup.setOrientation(RadioGroup.VERTICAL);       //or RadioGroup.VERTICAL
        for (int i = 0; i < size; i++) {
            radioButtons[i] = new RadioButton(getContext());
            radioGroup.addView(radioButtons[i]);
            String content = list.get(i);
            radioButtons[i].setText(content);
            if (content.equals(curentSelected))
                radioButtons[i].setChecked(true);
        }
        linearLayout.addView(radioGroup);//you add the whole RadioGroup to the layout
    }
}
