package com.example.recyclerviewhomework;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {

    private List<Food> foodList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, desc;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
         }
    }
    public FoodAdapter(List<Food> moviesList) {
        this.foodList = foodList;
    }
    @NonNull
    @Override
    public FoodAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.foodlist_row, parent, false);

        return new MyViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.MyViewHolder holder, int position) {
        Food movie = foodList.get(position);
        holder.title.setText(movie.getTitle());
        holder.desc.setText(movie.getDesc());
     }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
