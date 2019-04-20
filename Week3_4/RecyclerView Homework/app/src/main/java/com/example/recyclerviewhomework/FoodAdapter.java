package com.example.recyclerviewhomework;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {

    private List<Food> foodList;
    private Context context;
    private LayoutInflater mInflater;

    public FoodAdapter(Context context,List<Food> foodList) {
        this.foodList = foodList;
        mInflater = LayoutInflater.from(context);

    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title, desc;
        public TextView FoodItemView;
         FoodAdapter mAdapter;

        public MyViewHolder(View view,FoodAdapter adapter) {
            super(view);
            title =  view.findViewById(R.id.title);
            desc =  view.findViewById(R.id.desc);
            FoodItemView = itemView.findViewById(R.id.my_recycler_view);
            this.mAdapter = adapter;
            view.setOnClickListener(this);

         }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            Context context=v.getContext();

            int position=getLayoutPosition();

          //  Toast.makeText(this,foodList.get(position).getTitle(),Toast.LENGTH_SHORT).show();
            Intent i=new Intent(context,RecipeActivity.class);
            i.putExtra("position",position);
            i.putExtra("FoodTitle",foodList.get(position).getTitle());
            i.putExtra("FoodDesc",foodList.get(position).getDesc());


            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(i);


        }
    }


    @NonNull
    @Override
    public FoodAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.foodlist_row, parent, false);

        return new MyViewHolder(itemView,this);    }

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
