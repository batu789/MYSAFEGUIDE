package com.batuhan.mysafegude;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import org.jetbrains.annotations.NotNull;

public class bolgeler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bolgeler);

        getSupportActionBar().setTitle("EGZERSİZ BÖLGELERİ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
    public void omuz (View view){

        Intent intent =new Intent(bolgeler.this, omuzegzersiz.class);
        startActivity(intent);
        finish();

    }
    public void bacak (View view){

        Intent intent =new Intent(bolgeler.this, bacakegzersiz.class);
        startActivity(intent);
        finish();

    }
    public void form (View view){

        Intent intent =new Intent(bolgeler.this, formegzersiz.class);
        startActivity(intent);
        finish();
    }
    public void esneme (View view){

        Intent intent =new Intent(bolgeler.this, esnemeegzersiz.class);
        startActivity(intent);
        finish();
    }
    public void soğuma (View view){

        Intent intent =new Intent(bolgeler.this, sogumaegzersiz.class);
        startActivity(intent);
        finish();
    }


    public void sırt (View view){

        Intent intent =new Intent(bolgeler.this, sirtegzersiz.class);
        startActivity(intent);
        finish();
    }
    public void kol (View view){

        Intent intent =new Intent(bolgeler.this, kolegzersiz.class);
        startActivity(intent);
        finish();
    }
    public void ısınma (View view){

        Intent intent =new Intent(bolgeler.this, isinmaegzersiz.class);
        startActivity(intent);
        finish();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(bolgeler.this, navigationmainactivity.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }

}