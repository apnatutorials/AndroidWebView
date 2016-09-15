package com.apnatutorials.androidwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView myWebView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView)findViewById(R.id.myWebView) ;

        // Enable Javascript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // To handle navigation window


        myWebView.setWebViewClient(new MyWebViewClient());
        // load remote url
        myWebView.loadUrl("http://apnatutorials.com/");
    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
