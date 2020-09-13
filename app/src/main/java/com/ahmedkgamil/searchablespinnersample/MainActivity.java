package com.ahmedkgamil.searchablespinnersample;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.ahmedkgamil.searchablespinner.SearchableSpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchableSpinner test = findViewById(R.id.testSpinner);


        ArrayList<String> list = new ArrayList<>();

        list.add("Ahmed");
        list.add("Mohamed");
        list.add("Ali");
        list.add("Khaled");
        list.add("Tarek");
        list.add("Bana");
        list.add("Mamdouh");
        list.add("Samy");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,
                list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        test.setAdapter(adapter);
    }
}