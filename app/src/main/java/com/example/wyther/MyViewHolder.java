package com.example.wyther;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView cityView, tempView, hourView, imageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        cityView = itemView.findViewById(R.id.cityView);
        tempView = itemView.findViewById(R.id.tempView);
        hourView = itemView.findViewById(R.id.hourView);
    }
}
