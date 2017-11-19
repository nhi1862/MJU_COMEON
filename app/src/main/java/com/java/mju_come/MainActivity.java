package com.java.mju_come;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
                        break;
                    case R.id.action_lost:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new LostFragment()).commit();
                        break;
                    case R.id.action_love:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new LoveFragment()).commit();
                        break;
                    case R.id.action_memory:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new MemoryFragment()).commit();
                        break;
                    case R.id.action_setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new SettingFragment()).commit();
                        break;
                }
                return true;
            }
        });

    }
}

