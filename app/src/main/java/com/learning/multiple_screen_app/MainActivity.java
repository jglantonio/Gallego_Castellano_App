package com.learning.multiple_screen_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView familyActivity = (TextView) findViewById(R.id.familyActivity);
        TextView colors = (TextView) findViewById(R.id.colors);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        v.getContext(),
                        "Open the list of numebrs",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
        familyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        v.getContext(),
                        "In construction",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        v.getContext(),
                        "In construction",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        */
        TextView phrasalsActivity = (TextView) findViewById(R.id.phrasals);
        phrasalsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        v.getContext(),
                        "In construction",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
    public void openNumber(View view){
        Intent i = new Intent(this,numbersActivity.class);
        startActivity(i);
    }
    public void openFamily(View view){
        Intent i = new Intent(this,familyActivity.class);
        startActivity(i);
    }
    public void openPhrasals(View view){
        Intent i = new Intent(this,phrasalsActivity.class);
        startActivity(i);
    }
    public void openColors(View view){
        Intent i = new Intent(this,colorActivity.class);
        startActivity(i);
    }

}
