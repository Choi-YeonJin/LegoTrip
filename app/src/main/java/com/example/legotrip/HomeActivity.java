package com.example.legotrip;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentMain fragmentMain= new FragmentMain();
    private FragmentSetting fragmentSetting = new FragmentSetting();
    private FragmentDiary fragmentDiary = new FragmentDiary();
    private FragmentReservation fragmentReservation = new FragmentReservation();
    private FragmentPlan fragmentPlan = new FragmentPlan();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout, fragmentMain).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.plan:
                    transaction.replace(R.id.framelayout, fragmentPlan).commitAllowingStateLoss();
                    break;
                case R.id.reservation:
                    transaction.replace(R.id.framelayout, fragmentReservation).commitAllowingStateLoss();
                    break;
                case R.id.main:
                    transaction.replace(R.id.framelayout, fragmentMain).commitAllowingStateLoss();
                    break;
                case R.id.diary:
                    transaction.replace(R.id.framelayout, fragmentDiary).commitAllowingStateLoss();
                    break;
                case R.id.setting:
                    transaction.replace(R.id.framelayout, fragmentSetting).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }
}