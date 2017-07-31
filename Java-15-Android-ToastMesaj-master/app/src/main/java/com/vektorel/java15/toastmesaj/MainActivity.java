package com.vektorel.java15.toastmesaj;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    /*
    * Toast Mesaj çalıştırmak istiyorum
     * saved context ilgili bilgilermi tutar
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("**Bilgi","Oncreate Çalişti Mustafa Hoca sistemde");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_LONG).show();
        Button makeToast = (Button) findViewById(R.id.button);

        final EditText editText =(EditText) findViewById(R.id.editText) ;


        makeToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_LONG).show();

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

                alert.setMessage(editText.getText().toString()).setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Hayır Basıldı", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });

                alert.create().show();
            }
        });




    }
}
