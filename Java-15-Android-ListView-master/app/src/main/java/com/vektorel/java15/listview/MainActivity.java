package com.vektorel.java15.listview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String[] kisiList = {"Mustafa","Masallah","Ahmet","Emre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewKisiler = (ListView) findViewById(R.id.listViewKisiler);
        final EditText editTextBulucu = (EditText)findViewById(R.id.editTextBulucu);
        Button buttonBul = (Button) findViewById(R.id.buttonBul);


        final ArrayAdapter<String> arrayAdapterKisiList =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,kisiList);


        listViewKisiler.setAdapter(arrayAdapterKisiList);

        listViewKisiler.setOnItemClickListener
                (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick
                    (AdapterView<?> parent, View view,
                     int position, long id) {

                AlertDialog.Builder alertMesaj =
                        new AlertDialog.Builder(MainActivity.this);

                alertMesaj.setMessage(kisiList[position]);

                alertMesaj.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Yes basıldı", Toast.LENGTH_SHORT).show();
                    }
                });

                alertMesaj.create().show();

            }
        });


        buttonBul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ara = editTextBulucu.getText().toString();
                arrayAdapterKisiList.getFilter().filter(ara);
            }
        });

        editTextBulucu.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                arrayAdapterKisiList.getFilter().filter(
                        editTextBulucu.getText().toString()
                );

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
