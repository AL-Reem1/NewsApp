package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class Newspage extends AppCompatActivity {
public   WebView webView;

    Button cook;
    Button sports;
    Button politics;
    Button health;
    Button arts;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newspage);
        cook=findViewById(R.id.cook);

        cook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView=(WebView) findViewById(R.id.wv_newspage_webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://cooking.nytimes.com/");

            }
        });

        sports=findViewById(R.id.sports);

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView=(WebView) findViewById(R.id.wv_newspage_webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.nytimes.com/international/section/sports");

            }
        });
        politics=findViewById(R.id.politics);

        politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView=(WebView) findViewById(R.id.wv_newspage_webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.nytimes.com/international/section/politics");

            }
        });

        health=findViewById(R.id.health);

        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView=(WebView) findViewById(R.id.wv_newspage_webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.nytimes.com/international/section/health");


            }
        });
        arts =findViewById(R.id.arts );

        arts .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView=(WebView) findViewById(R.id.wv_newspage_webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.nytimes.com/international/section/arts");

            }
        });



    }
}