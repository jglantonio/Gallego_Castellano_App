package com.learning.multiple_screen_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.learning.multiple_screen_app.R.id.numbers;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("Uno");
        numbers.add("Dos");
        numbers.add("Tres");
        numbers.add("Cuatro");
        numbers.add("Cinco");
        numbers.add("Seis");
        numbers.add("Siete");
        numbers.add("Ocho");
        numbers.add("Nueve");
        numbers.add("Diez");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView tV = new TextView(this);
        tV.setText(numbers.get(0));
        rootView.addView(tV);

    }

}