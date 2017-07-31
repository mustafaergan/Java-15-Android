package com.vektorel.java15.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webViewVektorel =
                (WebView)findViewById(R.id.webViewVektorel);

        webViewVektorel.loadUrl("https://www.google.com");

        webViewVektorel.setWebViewClient(new WebViewClient());

        webViewVektorel.getSettings().setJavaScriptEnabled(true);

        EditText editTextAra = (EditText)findViewById(R.id.editTextAra);
        Button buttonBul = (Button)findViewById(R.id.buttonBul);


        buttonBul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
