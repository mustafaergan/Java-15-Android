package com.example.mustafa_2.deneme;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void calistir(View eventListener){

        AlertDialog.Builder dlg = new AlertDialog.Builder(this, android.R.style.Theme_Holo_Dialog);
        dlg.setTitle(this.getIntent().getStringExtra("merhaba"));
        dlg.setMessage("mer");
        dlg.setIcon(R.drawable.ab);


        dlg.setPositiveButton("Git", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Login.this, "Selama", Toast.LENGTH_SHORT).show();

                Intent git = new Intent(Login.this, Main3Activity.class);

                startActivity(git);
            }
        });

        dlg.setNegativeButton("Negatif", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Login.this, "Merhaba", Toast.LENGTH_SHORT).show();
            }
        });

        dlg.show();

    }

}
