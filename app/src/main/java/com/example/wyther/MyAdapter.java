package com.example.wyther;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.cityView.setText(items.get(position).getCity());
        holder.tempView.setText(items.get(position).getTemp());
        holder.hourView.setText(items.get(position).getHour());
        holder.imageView.setImageResource(items.get(position).getCondition());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
