package com.example.doctorclinicappfinalproject;

//import static com.example.doctorclinicappfinalproject.R.id.radioButtonMale;
//
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//
//
//
//
//import android.os.Bundle;
//import android.widget.Spinner;
//import android.widget.Toast;
//
///*
//
//
//import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.Checkable;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.Toast;
//*/
//
//
//public class MainActivity extends AppCompatActivity {
//    DBHelper helper ;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //Edit Texts
//        EditText name = (EditText) findViewById(R.id.nameText);
//        EditText age = (EditText) findViewById(R.id.ageText);
//        helper = new DBHelper(this);
//
//        //Radio buttons
//        RadioGroup RG = (RadioGroup) findViewById(R.id.radioGroup);
//        RadioButton rButtonFemale = (RadioButton) findViewById(R.id.radioButtonFemale);
//        RadioButton rButtonMale = (RadioButton)findViewById(radioButtonMale);
//
//        //Buttons
//        Button save = (Button) findViewById(R.id.savaButton);
//        Button urgent = (Button) findViewById(R.id.urgentButton);
//        Button view = (Button) findViewById(R.id.viewButton);
//
//        //spinner
//        Spinner symptSpinner= (Spinner) findViewById(R.id.spinnerSymptoms);
//
//
//        //Start RadioGroup
//        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                if (rButtonFemale.isChecked() ){
//                    sex = "Female";
//                } else if (rButtonMale.isChecked()) {
//                    sex= "Male";
//                }
//            }
//        });
//        //End RadioGroup
//
//
//        //spinner operations
//        //Data Source
//        String[] symptoms ={"Fever","Cough","Headache"};
//        //Adapter - Array Adapter (Brigde)
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,symptoms);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        symptSpinner.setAdapter(arrayAdapter);
//        symptSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            // i = position in Array courses[i]
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                switch (i){
//                    case 0:
//                       sympt = "Fever";
//                        break;
//                    case 1:
//                        sympt = "Cough";
//                        break;
//                    case 2:
//                        sympt = "Headache";
//                        break;
//                    default:
//                        Toast.makeText(MainActivity.this, symptoms[i].toString(), Toast.LENGTH_SHORT).show();
//                }
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//        });
//
//
//// save Button operations
//        save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//              //  Intent x = new Intent(MainActivity.this, showdata.class);
//                // name , age, sex
////                x.putExtra("name", name.toString());
////                x.putExtra("age", age.toString());
////                x.putExtra("sex", sex);
//                //spinner symptoms
//
//                if (name.getText().toString().isEmpty() || age.getText().toString().isEmpty() ){
//                    Toast.makeText(MainActivity.this, "Oh no! you forget to fill name box or age box :( ", Toast.LENGTH_LONG).show();
//                }
//                else {
//                Toast.makeText(MainActivity.this, "Patient saved", Toast.LENGTH_LONG).show();
//
////                startActivity(x);
//            }
//            }
//
//
//        });
//
////urgent button
//        urgent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
//                alertdialog.setTitle("Is Urgent?");
//                alertdialog.setMessage("The patient case is urgent!");
//
//                if (sympt == "Fever") {
//                    alertdialog.setIcon(R.drawable.urgent_icon);
////                alertdialog.setCancelable(false);
//
//                    alertdialog.setPositiveButton("Send to hospital!", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            Toast.makeText(MainActivity.this, "Send it to the hospital right now!", Toast.LENGTH_SHORT).show();
//                        }
//
//
//                    });
//                }
//                alertdialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "Relax", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                AlertDialog alertd = alertdialog.create();
//                alertd.show();
//            }
//        });
//
//
//        // view Button operations
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Patient view", Toast.LENGTH_LONG).show();
//                Intent y = new Intent(MainActivity.this, showdata.class);
//                startActivity(y);
//            }
//        });
//
//
//
//
//
//
//
//
//    }
//
//
//    String sex;
//    String sympt;
//}
////



import static com.example.doctorclinicappfinalproject.R.id.radioButtonMale;




import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;






import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    DBHelper helper ;
    EditText name;
    EditText age;
    String sex;
    String sympt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //Edit Texts
        name = (EditText) findViewById(R.id.nameText);
        age = (EditText) findViewById(R.id.ageText);




        //Radio buttons
        RadioGroup RG = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton rButtonFemale = (RadioButton) findViewById(R.id.radioButtonFemale);
        RadioButton rButtonMale = (RadioButton)findViewById(radioButtonMale);




        //Buttons
        Button save = (Button) findViewById(R.id.savaButton);
        Button urgent = (Button) findViewById(R.id.urgentButton);
        Button view = (Button) findViewById(R.id.viewButton);




        //spinner
        Spinner symptSpinner= (Spinner) findViewById(R.id.spinnerSymptoms);


        //helper
        helper = new DBHelper(this);






        //Start RadioGroup
        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (rButtonFemale.isChecked() ){
                    sex = "Female";
                } else if (rButtonMale.isChecked()) {
                    sex= "Male";
                }
            }
        });
        //End RadioGroup
        //spinner operations
        //Data Source
        String[] symptoms ={"Fever","Cough","Headache"};
        //Adapter - Array Adapter (Brigde)
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,symptoms);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        symptSpinner.setAdapter(arrayAdapter);
        symptSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            // i = position in Array courses[i]
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        sympt = "Fever";
                        break;
                    case 1:
                        sympt = "Cough";
                        break;
                    case 2:
                        sympt = "Headache";
                        break;
                    default:
                        Toast.makeText(MainActivity.this, symptoms[i].toString(), Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });








