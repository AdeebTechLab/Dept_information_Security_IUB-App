package com.AdeebTechLab.BsISClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton  b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, wts;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.Button1);
        b2 = findViewById(R.id.Button2);
        b3 = findViewById(R.id.Button3);
        b4 = findViewById(R.id.Button4);
        b5 = findViewById(R.id.Button5);
        b6 = findViewById(R.id.Button6);
        b7 = findViewById(R.id.Button7);
        b8 = findViewById(R.id.Button8);
        b9 = findViewById(R.id.Button9);
        b10 = findViewById(R.id.Button10);
        b11 = findViewById(R.id.Button11);
        b12 = findViewById(R.id.Button12);
        b13 = findViewById(R.id.Button13);
        b14 = findViewById(R.id.Button14);
        wts = findViewById(R.id.wh);




        //Button------------------------------------------------------------

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DaliyUpdate.class);
                startActivity(intent);

            }
        });


        //Button------------------------------------------------------------

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudyPlan.class);
                startActivity(intent);

            }
        });

        //Button------------------------------------------------------------


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBookList.class);
                startActivity(intent);

            }
        });


        //Button------------------------------------------------------------


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClassTimeTable.class);
                startActivity(intent);

            }
        });


        //Button------------------------------------------------------------



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExamsDateSheet.class);
                startActivity(intent);

            }
        });

        //Button------------------------------------------------------------



        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BusTimeTable.class);
                startActivity(intent);

            }
        });


        //Button------------------------------------------------------------



        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComingSoon.class);
                startActivity(intent);

            }
        });


        //Button------------------------------------------------------------



        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CrsDetals.class);
                startActivity(intent);

            }
        });




        //Button------------------------------------------------------------



        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllTechers.class);
                startActivity(intent);

            }
        });





        //Button------------------------------------------------------------



        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DepartmentInfo.class);
                startActivity(intent);

            }
        });




        //Button------------------------------------------------------------



        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Club.class);
                startActivity(intent);

            }
        });




        //Button------------------------------------------------------------

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://web.facebook.com/DISIUB";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //Button------------------------------------------------------------

        wts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://whatsapp.com/channel/0029Va8Vbuv59PwTB7erwy2z";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });




        //Button------------------------------------------------------------

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/@BSCyberSecurityIUB";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        //Button------------------------------------------------------------

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://information-sekurity.blogspot.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }


}