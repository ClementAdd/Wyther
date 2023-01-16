package com.example.wyther;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Favorite extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClickSettings(MenuItem item) {
        Intent intent = new Intent(this, Settings.class);
        //animation
        startActivity(intent);
    }

    public void onClickFiltre(MenuItem item) {
        Intent intent = new Intent(this, Filtre.class);
        startActivity(intent);
    }

    public void onClickFav(MenuItem item) {
        Intent intent = new Intent(this, Favorite.class);
        startActivity(intent);

    }

    public void onClickAbout(MenuItem item) {
        Intent intent = new Intent(this, About.class);
        this.startActivity(intent);
    }

    public void onClickHome(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
