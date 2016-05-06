package com.snut.android;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.Intent;

public class WebViewActivity extends Activity {

	private WebView webView;
	private WebViewClient wbc = new WebViewClient();

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		webView = (WebView) findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setWebViewClient(wbc);
		Intent intent = getIntent();
    String target = intent.getStringExtra("url");
    webView.loadUrl(target);
	}
}