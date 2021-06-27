package com.batuhan.mysafegude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.batuhan.mysafegude.bacakegzersiz.dataList;

public class kolegzersizdetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolegzersizdetail);
        int position = getIntent().getExtras().getInt("key");
        ImageView flagImage = findViewById(R.id.iv_activity_details_img);
        TextView tvCountry = findViewById(R.id.tv_activity_details_country);

        getSupportActionBar().setTitle("EGZERSİZ TANIMI");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        flagImage.setImageResource(dataList.get(position).getmImg());
        tvCountry.setText(dataList.get(position).getmCountryName());
        Intent intent = getIntent();


    }
}