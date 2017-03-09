package com.learning.multiple_screen_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<palabras> numbers = new ArrayList<palabras>();
        numbers.add(new palabras("Padre","Pai"));
        numbers.add(new palabras("Madre","Nai"));
        numbers.add(new palabras("Hijo/a","Fillo/a"));
        numbers.add(new palabras("Tio/a","Tio/a"));
        numbers.add(new palabras("Abuelo","Abo"));
        numbers.add(new palabras("Abuela","Aboa"));
        numbers.add(new palabras("Hermano/a","Curma"));
        numbers.add(new palabras("Primo/a","Primo/a"));
        numbers.add(new palabras("Nieto","Neto"));
        numbers.add(new palabras("Bisabuelo","bisabo"));
        numbers.add(new palabras("Bisabuela","bisaboa"));
        numbers.add(new palabras("Suegra","Sogra"));
        numbers.add(new palabras("Nuera","Nora"));
        palabraAdapter adapter = new palabraAdapter(this , numbers);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
