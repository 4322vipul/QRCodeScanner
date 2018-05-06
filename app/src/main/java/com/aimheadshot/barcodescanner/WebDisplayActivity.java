package com.aimheadshot.barcodescanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;

public class WebDisplayActivity extends AppCompatActivity {

    private Bundle Extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_display);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Extras=getIntent().getExtras();
        if(Extras!=null) {
            WebView webView = new WebView(this);
            setContentView(webView);
            webView.loadUrl(String.valueOf(Extras));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(WebDisplayActivity.this,MainActivity.class));
        finish();
    }
}
