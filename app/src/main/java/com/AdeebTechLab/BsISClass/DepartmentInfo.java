package com.AdeebTechLab.BsISClass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DepartmentInfo extends AppCompatActivity {

    private WebView web;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_info);



        web= (android.webkit.WebView) findViewById(R.id.website1);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("file:///android_asset/depaartment_bsis.html");
    }
}