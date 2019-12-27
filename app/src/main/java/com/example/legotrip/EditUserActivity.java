package com.example.legotrip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class EditUserActivity extends AppCompatActivity {

    ImageView edituser_imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edituser);

        edituser_imageview = (ImageView)findViewById(R.id.edituser_imageview);

        Glide.with(this)
                .load(R.drawable.snow)
                .apply(new RequestOptions().circleCrop())
                .into(edituser_imageview);
    }
}