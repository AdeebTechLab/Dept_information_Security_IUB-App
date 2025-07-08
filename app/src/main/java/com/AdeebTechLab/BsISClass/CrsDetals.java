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

public class CrsDetals extends AppCompatActivity {



    private WebView web;



    Button CruntCr;

    LinearLayout live_crs, crs_dp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crs_detals);


        web= (android.webkit.WebView) findViewById(R.id.Web_Crs);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://www.informationsecurityiub.ezyro.com/crs");


        WebSettings mywebsettings = web.getSettings();
        mywebsettings.setJavaScriptEnabled(true);





//--------------LinearLayout---------------
        live_crs=(LinearLayout) findViewById(R.id.Live_Crs);
        crs_dp=(LinearLayout) findViewById(R.id.Crs_dp);



//-------------Button---------
        CruntCr=(Button) findViewById(R.id.Crunt_crs_butoon);

    }


    public void CruntcrsClicked(View view)
    {
        live_crs.setVisibility(View.VISIBLE);
        crs_dp.setVisibility(View.GONE);
    }
}