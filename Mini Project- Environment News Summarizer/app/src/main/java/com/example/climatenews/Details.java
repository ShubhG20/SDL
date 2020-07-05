package com.example.climatenews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textView= findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("param"));


       webView= (WebView)findViewById(R.id.webView);
       webView.setWebViewClient(new WebViewClient());
       webView.getSettings().setJavaScriptEnabled(true);
       webView.getSettings().setDomStorageEnabled(true);
       webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
       webView.loadUrl(getIntent().getStringExtra("param"));

    }
}
