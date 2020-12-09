package com.e.budgetplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.budgetplanner.Model.Budget;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Budget> budgets;
    public MyAdapter(Context c, ArrayList<Budget> budgets) {
        this.c = c;
        this.budgets = budgets;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.a_budget,null);

        //HOLDER
        MyHolder holder=new MyHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.amount.setText(budgets.get(position).getAmt());
        holder.descrpition.setText(budgets.get(position).getDesc());


    }

    @Override
    public int getItemCount() {
        return budgets.size();
    }
}
