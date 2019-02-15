package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.show_count);

    }
    int count=0;

    public void btn_count(View view) {
        count++;
        textView.setText(""+count);
    }

    public void btn_toast(View view) {
        Toast toast=Toast.makeText(this,"Hello Toast",Toast.LENGTH_LONG );
        toast.show();
    }
}
