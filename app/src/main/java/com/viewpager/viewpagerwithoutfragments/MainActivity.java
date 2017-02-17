package com.viewpager.viewpagerwithoutfragments;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(2);

        setupViewPager();
    }

    public void setupViewPager() {

        adapter = new ViewPagerAdapter();

        adapter.addView(new Step1Presenter(this, findViewById(R.id.step1_layout)));
        adapter.addView(new Step2Presenter(this, findViewById(R.id.step2_layout)));
        adapter.addView(new Step3Presenter(this, findViewById(R.id.step3_layout)));

        viewPager.setAdapter(adapter);

    }

    class ViewPagerAdapter extends PagerAdapter {
        private final List<Presenter> mPresenterList = new ArrayList<>();

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public int getCount() {
            return mPresenterList.size();
        }

        public void addView(Presenter presenter) {
            mPresenterList.add(presenter);
        }

        @Override
        public Object instantiateItem(ViewGroup collection, int position) {
            View currentView = mPresenterList.get(position).getView();
            return currentView;
        }
    }
}
