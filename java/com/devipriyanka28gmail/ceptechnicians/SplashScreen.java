package com.devipriyanka28gmail.ceptechnicians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread mythread=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent it=new Intent(getApplicationContext(),Login.class);
                    startActivity(it);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        };
        mythread.start();
    }
}
