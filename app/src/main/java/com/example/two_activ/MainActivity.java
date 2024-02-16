package com.example.two_activ;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textInputEditText;
    private Button button;
    static final String KEY = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textInputEditText = findViewById(R.id.textInputEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = textInputEditText.getText().toString();
                Intent intent = new Intent(v.getContext(),MessengerActivity.class);
                intent.putExtra(KEY, message);
                startActivity(intent);

            }
        });

    }




}