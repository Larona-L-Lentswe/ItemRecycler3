package com.example.itemrecycler3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class MyViewholder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, priceView;
    
    public MyViewholder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        priceView = itemView.findViewById(R.id.price);


    }
}
