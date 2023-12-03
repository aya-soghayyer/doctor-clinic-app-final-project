package com.example.doctorclinicappfinalproject;
// Aya Soghayyer 22110886
// Aseel Al ashqar 22110533
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.GridView;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//
//public class showdata extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_showdata);
//        GridView grid = (GridView) findViewById(R.id.gridView);
//        ArrayList<String> courses = new ArrayList<>();
//
//
//        //Adapter
//          ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,courses);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
//        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(showdata.this, grid.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
//
//            }
//        });
//    }
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(this, "Good Bye Doctor ! :) ", Toast.LENGTH_SHORT).show();
//
//    }
//
//}
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;


import java.util.ArrayList;


public class showdata extends AppCompatActivity {


    DBHelper helper ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);


        //helper
        helper = new DBHelper(this);


        ListView listView = (ListView) findViewById(R.id.list);


        //Data Source

        ArrayList<String> database = new ArrayList<String>();


        database.add(helper.getData());



        //Adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,database);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);


        listView.setAdapter(arrayAdapter);














    }
}
