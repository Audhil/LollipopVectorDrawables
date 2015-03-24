package com.wordpress.smdaudhilbe.mohammed_2284.vectordrawabledemo;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by mohammed-2284 on 23/03/15.
 */
public class ThirdActivity extends Activity {

    private ImageView thirdImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        initViews();
    }

    private void initViews() {
        thirdImage = (ImageView) findViewById(R.id.thirdImage);
    }

    @fromXML
    public void doAnimation(View view) {
        if (thirdImage.getDrawable() != null && thirdImage.getDrawable() instanceof Animatable) {
            ((Animatable) thirdImage.getDrawable()).start();
        }
    }
}