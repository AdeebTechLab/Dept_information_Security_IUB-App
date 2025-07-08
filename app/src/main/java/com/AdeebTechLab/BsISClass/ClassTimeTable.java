package com.AdeebTechLab.BsISClass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;

public class ClassTimeTable extends AppCompatActivity {


    private WebView web1,web2,web3;



    Button online_Buttone, b61m, b11m, b21m;

    LinearLayout live, class6th1m, class1st1m, class2nd1m;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_time_table);





        web1= (android.webkit.WebView) findViewById(R.id.Web_6th_Time);
        web1.setWebViewClient(new WebViewClient());
        web1.loadUrl("file:///android_asset/time_6th-1m.html");


        web2= (android.webkit.WebView) findViewById(R.id.WebLive);
        web2.setWebViewClient(new WebViewClient());
        web2.loadUrl("https://drive.google.com/drive/folders/1iWbzCnyGZfRnXcn1jpo7wVV_g8PG0GTS?usp=sharing");



        WebSettings mywebsettings = web2.getSettings();
        mywebsettings.setJavaScriptEnabled(true);


//-----------LinearLayout----------
        class6th1m=(LinearLayout) findViewById(R.id.Class6th_1M);
        live=(LinearLayout) findViewById(R.id.Live);



//-----------Button----------
        b61m=(Button) findViewById(R.id.button21);
        online_Buttone=(Button) findViewById(R.id.class_Time_Online);


    }


    public void c6th1mClicked(View view) {

        class6th1m.setVisibility(View.VISIBLE);
        live.setVisibility(View.GONE);


    }
    public void OnlineClassTimeClicked(View view) {

        class6th1m.setVisibility(View.GONE);
        live.setVisibility(View.VISIBLE);
    }
}