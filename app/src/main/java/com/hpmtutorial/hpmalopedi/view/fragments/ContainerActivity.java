package com.hpmtutorial.hpmalopedi.view.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.hpmtutorial.hpmalopedi.R;
import com.hpmtutorial.hpmalopedi.view.AddNewChildActivity;

public class ContainerActivity extends AppCompatActivity {

    final Fragment homeFragment = new HomeFragment();
    final Fragment historyFragment = new HistoryFragment();
    final Fragment settingsFragment = new SettingsFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = homeFragment;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        // Action bar alb fara sa modifici in styles
//        ActionBar bar = this.getSupportActionBar();
//        bar.setBackgroundDrawable(new ColorDrawable(Color.WHITE));

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        BottomNavigationView navigation = findViewById(R.id.bottom_nav);
        NavigationUI.setupWithNavController(navigation, navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_new_child:
                Intent addNewChildActivity = new Intent(this, AddNewChildActivity.class);
                startActivityForResult(addNewChildActivity, 101);
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}