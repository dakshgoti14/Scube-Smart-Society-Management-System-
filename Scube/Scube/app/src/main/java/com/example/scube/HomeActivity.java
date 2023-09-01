package com.example.scube;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Objects.requireNonNull(toolbar).setTitle("Explore");
        loadFragment(new Home_1Activity());

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment;

            switch (item.getItemId())
            {
                case R.id.navigation_home:
                    //toolbar.setTitle("Explore");
                    fragment = new Home_1Activity();
                    loadFragment(fragment);
                    return true;

                case R.id.navigation_services:
                    //toolbar.setTitle("Chats");
                    fragment = new ServicesFragment();
                    loadFragment(fragment);
                    return true;

                /*case R.id.navigation_contact:
                    //toolbar.setTitle("Sell");
                    fragment = new ContactActivity();
                    loadFragment(fragment);
                    return true;

                case R.id.navigation_feedback:
                    //toolbar.setTitle("My Ads");
                    fragment = new FeedbackActivity();
                    loadFragment(fragment);
                    return true;*/

                case R.id.navigation_my_account:
                    //toolbar.setTitle("My Account");
                    fragment = new UserProfile();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
