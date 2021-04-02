package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        button = findViewById(R.id.buttonMain);
        textView = findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String str= textView.getText().toString();
                startActivity(new Intent(MainActivity.this,SecondActivity.class).putExtra("test",str));


            }
        });
    }
}
