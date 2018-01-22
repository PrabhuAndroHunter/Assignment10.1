package com.assigment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleAddition extends Fragment {
    private final String TAG = SimpleAddition.class.toString();
    private EditText mTextEt;
    private Button mSubmitBtn;
    private TextView mOutputTv;


    public SimpleAddition() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_addition, container, false);
        // init all view
        mTextEt = (EditText) view.findViewById(R.id.edit_text_number);
        mSubmitBtn = (Button) view.findViewById(R.id.submit_button);
        mOutputTv = (TextView) view.findViewById(R.id.output_textview);
        return  view;
    }

    @Override
    public void onStart() {
        super.onStart();
        // set on click listener on submit button
        mSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOutputTv.setText(mTextEt.getText().toString()); // get content from mTextEt and set it to mOutputTv
            }
        });
    }
}
