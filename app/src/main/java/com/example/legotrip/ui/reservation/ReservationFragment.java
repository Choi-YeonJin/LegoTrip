package com.example.legotrip.ui.reservation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.legotrip.R;

public class ReservationFragment extends Fragment {

    private ReservationViewModel ReservationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ReservationViewModel =
                ViewModelProviders.of(this).get(ReservationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reservation, container, false);
        final TextView textView = root.findViewById(R.id.text_reservation);
        ReservationViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}