package com.teamtreehouse.datastorageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final List<Country> COUNTRY_LIST = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText countryNameInput = (EditText) findViewById(R.id.countryName);
        final EditText continentInput = (EditText) findViewById(R.id.continent);
        final EditText populationInput = (EditText) findViewById(R.id.population);
        Button saveButton = (Button) findViewById(R.id.saveButton);
        Button listButton = (Button) findViewById(R.id.listButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countryName = countryNameInput.getText().toString();
                String continent = continentInput.getText().toString();
                int population = Integer.parseInt(populationInput.getText().toString());
                Country country = new Country(population, countryName, continent);
                COUNTRY_LIST.add(country);
                countryNameInput.getText().clear();
                continentInput.getText().clear();
                populationInput.getText().clear();
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CountryList.class);
                startActivity(intent);
            }
        });

    }
}
