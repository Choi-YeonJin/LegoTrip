package com.example.legotrip;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class FragmentSetting extends Fragment {

    static final String TAG = "FragmentSetting";

    ImageView userImageView;
    ConstraintLayout userinfo,reservationinfo;
    TextView user;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_setting, container, false);

        userImageView = (ImageView) v.findViewById(R.id.userImageView);
        userinfo = (ConstraintLayout) v.findViewById(R.id.userinfo);
        reservationinfo = (ConstraintLayout) v.findViewById(R.id.reservationinfo);

        user = (TextView)v.findViewById(R.id.user);

        userinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"userinfo");
                Intent edituser = new Intent(getActivity(), EditUserActivity.class);
                startActivity(edituser);
            }
        });

        reservationinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reservationinfo = new Intent(getActivity(), HomeRegistActivity.class);
                startActivity(reservationinfo);
            }
        });

        Glide.with(this)
                .load(R.drawable.snow)
                .apply(new RequestOptions().circleCrop())
                .into(userImageView);

        return v;


    }
}