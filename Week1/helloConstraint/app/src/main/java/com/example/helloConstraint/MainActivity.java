package com.example.helloConstraint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btnzer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.show_count);
        btnzer=findViewById(R.id.btn_zero);


    }
    int count=0;


    public void btn_count(View view) {
        btnzer.setBackgroundResource(R.color.red);

        int count= Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(""+count);

    }

    public void btn_toast(View view) {

        Toast toast=Toast.makeText(this,"Hello Toast",Toast.LENGTH_LONG );
        toast.show();


     }

    public void btn_zero(View view) {
         textView.setText(""+0);

        btnzer.setBackgroundResource(R.color.gray);

    }
}
