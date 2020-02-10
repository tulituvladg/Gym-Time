package com.theviciousgames.gtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class optimizedCountdownE extends AppCompatActivity {

    Button startButton;
    TextView secondsLeftText;
    TextView secondsLeft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optimized_countdown_e);
        startButton = (Button) findViewById(R.id.startButtonEndurance);
        secondsLeft = (TextView) findViewById(R.id.secondsLeftEndurance);
        secondsLeftText = (TextView) findViewById(R.id.secondsLeftTextEndurance);
        secondsLeftText.setText(""); //hides "Seconds left" text
        startButton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick (View v)
            {

                int Seconds=35;
                CountDownTimer countDownTimer = new CountDownTimer(Seconds * 1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        secondsLeft.setTextSize((120));
                        secondsLeft.setText("" + millisUntilFinished / 1000);
                        secondsLeftText.setText("SECONDS LEFT");
                    }

                    @Override
                    public void onFinish() {
                        secondsLeft.setTextSize(80);
                        secondsLeft.setText("DONE");
                        secondsLeftText.setText("");
                    }
                }.start();

//////////when start button is clicked it makes another countdown besides the other one;

            }
        });
    }
}
