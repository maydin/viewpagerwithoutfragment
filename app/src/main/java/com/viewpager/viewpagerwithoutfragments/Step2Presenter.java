package com.viewpager.viewpagerwithoutfragments;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Step2Presenter extends Presenter {
    TextView textViewStep2;

    public Step2Presenter(AppCompatActivity activity, View view) {
        super(activity, view);
    }

    @Override
    public void onCreateView() {
        textViewStep2 = (TextView) view.findViewById(R.id.step2_textView);
    }
}
