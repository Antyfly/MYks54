package com.example.ks54;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class LogoClass extends Activity {
    private ImageView Logo;
    private Animation animlogo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.logo);
        Logo = findViewById(R.id.logo);
        animlogo = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.logo);

        AnimLogo();
    }

    private void AnimLogo(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                //ПЕРЕХОД ОТ ОКНА К ОКНУ!!!!!!!!!!!!!!!!!!!!!!!!!
                Intent intent = new Intent(LogoClass.this, MainActivity.class);
                startActivity(intent);
            }
        }).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
