package com.example.card;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {

    Button backButton, forwardButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        backButton = findViewById(R.id.back_email_button);
        forwardButton = findViewById(R.id.forward_email_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(EmailActivity.this,InputNameActivity.class));
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmailActivity.this, PasswordActivity.class));
            }
        });

    }
}
