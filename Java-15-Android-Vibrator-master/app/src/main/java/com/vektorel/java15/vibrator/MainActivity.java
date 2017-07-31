package com.vektorel.java15.vibrator;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        vib.vibrate(500);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mymenu,menu);
        return true;
    }

    public void deneme1(MenuItem view){
        Toast.makeText(MainActivity.this, "deneme1", Toast.LENGTH_SHORT).show();
    }

    public void deneme2(MenuItem view){
        Toast.makeText(MainActivity.this, "deneme2", Toast.LENGTH_SHORT).show();
    }
}
