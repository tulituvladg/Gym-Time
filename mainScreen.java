package com.theviciousgames.gtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class mainScreen extends AppCompatActivity {

    Button customButton;
    Button optimizedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        customButton = findViewById(R.id.customButton);
        optimizedButton = findViewById(R.id.optimizedButton);

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCustomTimer();
            }
        });

        optimizedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOptimizedTimer();
            }
        });
    }

    public void openCustomTimer()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void openOptimizedTimer()
        {
            Intent intentA=new Intent(this,optimizedActivity.class);
            startActivity(intentA);
        }
}
