package com.theviciousgames.gtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userSeconds;
    Button startButton;
    TextView secondsLeftText;
    TextView secondsLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSeconds = (EditText) findViewById(R.id.userSeconds);
        startButton = (Button) findViewById(R.id.startButton);
        secondsLeft = (TextView) findViewById(R.id.secondsLeft);
        secondsLeftText = (TextView) findViewById(R.id.secondsLeftText);
        secondsLeftText.setText(""); //hides "Seconds left" text

        startButton.setOnClickListener(new View.OnClickListener()
        {

                public void onClick (View v)
                {

                    int Seconds;
                    Seconds = Integer.parseInt(userSeconds.getText().toString());
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
