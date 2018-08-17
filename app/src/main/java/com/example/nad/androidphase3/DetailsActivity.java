package com.example.nad.androidphase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView username;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        username = findViewById(R.id.textView3);
        password = findViewById(R.id.textView4);

        Intent intent = getIntent();
        username.setText(intent.getStringExtra("username"));
        password.setText(intent.getStringExtra("password"));
    }
}
