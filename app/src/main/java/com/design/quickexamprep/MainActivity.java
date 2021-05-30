package com.design.quickexamprep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment mHomeFragment = new HomeFragment();

        setCurrentFragment(mHomeFragment);
        ((BottomNavigationView) findViewById(R.id.main_bottom_navigation)).setOnNavigationItemReselectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.my_home:
                case R.id.my_package:
                case R.id.my_test:
                    setCurrentFragment(mHomeFragment);
                    break;

            }
        });
    }

    private void setCurrentFragment(HomeFragment mHomeFragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, mHomeFragment).commit();
    }


}