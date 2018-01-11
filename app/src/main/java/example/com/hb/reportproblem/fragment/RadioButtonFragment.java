package example.com.hb.reportproblem.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import example.com.hb.reportproblem.R;

public class RadioButtonFragment extends Fragment {
    public static final String LIST = "list";
    public static final String MESSAGE = "message";
    ArrayList<String> list;
    String message;
    @BindView(R.id.flLayout)
    FrameLayout frameLayout;
    @BindView(R.id.tvTitle)
    TextView tvTitle;

    private OnFragmentInteractionListener mListener;

    public RadioButtonFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            list = args.getStringArrayList(LIST);
            message = args.getString(MESSAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_radio_button, container, false);
        ButterKnife.bind(this, view);
        createRadioButton();
        return view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void createRadioButton() {
        tvTitle.setText(message);
        RadioButton[] radioButtons = new RadioButton[list.size()];
        RadioGroup radioGroup = new RadioGroup(getContext());   //create the RadioGroup
        radioGroup.setOrientation(RadioGroup.VERTICAL);       //or RadioGroup.VERTICAL
        for(int i=0; i<list.size(); i++){
            radioButtons[i]  = new RadioButton(getContext());
            radioGroup.addView(radioButtons[i]);
            radioButtons[i].setText(list.get(i));
        }
        frameLayout.addView(radioGroup);//you add the whole RadioGroup to the layout
    }
}
