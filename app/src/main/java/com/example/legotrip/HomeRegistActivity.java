package com.example.legotrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeRegistActivity extends AppCompatActivity {

    Button addhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeregist);

        addhome = (Button)findViewById(R.id.addhome);

        addhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addhome = new Intent(getApplicationContext(),HomeInfoAddActivity.class);
                startActivity(addhome);
            }
        });
    }
}