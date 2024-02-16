package com.example.two_activ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessengerActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);
        textView = findViewById(R.id.textViewMessenger);
        //Bundle arguments = getIntent().getExtras();
        //String message = arguments.get("message").toString();
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.KEY);
        textView.setText(message);

    }
}