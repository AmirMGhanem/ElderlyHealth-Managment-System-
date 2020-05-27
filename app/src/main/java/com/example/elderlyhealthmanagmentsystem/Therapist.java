package com.example.elderlyhealthmanagmentsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Therapist extends AppCompatActivity {
   private Fragment fragment = null;
   private FragmentTransaction fragmentTransaction;
    private BottomNavigationView mTherapistNav;
    private FrameLayout mTherapistFrame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapist);

        mTherapistFrame=(FrameLayout) findViewById(R.id.therapist_frame);
        mTherapistNav=(BottomNavigationView) findViewById(R.id.therapist_nav);


        mTherapistNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.HomeIcon:
                        fragment = new TherapistHomeFragment();
                        switchFragment(fragment);
                        return true;

                    case R.id.channelIcon:
                        fragment = new TherapistGroupFragment();
                        switchFragment(fragment);
                        return true;


                    case R.id.AccessibleIcon:
                        fragment = new TherapistAccesibleFragment();
                        switchFragment(fragment);
                        return true;


                    case R.id.EventsIcon:
                        fragment = new TherapistEventFragment();
                        switchFragment(fragment);
                        return true;

                }
                return false;
            }
        });

    }

    private void switchFragment(Fragment fragment) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if(getSupportFragmentManager().findFragmentById(R.id.therapist_frame)==null)
            fragmentTransaction.add(R.id.therapist_frame,fragment);
        else
            fragmentTransaction.replace(R.id.therapist_frame,fragment);

        fragmentTransaction.commit();
    }
}
