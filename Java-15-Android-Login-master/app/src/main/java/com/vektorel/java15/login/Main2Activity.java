package com.vektorel.java15.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String deger = getIntent()
                .getExtras().get("name").toString();

        TextView textView = (TextView) findViewById(R.id.tVGoster);

        textView.setText("Hoşgeldin "+deger);
    }
}
