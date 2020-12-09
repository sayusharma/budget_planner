package com.e.budgetplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
    }
    public void onClickAdd(View view){
        Intent intent = new Intent(DashActivity.this,AddBudget.class);
        startActivity(intent);
    }
    public void onClickViewBudgets(View view){
        Intent intent = new Intent(DashActivity.this,ViewBudget.class);
        startActivity(intent);
    }
}