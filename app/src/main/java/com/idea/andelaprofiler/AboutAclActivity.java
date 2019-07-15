package com.idea.andelaprofiler;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URI;
import java.net.URL;

public class AboutAclActivity extends AppCompatActivity {
    WebView aclWebView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_acl);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        aclWebView = findViewById(R.id.abtAcl);
        aclWebView.setWebViewClient(new WebViewClient());
        aclWebView.getSettings().setJavaScriptEnabled(true);
        aclWebView.loadUrl("https://andela.com/alc/");
    }

}
