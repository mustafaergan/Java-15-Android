package com.example.mustafa_2.deneme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
        R.array.spin_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String ss = spinner.getItemAtPosition(position).toString();

                Main3Activity.this.setTitle(ss);

                bindList(ss);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    private void bindList(String ss) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ver");
        list.add(ss);


        ArrayAdapter<String> adapter = new ArrayAdapter
                (this,android.R.layout.simple_list_item_1,android.R.id.text1,list);

        ListView ls = (ListView)findViewById(R.id.listView);

        ls.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.deneme, menu);
        return true;
    }

    public void den(MenuItem menuItem){
        Toast.makeText(this, "menu", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //item.getItemId() == R.id.denn
        return super.onOptionsItemSelected(item);
    }
}
