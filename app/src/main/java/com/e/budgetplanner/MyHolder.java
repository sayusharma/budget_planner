package com.e.budgetplanner;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder{
    TextView descrpition, amount;
    public MyHolder(@NonNull View itemView) {
        super(itemView);
        descrpition = itemView.findViewById(R.id.itemDescription);
        amount = itemView.findViewById(R.id.itemAmount);
    }
}
