package com.example.elderlyhealthmanagmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class register extends AppCompatActivity {

   ImageButton _btnback;
     Spinner _regspntype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        _btnback=(ImageButton)findViewById(R.id.btnregback);
        _regspntype= (Spinner)findViewById(R.id.spinner2);

        ArrayList<String> Strings = new ArrayList<String>();
        Strings.add("Select User Type");
        Strings.add("Family User");
        Strings.add("Therapist");
        Strings.add("Elderly");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Strings);
        _regspntype.setAdapter(arrayAdapter);


        _btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);

            }
        });

    }
}

