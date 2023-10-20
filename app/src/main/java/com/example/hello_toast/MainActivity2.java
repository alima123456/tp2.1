package com.example.hello_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView helloMessage = findViewById(R.id.hello_message);
        TextView countMessage = findViewById(R.id.count_message);

        int count = getIntent().getIntExtra("count", 0);

        // Display "Hello!" and the current count
        helloMessage.setText("Hello!");
        countMessage.setText("Count: " + count);
    }
}