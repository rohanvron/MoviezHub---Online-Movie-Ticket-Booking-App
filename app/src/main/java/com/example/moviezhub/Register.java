package com.example.moviezhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private Button btn4;
    EditText txt,txt1,txt2,txt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txt = (EditText) findViewById(R.id.nameTxt);
        txt1 = (EditText) findViewById(R.id.txtUname);
        txt2 = (EditText) findViewById(R.id.txtMail);
        txt3 = (EditText) findViewById(R.id.txtPwd);

         btn4 = findViewById(R.id.button3);

         btn4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(txt.length()==0)
                 {
                        txt.setError("Enter Name!");
                 }
                 else if(txt1.length()==0)
                 {
                     txt1.setError("Enter Username!");
                 }
                 else if(txt2.length()==0)
                 {
                     txt2.setError("Enter Email!");
                 }
                 else if(txt3.length()==0)
                 {
                     txt3.setError("Enter Password!");
                 }
                 else if(txt3.length()<8)
                 {
                     txt3.setError("Invalid Password!");
                 }
                 else
                 {
                     Intent intent4 = new Intent(Register.this,MovieMain.class);
                     startActivity(intent4);
                 }
             }
         });
    }
}
