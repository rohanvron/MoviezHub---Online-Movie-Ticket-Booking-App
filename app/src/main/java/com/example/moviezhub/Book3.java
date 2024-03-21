package com.example.moviezhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Book3 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioButton radioButton;
    RadioButton radioButton2;
    TextView textView;
    TextView textView2;
    Button btn34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.selectedView);
        radioGroup2 = findViewById(R.id.radioGroup2);
        textView2 = findViewById(R.id.selectedView2);

        Button btn0 = findViewById(R.id.select);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                textView.setText("Your Timing : "+radioButton.getText());

                int radioId2 = radioGroup2.getCheckedRadioButtonId();

                radioButton2 = findViewById(radioId2);

                textView2.setText("Your Screen : "+radioButton2.getText());

            }

        });
        btn34 = findViewById(R.id.book);
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent34 = new Intent(Book3.this,SeatSelection.class);
                startActivity(intent34);
            }
        });
    }
    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        int radioId2 = radioGroup2.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        radioButton2 = findViewById(radioId2);

        Toast.makeText(this,"Selected Timing :" +radioButton.getText(),Toast.LENGTH_SHORT).show();
    }
}