
package com.example.elderlyhealthmanagmentsystem;


        import android.content.ContentValues;
        import android.os.Bundle;

        import androidx.fragment.app.Fragment;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;

        import android.widget.*;

        import java.util.ArrayList;


public class TherapistEventFragment extends Fragment {



    ArrayList<String> Strings = new ArrayList<String>();
    Spinner _spnEvent;

    public TherapistEventFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_therapist_event, container, false);



        _spnEvent=(Spinner)v.findViewById(R.id.eventSpinner);


        Strings.add("Medical Examination");
        Strings.add("Daily Meals");
        Strings.add("Family Meetings");

        ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_dropdown_item, Strings);
        _spnEvent.setAdapter(arrayAdapter);



            // Inflate the layout for this fragment
        return v;


    }


}


