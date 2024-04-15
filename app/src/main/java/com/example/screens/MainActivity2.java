package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String texty = null;
        int number = 0;
        if (extras != null) {
            texty = extras.getString("text");
            number = extras.getInt("number");
            // Do something with the name and number
        }

        TextView textView = findViewById(R.id.text);
        TextView textView1 = findViewById(R.id.text1);
        textView.setText(texty);
        textView1.setText("" + number);
    }
}