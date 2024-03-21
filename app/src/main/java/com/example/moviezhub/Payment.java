package com.example.moviezhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.pay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONException;
import org.json.JSONObject;

public class Payment extends AppCompatActivity implements PaymentResultListener {

    Button btPay;
    Button gtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        gtr = findViewById(R.id.generate);
        gtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etl = (EditText) findViewById(R.id.txtSeat);
                TextView txt = (TextView) findViewById(R.id.txtSeat1);
                TextView txt1 = (TextView) findViewById(R.id.total);


                int n1 = Integer.parseInt(etl.getText().toString());

                int result = (n1*150)+35;

                txt1.setText(String.valueOf(result));
                txt.setText(String.valueOf(n1));

            }
        });


        btPay = findViewById(R.id.pay);

        String sAmount = "350";

        int amount = Math.round(Float.parseFloat(sAmount) * 100);

        btPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Checkout checkout = new Checkout();

                checkout.setKeyID("YourRazorPayKeyID");

                checkout.setImage(R.drawable.rzp_logo);

                JSONObject object = new JSONObject();
                try {
                    object.put("Name","Rohan Verma");
                    object.put("Description","Test Payment");
                    object.put("theme.color","#0093DD");
                    object.put("Currency","INR");
                    object.put("Amount",amount);
                    object.put("prefill.contact","9865231575");
                    object.put("prefill.email","rohan@gmail.com");
                    checkout.open(Payment.this,object);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @Override
    public void onPaymentSuccess(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Payment ID");
        builder.setMessage(s);
        builder.show();
        Intent intent5 = new Intent(Payment.this,Thankyou.class);
        startActivity(intent5);
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(getApplicationContext()
                ,s,Toast.LENGTH_SHORT).show();
    }
}