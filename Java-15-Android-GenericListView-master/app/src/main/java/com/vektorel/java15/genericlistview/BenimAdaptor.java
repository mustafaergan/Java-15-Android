package com.vektorel.java15.genericlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vektorel on 08.01.2017.
 */
public class BenimAdaptor extends BaseAdapter {

    private LayoutInflater layoutInflater;
    List<Person> personList;

    public BenimAdaptor(Activity activity, List<Person> personList) {
        this.layoutInflater = (LayoutInflater)
                activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.personList = personList;
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View myView;

        myView = layoutInflater.inflate(R.layout.list_person,null);

        TextView textViewName =
                (TextView) myView.findViewById(R.id.textViewName);

        TextView textViewNumber =
                (TextView) myView.findViewById(R.id.textViewNumber);

        Person person = this.personList.get(position);

        textViewName.setText(person.getName());

        textViewNumber.setText(person.getNumber());

        return myView;
    }
}
