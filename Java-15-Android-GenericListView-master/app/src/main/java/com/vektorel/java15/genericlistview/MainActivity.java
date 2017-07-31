package com.vektorel.java15.genericlistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    List<Person> personList = new ArrayList<Person>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personList.add(new Person("Mustafa","+90553"));
        personList.add(new Person("Ahmet","+90554"));

        ListView listView = (ListView) findViewById(R.id.listViewPerson);

        BenimAdaptor benimAdaptor = new BenimAdaptor(MainActivity.this,personList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        personList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
