package com.example.wyther;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Settings extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        databaseReference = FirebaseDatabase.getInstance().getReference("metrics");

        final String[] metrics = {"Celsius", "Fahrenheit"};

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();

        Switch switch1 = (Switch) findViewById(R.id.switch1);
        databaseReference.child("metrics");
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    editor.putString("unit", "imperial");
                    switch1.setChecked(true);
                    databaseReference.child(metrics[0]).setValue("Fahrenheit").addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull com.google.android.gms.tasks.Task<Void> task) {
                            Toast.makeText(Settings.this, "Added to database", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Settings.this, "Failed to add to database", Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    editor.putString("unit", "metric");
                    switch1.setChecked(false);
                    databaseReference.child(metrics[0]).setValue("Celsius").addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull com.google.android.gms.tasks.Task<Void> task) {
                            Toast.makeText(Settings.this, "Added to database", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Settings.this, "Failed to add to database", Toast.LENGTH_SHORT).show();
                        }
                    });

                }
                editor.apply();
                System.out.println(preferences.getString("unit", "metric"));
            }
        });

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
