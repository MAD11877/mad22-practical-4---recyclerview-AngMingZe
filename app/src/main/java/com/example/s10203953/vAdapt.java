package com.example.s10203953;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class vAdapt extends RecyclerView.Adapter<vHolder> {
    ArrayList<MainActivity.User> data;
    public vAdapt(ArrayList<MainActivity.User> data){
        this.data = data;
    }

    @NonNull
    @Override
    public vHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = null;
        item = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview,null,false);
        return new vHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull vHolder holder, int position) {
        //name
        String n = data.get(position).name;
        holder.name.setText(n);
        //description
        String de = data.get(position).description;
        holder.des.setText(de);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
