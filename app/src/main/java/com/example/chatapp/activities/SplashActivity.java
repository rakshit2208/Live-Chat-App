package com.example.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.chatapp.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){

            public void run(){
                try {
                    sleep(2000);

                }catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent = new Intent(SplashActivity.this,SigninActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();
    }
}