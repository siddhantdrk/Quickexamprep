package com.design.quickexamprep;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment mHomeFragment = new HomeFragment();

        setCurrentFragment(mHomeFragment);
        ((BottomNavigationView) findViewById(R.id.main_bottom_navigation)).setOnNavigationItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.my_home:
                    setCurrentFragment(mHomeFragment);
                    break;
                case R.id.my_package:
                    break;
                case R.id.my_test:
                    setCurrentFragment(new MyTestFragment());
                    break;
                case R.id.my_profile:
                    setCurrentFragment(new ProfileFragment());
                    break;
            }
            return true;
        });
    }

    private void setCurrentFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();
    }


}