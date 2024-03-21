package com.example.moviezhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MovieMain extends AppCompatActivity {


    ViewFlipper v_flipper;
    TextView textView,textView2,textView3,textView4,textView5,textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_main);

        int images[] = {R.drawable.viewflip1, R.drawable.viewflip2, R.drawable.viewflip4};

        v_flipper = findViewById(R.id.v_flipper);

        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }
    }
    public void flipperImages (int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

        textView = (TextView)findViewById(R.id.txt1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MovieMain.this,Book1.class);
                startActivity(intent5);
            }
        });

        textView2 = (TextView)findViewById(R.id.txt2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MovieMain.this,Book2.class);
                startActivity(intent6);
            }
        });

        textView3 = (TextView)findViewById(R.id.txt3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MovieMain.this,Book3.class);
                startActivity(intent7);
            }
        });

        textView4 = (TextView)findViewById(R.id.txt4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(MovieMain.this,Book4.class);
                startActivity(intent8);
            }
        });

        textView5 = (TextView)findViewById(R.id.txt5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(MovieMain.this,Book5.class);
                startActivity(intent9);
            }
        });

        textView6 = (TextView)findViewById(R.id.txt6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(MovieMain.this,Book6.class);
                startActivity(intent10);
            }
        });
    }

}
