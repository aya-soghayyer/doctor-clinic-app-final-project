package com.example.doctorclinicappfinalproject;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//import java.util.jar.Attributes;
//
//public class DBHelper {
//
//
//    theHelper helper;
//
//
//    public DBHelper(Context context) {
//        helper = new theHelper(context);
//
//    }
//
//
//    //Insert data into DB Table
//    public long insertData(String data1, String data2 , String data3) {
//        SQLiteDatabase dbb = helper.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(theHelper.name, data1);
//        contentValues.put(theHelper.age, data2);
//        contentValues.put(theHelper.sex, data3);
//        return dbb.insert(theHelper.THE_TABLE, null, contentValues);
//    }
//
//
//    public ArrayList<String> getData() {
//        SQLiteDatabase dbb = helper.getWritableDatabase();
//        String[] Columns = {theHelper.name, theHelper.age, theHelper.sex};
//        Cursor cursor = dbb.query(theHelper.THE_TABLE, Columns ,null , null, null, null
//                , null);
//
//        ArrayList<String> arrayList = new ArrayList<String>();
//        while (cursor.moveToNext() ){
////            int uid = cursor.getInt(cursor.getColumnIndex(theHelper.UID);
//            String Name= cursor.getString(cursor.getColumnIndex(theHelper.name));
//            String Age= cursor.getString(cursor.getColumnIndex(theHelper.age));
//            String Sex= cursor.getString(cursor.getColumnIndex(theHelper.sex));
//
//            //2
//            arrayList.add(Name + " " +Age + " "+ Sex);
//        }
//        //1    return buffer.toString() ;
//        //2
//        return arrayList;
//    }
//
//
//
//    static class theHelper extends SQLiteOpenHelper {
//        private static final String DATABASE_NAME = "Clinic";
//        private static final String THE_TABLE = "Patients";
//        private static final int DATABASE_Version = 1;
//        private static final String uid = "id";
//        private static final String name = "PatientName";
//        private static final String age = "PatientAge ";
//        private static final String sex = "Gender";
//
//        private static final String CREATE_TABLE = "CREATE TABLE " + THE_TABLE +
//                " ( " + uid + " INTEGER PRIMARY KEY AUTOINCREMENT ," + name + " VARCHAR(255) , " + age + " VARCHAR(255) , " + sex + " VARCHAR(225));";
//
//
//        private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + THE_TABLE;
//        private Context context;
//
//
//        public theHelper(Context context) {
//            super(context, DATABASE_NAME, null, DATABASE_Version);
//            this.context = context;
//        }
//
//
//        public void onCreate(SQLiteDatabase db) {
//            try {
//                db.execSQL(CREATE_TABLE);
//            } catch (Exception e) {
//                Toaster.toastdata(context, "" + e);
//            }
//        }
//
//
//        @Override
//        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//            try {
//                Toaster.toastdata(context, "OnUpgrade");
//                db.execSQL(DROP_TABLE);
//                onCreate(db);
//            } catch (Exception e) {
//                Toaster.toastdata(context, "" + e);
//            }
//        }
//    }
//
//
//    public int remove (String data)
//    {
//        SQLiteDatabase dbb = helper.getWritableDatabase();
//        String[] whereArgs = {data};
//        return dbb.delete(theHelper.THE_TABLE, theHelper.name + " = ?", whereArgs); // we want table name, whereStatement , where args // ? => input value
//    }
//
//
//    public static class Toaster
//    {
//        public static void toastdata(Context context , String msg)
//        {
//            Toast.makeText(context , msg , Toast.LENGTH_LONG).show();
//            // alert dialog code
//        }
//    }
//
//
//
//
//
//
//}
//


import android.database.Cursor;
import android.os.Bundle;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


import java.lang.reflect.Array;
import java.net.ConnectException;
import java.util.ArrayList;


//A class to Control Data BASE
public class DBHelper {
    theHelper helper;


    public DBHelper(Context context) {
        helper = new theHelper(context);
    }


    //Insert data into DB Table
    public long insertData(String name1, String age1, String sex1) {
        SQLiteDatabase dbb = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(theHelper.nameDB, name1);
        contentValues.put(theHelper.ageDB, age1);
        contentValues.put(theHelper.sexDB, sex1);
        return dbb.insert(theHelper.THE_TABLE, null, contentValues);
    }


    public String getData() {
        SQLiteDatabase dbb = helper.getWritableDatabase();
        String[] columns = {theHelper.nameDB, theHelper.ageDB, theHelper.sexDB};
        Cursor cursor = dbb.query(theHelper.THE_TABLE, columns, null, null, null, null, null);
        StringBuilder buffer = new StringBuilder();
//        ArrayList<String> arrayList = null;
        while (cursor.moveToNext()) {
            String name = cursor.getString(cursor.getColumnIndex(theHelper.nameDB));
            String age = cursor.getString(cursor.getColumnIndex(theHelper.ageDB));
            String sex = cursor.getString(cursor.getColumnIndex(theHelper.sexDB));
//            arrayList = new ArrayList<String>();
//            arrayList.add("Patient name: " + name + " \n Age: " + age + " \n Gender: " + sex);
            buffer.append(" \n Patient name: " + name + " \n Age: " + age + " \n Gender: " + sex + " \n" + "-------------------------------------" );
        }
        return buffer.toString();
    }


    static class theHelper extends SQLiteOpenHelper {
        private static final String DATABASE_NAME = "DOCTOR CLINIC";
        private static final String THE_TABLE = "patientsInformation";
        private static final int DATABASE_Version = 1;
        private static final String nameDB = "name1";
        private static final String ageDB = "age1";
        private static final String sexDB = "sex1";
        private static final String CREATE_TABLE = "CREATE TABLE " + THE_TABLE +
                " (" + nameDB + " VARCHAR(255) ," + ageDB + " INTEGER ," + sexDB + " VARCHAR(225));";
        private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + THE_TABLE;
        private Context context;


        public theHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
            this.context = context;
        }


        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(CREATE_TABLE);
            } catch (Exception e) {
                Toaster.toastdata(context, "" + e);
            }
        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                Toaster.toastdata(context, "OnUpgrade");
                db.execSQL(DROP_TABLE);
                onCreate(db);
            } catch (Exception e) {
                Toaster.toastdata(context, "" + e);
            }
        }
    }


//    public int remove (String data)
//    {
//        SQLiteDatabase dbb = helper.getWritableDatabase();
//        String[] whereArgs = {data};
//        return dbb.delete(theHelper.THE_TABLE, theHelper.nameDB + " = ?", whereArgs); // we want table name, whereStatement , where args // ? => input value
//    }


    public static class Toaster {
        public static void toastdata(Context context, String msg) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
            // alert dialog code
        }
    }
}
