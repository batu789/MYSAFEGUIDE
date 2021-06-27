package com.batuhan.mysafegude;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import org.jetbrains.annotations.NotNull;

public class hazirantrenmanprogramlari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazirantrenmanprogramlari);


        getSupportActionBar().setTitle("ANTRENMAN PROGRAMLARI");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(hazirantrenmanprogramlari.this, navigationmainactivity.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }
}