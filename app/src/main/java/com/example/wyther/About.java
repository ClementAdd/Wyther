package com.example.wyther;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class About extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.about);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SunView sunView = new SunView(this);
        addContentView(sunView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


    }

    public static class SunView extends View {

        public SunView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int width = getWidth();
            int height = getHeight();

            Paint paint = new Paint();
            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);

            canvas.drawCircle(width / 2, (float) (height / 1.25), 150, paint);

            paint.setColor(Color.YELLOW);

            paint.setStyle(Paint.Style.STROKE);

            paint.setStrokeWidth(20);

            canvas.drawLine(width / 2 - 250, (float) (height / 1.25),
                    width / 2 + 250, (float) (height / 1.25), paint);
            canvas.drawLine(width / 2, (float) (height / 1.25) - 250,
                    width / 2, (float) (height / 1.25) + 250, paint);
            canvas.drawLine(width / 2 - 170, (float) (height / 1.25) - 170,
                    width / 2 + 170, (float) (height / 1.25) + 170, paint);
            canvas.drawLine(width / 2 - 170, (float) (height / 1.25) + 170,
                    width / 2 + 170, (float) (height / 1.25) - 170, paint);
            canvas.drawLine(width / 2 - 100, (float) (height / 1.25) - 250,
                    width / 2 + 100, (float) (height / 1.25) + 250, paint);
            canvas.drawLine(width / 2 - 100, (float) (height / 1.25) + 250,
                    width / 2 + 100, (float) (height / 1.25) - 250, paint);
            canvas.drawLine(width / 2 - 250, (float) (height / 1.25) - 100,
                    width / 2 + 250, (float) (height / 1.25) + 100, paint);
            canvas.drawLine(width / 2 - 250, (float) (height / 1.25) + 100,
                    width / 2 + 250, (float) (height / 1.25) - 100, paint);


        }
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

