package com.example.wyther;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final Context context = this;
    private Button button;

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
}