package com.example.animtemp1;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class FullscreenActivity extends Activity {
    int i = 0;
    ImageView frameanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameanimation = (ImageView) findViewById(R.id.fullscreen_content);
        AnimationDrawable frame_animation = (AnimationDrawable) frameanimation
                .getBackground();
        frame_animation.setVisible(true, true);
        frame_animation.start();
        Timer timer = new Timer();
        timer.schedule(new RunTimer(), 0, 1500);
    }

    class RunTimer extends TimerTask {
        public void run() {
            runOnUiThread(runnn);
        }

        Runnable runnn = new Runnable() {
            @Override
            public void run() {
                AlphaAnimation alpha = new AlphaAnimation(1, 0.7F);
                alpha.setDuration(1000);
                frameanimation.startAnimation(alpha);
            }
        };
    }

}