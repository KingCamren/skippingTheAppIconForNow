package com.zmatthews.skippingtheappiconfornow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    TextView greetingDisplay;
    TextView inputTextView;
    EditText inputField;
    String[] solarSystem;
    int cycleFurther;
    int cycleCount;
    int count = 0;
    TextView planets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*TextView textView = new TextView(this);
        textView.setText(R.string.greet_user);
        setContentView(textView);*/
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increment_button);
        greetingDisplay = findViewById(R.id.greeting_textview);
        inputTextView = findViewById(R.id.input_textView);
        inputField = findViewById(R.id.input_field);
        solarSystem = getResources().getStringArray(R.array.planets);
        cycleFurther = 1;
        cycleCount = 0;
        planets = findViewById(R.id.solarSystem);
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

    public void inputConfirmed(View view) {
        System.out.println("inputted " + inputField.getText());
        Log.i("input", "Sent!");
        inputTextView.setText(inputField.getText());
    }

    public void toggleFurther(View view) {
        cycleFurther = 1;
    }

    public void toggleCloser(View view) {
        cycleFurther = solarSystem.length - 1;
    }

    public void cycleSolarSystem(View view) {
        cycleCount += cycleFurther;
        planets.setText(solarSystem[cycleCount % solarSystem.length]);
        System.out.println("now displaying " + solarSystem[cycleCount % solarSystem.length]);
        Log.i("planet", "" + cycleCount);
//        planets.setText("" + cycleCount % solarSystem.length);
    }
}