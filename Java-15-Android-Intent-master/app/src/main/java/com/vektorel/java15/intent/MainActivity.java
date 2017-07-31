package com.vektorel.java15.intent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = (Button) findViewById(R.id.btGecis);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("mustafa", "vektorel");
//                startActivity(intent);
//            }
//        });

    }


    public void gonder(View view){

        EditText editText =
                (EditText) findViewById(R.id.eTVeriGonder);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("editText", editText.getText().toString());
        startActivity(intent);
    }

}