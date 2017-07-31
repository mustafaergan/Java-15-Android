package com.vektorel.java15.kutuphane;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vektorel on 22.01.2017.
 */
public class MyDb  extends SQLiteOpenHelper{

    static int DB_VERSION = 2;
    static String DB_NAME = "VEKTOREL";
    static String TABLE_NAME = "UYE";
    static String FIELD_TABLE_ID = "ID";
    static String FIELD_TABLE_NAME = "NAME";


    public MyDb(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL = "CREATE TABLE "+ TABLE_NAME
                +"( "+ FIELD_TABLE_ID +" integer primary key,"
                +" "+FIELD_TABLE_NAME + " TEXT)";


        db.execSQL(SQL);
    }

    public void kisiEkle(int i , String name){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(FIELD_TABLE_ID,i);
        contentValues.put(FIELD_TABLE_NAME,name);

        db.insert(TABLE_NAME,null,contentValues);
    }

    public List<PersonEntity> getKisiler(){

        List<PersonEntity> personEntities = new ArrayList<PersonEntity>();

        String SQL = "SELECT * FROM "+TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(SQL,null);


        while(cursor.moveToNext()){
            PersonEntity person = new PersonEntity();
            person.setId(cursor.getInt(0));
            person.setName(cursor.getString(1));

            personEntities.add(person);
        }
        return personEntities;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
