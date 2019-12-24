package com.example.legotrip.ui.diary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.legotrip.R;
import com.example.legotrip.ui.main.MainViewModel;

public class DiaryFragment extends Fragment {

    private DiaryViewModel DiaryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DiaryViewModel =
                ViewModelProviders.of(this).get(DiaryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_diary, container, false);
        final TextView textView = root.findViewById(R.id.text_diary);
        DiaryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}


