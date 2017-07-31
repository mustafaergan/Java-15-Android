package com.vektorel.java15.webviewtekrar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView wVTarayici = (WebView)findViewById(R.id.wVTarayici);

        wVTarayici.setWebViewClient(new WebViewClient());

        wVTarayici.loadUrl("https://www.google.com");

        Button button = (Button) findViewById(R.id.btBulucu);

        Toast.makeText(MainActivity.this, "merhaba", Toast.LENGTH_SHORT).show();

        final EditText eTArayici = (EditText) findViewById(R.id.eTArayici);

//        eTArayici.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//                wVTarayici.loadUrl("https://twitter.com/search?q="+s.toString());
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkBox = (CheckBox) findViewById(R.id.cbKontrol);
                if(checkBox.isChecked()){
                    wVTarayici.loadUrl("https://twitter.com/search?q="+eTArayici.getText().toString());
                }else{
                    Toast.makeText(MainActivity.this, "dogrulanamadı", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }

//    public void arayici(View view){
//        EditText eTArayici = (EditText) findViewById(R.id.eTArayici);
//
//        String gelenVeri = eTArayici.getText().toString();
//
//        this.wVTarayici.loadUrl("https://"+gelenVeri);
//
//    }
}
