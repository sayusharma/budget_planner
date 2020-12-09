package com.e.budgetplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddBudget extends AppCompatActivity {
    private EditText desc,amt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_budget);
        desc = findViewById(R.id.description);
        amt = findViewById(R.id.amount);
    }
    public void onClickAddBudget(View view){
        if(TextUtils.isEmpty(desc.getText()) || TextUtils.isEmpty(amt.getText())){
            Toast.makeText(getApplicationContext(),"FIELDS CANNOT BE EMPTY",Toast.LENGTH_SHORT).show();
        }
        else {
            save(desc.getText().toString(),amt.getText().toString());
        }
    }
    private void save(String name,String pos)
    {
        DBAdapter db=new DBAdapter(this);

        //OPEN DB
        db.openDB();

        //COMMIT
        long result=db.add(name,pos);

        if(result>0)
        {
            Toast.makeText(getApplicationContext(),"BUDGET ADDED!",Toast.LENGTH_SHORT).show();
            desc.setText("");
            amt.setText("");
        }
        db.closeDB();

    }
}