package com.example.wyther;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.card_main);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Quittez l'application ?")
                .setMessage("Etes vous sur de vouloir quitter l'application ?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, (arg0, arg1) -> {
                    finish();
                    System.exit(0);
                }).create().show();
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
}