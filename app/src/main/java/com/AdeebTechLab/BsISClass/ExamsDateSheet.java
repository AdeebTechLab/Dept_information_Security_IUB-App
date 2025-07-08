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
import android.widget.ProgressBar;

public class ExamsDateSheet extends AppCompatActivity {

    private WebView web1,web2,web3, WebLive;



    Button mb, fb, pb;

    LinearLayout mid, fineal, paper;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams_date_sheet);



        WebLive= (android.webkit.WebView) findViewById(R.id.WebLive);
        WebLive.setWebViewClient(new WebViewClient());
        WebLive.loadUrl("https://drive.google.com/drive/folders/1guyOuZYvUJIIY4hA3Q-e4-Ofq7KPsx__?usp=sharing");



        WebSettings mywebsettings = WebLive.getSettings();
        mywebsettings.setJavaScriptEnabled(true);



        web1= (android.webkit.WebView) findViewById(R.id.website1);
        web1.setWebViewClient(new WebViewClient());
        web1.loadUrl("file:///android_asset/datesheet_mid_term_exams.html");


        web2= (android.webkit.WebView) findViewById(R.id.website2);
        web2.setWebViewClient(new WebViewClient());
        web2.loadUrl("file:///android_asset/datesheet_final_term_exams.html");


        web3= (android.webkit.WebView) findViewById(R.id.website3);
        web3.setWebViewClient(new WebViewClient());
        web3.loadUrl("file:///android_asset/paper_pattern_final_exams.html");








//--------------LinearLayout---------------
        mid=(LinearLayout) findViewById(R.id.Mid);
        fineal=(LinearLayout) findViewById(R.id.Finel);
        paper=(LinearLayout) findViewById(R.id.Paper);


//-------------Button---------
        mb=(Button) findViewById(R.id.midE);
        fb=(Button) findViewById(R.id.finalE);
        pb=(Button) findViewById(R.id.paperP);

    }

    public void mbClicked(View view)
    {
        mid.setVisibility(View.VISIBLE);
        fineal.setVisibility(View.GONE);
        paper.setVisibility(View.GONE);
    }


    public void fbClicked(View view)
    {
        mid.setVisibility(View.GONE);
        fineal.setVisibility(View.VISIBLE);
        paper.setVisibility(View.GONE);
    }


    public void pbClicked(View view)
    {
        mid.setVisibility(View.GONE);
        fineal.setVisibility(View.GONE);
        paper.setVisibility(View.VISIBLE);
    }


}