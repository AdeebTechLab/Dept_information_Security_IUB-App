package com.AdeebTechLab.BsISClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashSecreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.activity_splash_secreen);





        Thread thread = new Thread(){

            public void run(){
                try {
                    sleep( 4000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(  SplashSecreen.this , MainActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}