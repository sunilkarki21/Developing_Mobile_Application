package com.example.recyclerviewhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Food> foodList = new ArrayList<>();
     private FoodAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);

        mAdapter = new FoodAdapter(foodList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareFoodData();

    }
    private void prepareFoodData() {
        Food food = new Food("Kale/Lemon Sandwiches", "This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work. The lemon adds an almost sweet taste. Be generous with it!");
        foodList.add(food);

        food = new Food("Inside Out", "Animation, Kids & Family");
        foodList.add(food);

        food = new Food("Star Wars: Episode VII - The Force Awakens", "Action");
        foodList.add(food);

        food = new Food("Shaun the Sheep", "Animation");
        foodList.add(food);

        mAdapter.notifyDataSetChanged();
    }


}
