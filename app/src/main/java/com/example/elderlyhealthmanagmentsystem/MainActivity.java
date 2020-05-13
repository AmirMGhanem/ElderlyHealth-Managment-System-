package com.example.elderlyhealthmanagmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   Button _btnstart;
    TextView _register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnstart=(Button)findViewById(R.id.btnstart);
        _register = (TextView)findViewById(R.id.txtviewregister);

        _btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),signin.class);
                startActivity(intent);
            }
        });

    }


    public void perform_action(View view) {

        _register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),register.class);
                startActivity(intent);
            }
        });
    }

}
