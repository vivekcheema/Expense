package com.learnprogramming.academy.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Spinner cities,days;
    public Button Submit;

    String selected_City, selected_days;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemsOnDays();
        addListenerOnButton();
    }



    public void addListenerOnButton() {

        cities=(Spinner) findViewById(R.id.cities);
        days=(Spinner) findViewById(R.id.days);
        Submit=(Button) findViewById(R.id.Submit);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected_City= cities.getSelectedItem().toString();
                selected_days= days.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, Results.class);
                intent.putExtra("city", selected_City);
                intent.putExtra("days", selected_days);
                startActivity(intent);
            }
        });
    }

    public void addItemsOnDays() {
        days= (Spinner) findViewById(R.id.days);
        List<String> list= new ArrayList<>();
        list.add("4-6 days");
        list.add("8-10 days");
        list.add("12-14 days");
        ArrayAdapter<String> dataAdapter= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        days.setAdapter(dataAdapter);
    }




}