package com.example.nad.androidphase3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LauncherActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    private EditText usernameText;
    private EditText passwordText;

    private String CheckPass = "lorem";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        usernameText = findViewById(R.id.editText3);
        passwordText = findViewById(R.id.editText4);

//        textView.setText("wawawawa");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                textView.setText(usernameText.getText().toString());
//                textView.setText("ini dari wawawawawa");
                if (CheckPass.toString() == passwordText.getText().toString()){
                    Intent intent = new Intent(LauncherActivity.this, DetailsActivity.class);
                    // send a package to DetailsActivity
                    intent.putExtra("username",usernameText.getText().toString());
                    intent.putExtra("password",passwordText.getText().toString());
                    startActivity(intent);
                }else{
                    Context context = getApplicationContext();
                    CharSequence text = "Password incorrect";
                    int duration = Toast.LENGTH_SHORT;

                    Toast.makeText(context, text, duration).show();
                }
            }
        });
    }


}
