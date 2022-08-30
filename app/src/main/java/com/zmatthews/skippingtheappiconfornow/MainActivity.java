package com.zmatthews.skippingtheappiconfornow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    TextView greetingDisplay;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*TextView textView = new TextView(this);
        textView.setText(R.string.greet_user);
        setContentView(textView);*/
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increment_button);
        greetingDisplay = findViewById(R.id.greeting_textview);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("incrementing: " + ++count);
                Log.i("incrementing", "" + count);
                greetingDisplay.setText("" + count);
            }
        });
    }

    public void decrement(View view) {
        System.out.println("decrementing: " + --count);
        Log.i("decrementing", "" + count);
        greetingDisplay.setText("" + count);
    }

    public void littleGuyClicked(View view) {
        System.out.println("you have clicked the little guy");
        Log.i("clicked", "Clicked!");
        greetingDisplay.setText(R.string.radioButtonClick);
    }
}