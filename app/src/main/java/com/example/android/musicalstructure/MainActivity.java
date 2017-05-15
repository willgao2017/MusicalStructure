package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView payment = (TextView) findViewById(R.id.pay);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent payIntent = new Intent(MainActivity.this, Payment.class);
                startActivity(payIntent);
            }
        });

        TextView songdetails = (TextView) findViewById(R.id.details);

        songdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailsIntent = new Intent(MainActivity.this, SongDetails.class);
                startActivity(detailsIntent);
            }
        });
    }
}


