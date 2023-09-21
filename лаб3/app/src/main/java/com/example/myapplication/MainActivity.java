package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button2);
        imageButton = findViewById(R.id.imageButton);
        myButton.setOnClickListener(oMyButton);


    }
    TextView myTextView;
    Button myButton;
    ImageButton imageButton;
    View.OnClickListener oMyButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            myTextView.setText("vse ok");
            imageButton.setVisibility(View.VISIBLE);

        }
    };
}
