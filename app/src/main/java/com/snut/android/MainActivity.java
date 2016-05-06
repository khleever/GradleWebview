package com.snut.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	private Button button, button2;

	public void onCreate(Bundle savedInstanceState) {
		final Context context = this;

		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		button = (Button) findViewById(R.id.buttonUrl);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, WebViewActivity.class);
				intent.putExtra("url", "http://www.google.com");
				startActivity(intent);
			}
		});

		button2 = (Button) findViewById(R.id.buttonUrl2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, WebViewActivity.class);
				intent.putExtra("url", "http://www.naver.com");
				startActivity(intent);
			}
		});

	}
}