package com.example.recyclerviewhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

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

        prepareFoodData();

    }
    private void prepareFoodData() {
        Food food = new Food("Kale/Lemon Sandwiches", "This sandwich is stunningly delicious and tastes as good as it is healthy. Any greens of choice will work. The lemon adds an almost sweet taste. Be generous with it!");
        foodList.add(food);

        food = new Food("Mango-Lime Bean Salad", "Everyone loves this, so double or even triple the recipe! it vanishes in a flash, and also works well as a salsa. it really is our all-time favorite summer salar.");
        foodList.add(food);

        food = new Food("Sweet Potato and Lentil Soup with Shiitake Mushrooms", "This soup is so god Essy and I ate it  AL the first time I made it. if someone is hesitant about plant-based food, this has to be a convincer.");
        foodList.add(food);

        food = new Food("Lime Mousse", "This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake. it is fast to make at last munute. User more or lesstime according to taste.");
        foodList.add(food);

        food = new Food("Broiled Tilapia Parmesan", "Flavourful recipe for this farm raised fish that is easy and done in minutes! the fish is brioled with a creamy cheese coating for an impressive flavour and");
        foodList.add(food);

        initRecyclerView();


    }
    private void initRecyclerView(){
        recyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);



        FoodAdapter mAdapter = new FoodAdapter(this,foodList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(mAdapter);

    }


}
