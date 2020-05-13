package com.example.elderlyhealthmanagmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class ElderlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elderly);

        Thread t = new Thread(){

            @Override
            public void run()
            {
                try{
                    while(!isInterrupted())
                    {
                         Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView time=(TextView)findViewById(R.id.txttime);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy / kk-mm-ss");
                                String dataString = sdf.format(date);
                                time.setText(dataString);
                            }
                        });
                    }

                }
                catch (InterruptedException e ){

                }
            }


        };
        t.start();

    }
}
