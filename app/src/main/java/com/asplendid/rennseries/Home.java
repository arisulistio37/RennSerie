package com.asplendid.rennseries;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void Intro(View view) {
        Intent Intro = new Intent(Home.this, Intro.class);
        startActivity(Intro);

    }

    public void Ow(View view) {
        Intent Ow = new Intent(Home.this, OpenWheel.class);
        startActivity(Ow);

    }

    public void Er(View view) {
        Intent Er = new Intent(Home.this, EnclosedWheel.class);
        startActivity(Er);

    }

    public void Mc(View view) {
        Intent Mc = new Intent(Home.this, McRacing.class);
        startActivity(Mc);

    }

    public void air(View view) {
        Intent air = new Intent(Home.this, AirRacing.class);
        startActivity(air);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.rsi)
                .setTitle(R.string.app_name)
                .setMessage("Kamu yakin ingin keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}
