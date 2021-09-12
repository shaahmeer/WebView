package com.example.ppimoskow;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    String url="http://www.google.com";

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            wv=(WebView)findViewById(R.id.myweb);



            WebSettings webSettings = wv.getSettings();
            wv.getSettings().setLoadWithOverviewMode(true);
            wv.getSettings().setUseWideViewPort(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.getSettings().setBuiltInZoomControls(true);
            wv.getSettings().setBuiltInZoomControls(true);
            wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        wv.getSettings().setMediaPlaybackRequiresUserGesture(true);

            wv.setWebViewClient(new myWebClient());

            wv.loadUrl(url);

        }



    public class myWebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }
    }

    @SuppressWarnings("deprecation")

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return true;
    }

    @TargetApi(Build.VERSION_CODES.N)

    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return true;
    }


}