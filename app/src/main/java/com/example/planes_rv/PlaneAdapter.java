package com.example.planes_rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlaneAdapter extends RecyclerView.Adapter<PlaneViewHolder> {

    private ArrayList<Planes> planes;

    public PlaneAdapter(ArrayList<Planes> planes) {
        this.planes = planes;
    }

    @NonNull
    @Override
    public PlaneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plane, parent, false);
        return new PlaneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaneViewHolder holder, int position) {
        holder.bind(planes.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return planes.size();
    }
}
