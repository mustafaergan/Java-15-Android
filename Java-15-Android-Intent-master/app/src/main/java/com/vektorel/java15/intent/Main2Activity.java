package com.vektorel.java15.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String deger =
//        getIntent().getExtras().get("mustafa").toString();
        getIntent().getExtras().get("editText").toString();

        TextView textView =
                (TextView) findViewById(R.id.tVIkinci);

        textView.setText(deger);

    }
}
