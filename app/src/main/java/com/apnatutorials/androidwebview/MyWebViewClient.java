package com.apnatutorials.androidwebview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * Created by Angel on 9/15/2016.
 */
public class MyWebViewClient extends WebViewClient {
//    @Override
//    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
//        WebView.HitTestResult result = view.getHitTestResult();
//        String data = result.getExtra();
//
//        Context context = view.getContext();
//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
//        context.startActivity(browserIntent);
//        return false;
//    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("apnatutorials.com")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }

}

