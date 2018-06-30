package com.example.egypt2.graduationproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        String BASE_URL = "http://192.168.1.145:1234/gp/src/index.js";

        webView = (WebView) findViewById( R.id.WebView );

        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setAppCacheEnabled(true);

        webView.loadUrl(BASE_URL);





    }
}
