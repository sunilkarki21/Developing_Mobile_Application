package com.example.recyclerviewhomework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class RecipeActivity extends AppCompatActivity {
    private static final String TAG = "RecipeActivity";
    ImageView imageView;
    TextView textView,textView1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Log.d(TAG, "onCreate: ");
         imageView  = (ImageView) findViewById(R.id.image);
          textView=findViewById(R.id.recipe);
        textView1=findViewById(R.id.recipedesc);

        getIncomingIntent();


    }
    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incomming intents");
        if(getIntent().hasExtra("FoodTitle")&& getIntent().hasExtra("FoodDesc") ){

            imageView.setImageResource(R.drawable.b1);

            String foodname=getIntent().getExtras().getString("FoodTitle");
            String fooddesc=getIntent().getExtras().getString("FoodDesc");

            textView.setText(foodname);
            textView1.setText(fooddesc);

        }
    }



}
