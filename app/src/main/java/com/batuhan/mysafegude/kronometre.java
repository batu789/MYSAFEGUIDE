package com.batuhan.mysafegude;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

public class kronometre extends AppCompatActivity {
    private Chronometer chronometer;
    private  long pauseoffset;
    private boolean running;
Button start,pause,reset;
ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kronometre);

        getSupportActionBar().setTitle("KRONOMETRE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

chronometer = findViewById(R.id.chronometer);
start =findViewById(R.id.start);
pause = findViewById(R.id.pause);
        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
    }

    public void  start (View view){
       Toast.makeText(this,"Başlatıldı",Toast.LENGTH_SHORT).show();
       if (!running){
           chronometer.setBase(SystemClock.elapsedRealtime()-pauseoffset);
       chronometer.start();
       running = true;
       }
       start.setVisibility(View.INVISIBLE);
       pause.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);


    }

    public void  pause (View view){
        Toast.makeText(this,"Durduruldu",Toast.LENGTH_SHORT).show();
        if (running){
            chronometer.stop();
            pauseoffset = SystemClock.elapsedRealtime()-chronometer.getBase();
            running = false;
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

        }
        start.setVisibility(View.VISIBLE);
        pause.setVisibility(View.INVISIBLE);
    }

    public void  reset (View view){
        Toast.makeText(this,"Sıfırlandı",Toast.LENGTH_SHORT).show();
        chronometer.setBase(SystemClock.elapsedRealtime());
     pauseoffset = 0;

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(kronometre.this, navigationmainactivity.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }


    }

