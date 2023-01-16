package com.example.wyther;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;
    //SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

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
      //  System.out.println("Shared preferences: " + preferences.getString("unit", "metric"));
        holder.cityView.setText(items.get(position).getCity());
        //if in SharedPreferences is metric, then show metric, else show imperial
        //SharedPreferences preferences = context.getSharedPreferences("unit", Context.MODE_PRIVATE);
//        if (preferences.getString("unit", "metric").equals("metric")) {
//            holder.tempView.setText(items.get(position).getTemp() + "°C");
//        } else {
//            holder.tempView.setText(items.get(position).getTemp() + "°F");
//        }
        holder.hourView.setText(items.get(position).getHour());
        holder.imageView.setImageResource(items.get(position).getCondition());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
