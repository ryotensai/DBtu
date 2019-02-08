package com.example.a172119.dbtu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PHPres extends AppCompatActivity {

    String url =  "http://morinozoo.php.xdomain.jp/imgUploader.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_phpres);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AsyncHttpRequest(PHPres.this).execute("http://morinozoo.php.xdomain.jp/imgUploader.php");
            }
        });
    }
}