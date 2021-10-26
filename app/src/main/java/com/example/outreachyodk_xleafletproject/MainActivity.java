package com.example.outreachyodk_xleafletproject;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "file:///android_asset/my_file.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setTitle(R.string.toolbar_title);
        WebView myWebView = findViewById(R.id.custom_web_view);
        myWebView.loadUrl(URL);

    }
}