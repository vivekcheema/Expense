package com.learnprogramming.academy.expense;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends MainActivity {

    public TextView expense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        expense= findViewById(R.id.expense);

        Intent intent = getIntent();
        if(intent != null){
            String city = intent.getStringExtra("city");
            String days = intent.getStringExtra("days");

            switch (city){
                case "Jaipur":
                    if(days.equals("4-6 days")){
                        expense.append("Estimate expense for "+city +" will be \n 3000-4500");
                    }
                    else if(days.equals("8-10 days")){
                        expense.append("Estimate expense for "+city +" will be \n 7000-9000");
                    }
                    else if(days.equals("12-14 days")){
                        expense.append("Estimate expense for "+city +" will be \n 13000-15000");
                    }
                    break;
                case "Mumbai":
                    if(days.equals("4-6 days")){
                        expense.append("Estimate expense for "+city +" will be \n 4500-7000");
                    }
                    else if(days.equals("8-10 days")){
                        expense.append("Estimate expense for "+city +" will be \n 11000-13500");
                    }
                    else if(days.equals("12-14 days")){
                        expense.append("Estimate expense for "+city +" will be \n 115000-19000");
                    }
                    break;
            }


        }
    }
}