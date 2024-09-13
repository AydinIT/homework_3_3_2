package com.example.planes_rv;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlaneViewHolder extends RecyclerView.ViewHolder {


    private ImageView image;
    private TextView desc, title;

    public PlaneViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.img_plane);
        desc = itemView.findViewById(R.id.tv_desc);
        title = itemView.findViewById(R.id.tv_title);
    }

    public void bind(Planes planes){
        title.setText(planes.getName());
        desc.setText(planes.getDesc());
        Glide.with(image).load(planes.getImage()).into(image);
    }

}
