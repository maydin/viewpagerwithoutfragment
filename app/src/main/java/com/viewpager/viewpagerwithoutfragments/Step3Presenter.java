package com.viewpager.viewpagerwithoutfragments;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Step3Presenter extends Presenter {

    TextView textViewStep3;

    public Step3Presenter(AppCompatActivity activity, View view) {
        super(activity, view);
    }

    @Override
    public void onCreateView() {
        textViewStep3 = (TextView) view.findViewById(R.id.step3_textView);
    }
}
