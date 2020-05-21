package com.example.elderlyhealthmanagmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class signin extends AppCompatActivity {
    EditText _txtUserLogin,_txtPassLogin;
    Button _btnLogin;
    ImageButton _back;
    Spinner _spnType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        _txtPassLogin=(EditText)findViewById(R.id.txtpasslogin);
        _txtUserLogin=(EditText)findViewById(R.id.txtuserlogin);
        _btnLogin=(Button)findViewById(R.id.btnlogin);
        _back=(ImageButton)findViewById(R.id.btnback);

        ArrayList<String> Strings = new ArrayList<String>();
        Strings.add("Select User Type");
        Strings.add("Family User");
        Strings.add("Therapist");
        Strings.add("Elderly");

        _spnType= (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Strings);
        _spnType.setAdapter(arrayAdapter);


        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=  new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });




        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_spnType.getSelectedItem().toString().equals("Therapist")) {

                    Intent intent = new Intent(v.getContext(),Therapist.class);
                    startActivity(intent);
                }else if(_spnType.getSelectedItem().toString().equals("Elderly"))
                {
                    Intent intent = new Intent(v.getContext(),ElderlyActivity.class);
                    startActivity(intent);
                }
                else if (_spnType.getSelectedItem().toString().equals("Family User"))
                {
                    Intent intent = new Intent(v.getContext(),FamilyActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast toast = Toast.makeText(v.getContext(),"Please Select Type!", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

    }
}
