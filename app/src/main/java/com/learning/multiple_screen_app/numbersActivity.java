package com.learning.multiple_screen_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<palabras> numbers = new ArrayList<palabras>();
        numbers.add(new palabras("uno","un"));
        numbers.add(new palabras("Dos","Dous"));
        numbers.add(new palabras("Tres","Tres"));
        numbers.add(new palabras("Cuatro","Catro"));
        numbers.add(new palabras("Cinco","Cinco"));
        numbers.add(new palabras("Seis","Seis"));
        numbers.add(new palabras("Siete","Sete"));
        numbers.add(new palabras("Ocho","Oito"));
        numbers.add(new palabras("Nueve","Nove"));
        numbers.add(new palabras("Diez","Dez"));
        palabraAdapter adapter = new palabraAdapter(this , numbers);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

    }

}