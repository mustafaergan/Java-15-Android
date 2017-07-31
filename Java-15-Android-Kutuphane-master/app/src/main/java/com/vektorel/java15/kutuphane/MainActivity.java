package com.vektorel.java15.kutuphane;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    int sayac = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyDb db = new MyDb(getApplicationContext());

        Button button = (Button) findViewById(R.id.bTEkle);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sayac ++;

                EditText editText = (EditText) findViewById(R.id.eTVeri);

                db.kisiEkle(sayac,editText.getText().toString());

                List<PersonEntity> entity = db.getKisiler();

                String isimler = "";
                for(int i = 0; i<entity.size() ; i++){
                    PersonEntity en = entity.get(i);
                    isimler +=" "+ en.getName();
                }

                TextView tv = (TextView) findViewById(R.id.tVGoruntule);

                tv.setText(isimler.toString());

            }
        });


    }
}
