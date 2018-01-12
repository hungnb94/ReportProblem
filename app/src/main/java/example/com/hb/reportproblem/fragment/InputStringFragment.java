package example.com.hb.reportproblem.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import example.com.hb.reportproblem.R;

public class InputStringFragment extends Fragment implements IBaseFragment {
    public static final String TITLE = "title";
    public static final String INPUT_DEFAULT = "input";

    View view;

    String title, inputDefault;
    @BindView(R.id.tvTitleInputString)
    TextView textView;
    @BindView(R.id.edtInputString)
    EditText editText;

    private OnFragmentInteractionListener mListener;

    public InputStringFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args=getArguments();
        if (args != null) {
            title = args.getString(TITLE);
            inputDefault = args.getString(INPUT_DEFAULT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_input_string, container, false);
            ButterKnife.bind(this, view);
            initView();
        }
        return view;
    }

    private void initView() {
        textView.setText(title);
        if (inputDefault!=null)
            editText.setText(inputDefault);
    }

    @Override
    public String getInputData() {
        return editText.getText().toString();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
