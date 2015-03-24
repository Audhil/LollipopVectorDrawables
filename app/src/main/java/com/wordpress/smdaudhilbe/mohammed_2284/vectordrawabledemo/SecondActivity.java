package com.wordpress.smdaudhilbe.mohammed_2284.vectordrawabledemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by mohammed-2284 on 23/03/15.
 */
public class SecondActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initViews();
    }

    private void initViews() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.myViewPager);
        viewPager.setAdapter(SecondImagePagerAdapter.newInstance(this));
        viewPager.setOnPageChangeListener(viewPagerChangeListener);
    }

    ViewPager.OnPageChangeListener viewPagerChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if (position == 2) {
                findViewById(R.id.navigateButton).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.navigateButton).setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @fromXML
    public void moveToThirdActivity(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}