// save Button operations
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                helper.insertData(name.getText().toString(), age.getText().toString(), sex);
//                Intent x = new Intent(MainActivity.this, showdata.class);
                // name , age, sex
//                x.putExtra("name1", name.getText().toString());
//                x.putExtra("age1", age.getText());
//                x.putExtra("sex1", sex);
//               startActivity(x);


                if (name.getText().toString().isEmpty() || age.getText().toString().isEmpty() )
                {
                    DBHelper.Toaster.toastdata(getApplicationContext() , "Oh no! you forget to fill name box or age box :( ");
                }


                else // we should add new data
                {
                    long count = helper.insertData(name.getText().toString(), age.getText().toString(), sex);// return -1(error in datatype) , 0(error in sql statement) , 1(success)
                    if ( count<=0)
                    {
                        DBHelper.Toaster.toastdata(getApplicationContext() , "Error");
                    }
                    else
                    {
                        DBHelper.Toaster.toastdata(getApplicationContext() , "Patient saved");
                        name.setText(""); // delete the data to add new data
                        age.setText("");
                    }
                }






                if (name.getText().toString().isEmpty() || age.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Oh no! you forget to fill name box or age box :( ", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Patient saved", Toast.LENGTH_LONG).show();
//                startActivity(x);
                }
            }


        });


//urgent button
        urgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
                alertdialog.setTitle("Is Urgent?");






                if (sympt == "Fever")
                {
                    alertdialog.setIcon(R.drawable.urgent_icon);
//                  alertdialog.setCancelable(false);
                    alertdialog.setMessage("The patient case is urgent!");


                    alertdialog.setPositiveButton("Send to hospital!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "Send it to the hospital right now!", Toast.LENGTH_SHORT).show();
                        }








                    });
                }


                alertdialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertdialog.setMessage("The patient case not is urgent ");


                        Toast.makeText(MainActivity.this, "Relax", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertd = alertdialog.create();
                alertd.show();
            }
        });


// view Button operations
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Patient view", Toast.LENGTH_LONG).show();
                Intent y = new Intent(MainActivity.this, showdata.class);
                startActivity(y);
            }
        });

    }














}





