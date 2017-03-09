package com.learning.multiple_screen_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ArrayList<palabras> numbers = new ArrayList<palabras>();
        numbers.add(new palabras("Blanco","Branco"));
        numbers.add(new palabras("Rojo","Vermello"));
        numbers.add(new palabras("Amarillo","Amarelo"));
        numbers.add(new palabras("Azul","Azul"));
        numbers.add(new palabras("Verde","Verde"));
        numbers.add(new palabras("Rosa","Rosa"));
        numbers.add(new palabras("Naranja","Laranxa"));
        palabraAdapter adapter = new palabraAdapter(this , numbers);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
