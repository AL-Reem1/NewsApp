package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import  android.widget.Button;
import android.webkit.WebViewClient;

public class SecondPage extends AppCompatActivity {
    private WebView webView;
    Button btn_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       btn_one=findViewById(R.id.btn_second_page_sport);

       btn_one.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                         }
       });
    }


}