package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

       TextView txtview= (TextView) findViewById(R.id.textView);
       TextView txtcount=findViewById(R.id.textView2);

        String r=getIntent().getStringExtra("Mykey");
        String c=getIntent().getStringExtra("count");


        txtview.setText(r);
        txtcount.setText(c);



    }
}
