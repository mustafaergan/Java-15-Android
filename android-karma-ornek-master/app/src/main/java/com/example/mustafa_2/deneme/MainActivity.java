package com.example.mustafa_2.deneme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calistir(View eventListener){
        System.out.println("merhaba");

        Intent intIntent = new Intent(this,Login.class);

        intIntent.putExtra("merhaba","mustafa");

        this.startActivity(intIntent);
    }
}
