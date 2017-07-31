package com.vektorel.java15.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void giris(View view){

        PersonEntity personEntity = new PersonEntity();

        EditText eTUserName = (EditText) findViewById(R.id.eTUserName);

        EditText eTPass = (EditText) findViewById(R.id.eTPass);

        if(eTUserName.getText().toString().equals(personEntity.getUserName())){

            if(eTPass.getText().toString().equals(personEntity.getPassworld())){
                Intent inIntent = new Intent(MainActivity.this,Main2Activity.class);
                inIntent.putExtra("name",personEntity.getName());
                startActivity(inIntent);

            }else
                Toast.makeText(MainActivity.this, "Şifre Hatalı", Toast.LENGTH_SHORT).show();

        }else
            Toast.makeText(MainActivity.this, "Kullanıcı Adı Hatalı", Toast.LENGTH_SHORT).show();


    }
}
