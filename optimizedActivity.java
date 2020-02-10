package com.theviciousgames.gtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class optimizedActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] TrainingTypes = { "None","Power", "Muscle", "Endurance&Weight Loss"};
    Object value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optimized);
        Spinner spin = (Spinner) findViewById(R.id.spinnerBar);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,TrainingTypes);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
    {
        value=arg0.getItemAtPosition(position);
        switch(position)
        {
            case 0:

                break;
            case 1:
                Intent intent = new Intent(this,optimizedCountdown.class);
                startActivity(intent);
                break;
            case 2:
                Intent intentA = new Intent(this,optimizedCountdownM.class);
                startActivity(intentA);
                break;
            case 3:
            Intent intentB = new Intent(this,optimizedCountdownE.class);
            startActivity(intentB);
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


}

