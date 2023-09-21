package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(oMyButton);

    }
    TextView myTextView;
    Button myButton;
    View.OnClickListener oMyButton = new View.OnClickListener() {
        int counter = 0;
        @Override
        public void onClick(View view) {
            myTextView.setText(String.valueOf(++counter));

        }
    };
}