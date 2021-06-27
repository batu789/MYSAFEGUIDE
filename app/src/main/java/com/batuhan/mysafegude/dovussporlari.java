package com.batuhan.mysafegude;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
public class dovussporlari extends AppCompatActivity {
    static List<FlagType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dovussporlari);

        getSupportActionBar().setTitle("DÖVÜŞ SPORLARI ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ListView lvFlagList = findViewById(R.id.listview2);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.lion,"KickBoks Gard Duruşu /KickBoxing GUARD Position"));
        dataList.add(new FlagType(R.drawable.lion,"Boks Gard Duruşu /Boxing GUARD Position"));
        dataList.add(new FlagType(R.drawable.lion,"MuayThai Gard Duruşu /MuayThai GUARD Position"));
        dataList.add(new FlagType(R.drawable.lion,"SOL DİREKT YUMRUK /LEFT JAB"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ DİREKT YUMRUK  /RIGHT JAB"));
        dataList.add(new FlagType(R.drawable.lion,"SOL KROŞE YUMRUK /LEFT HOOK"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ KROŞE YUMRUK  /RIGHT HOOK"));
        dataList.add(new FlagType(R.drawable.lion,"SOL APARKAT YUMRUK /LEFT UPPERCUT"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ APARKAT YUMRUK /RIGHT UPPERCUT"));
        dataList.add(new FlagType(R.drawable.lion,"SOL DİRSEK /LEFT ELBOW"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ DİRSEK /RIGHT ELBOW"));
        dataList.add(new FlagType(R.drawable.lion,"SOL DÜŞÜK-DAİRESEL TEKME /LEFT LOW KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ DÜŞÜK-DAİRESEL TEKME /RIGHT LOW KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SOL ORTA-DAİRESEL TEKME /LEFT MIDDLE KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ ORTA-DAİRESEL TEKME /RIGHT MIDDLE KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SOL YÜKSEK-DAİRESEL TEKME /LEFT HIGH KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ YÜKSEK-DAİRESEL TEKME /RIGHT HIGH KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SOL İTİŞ TEKME /LEFT PUSH KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ İTİŞ TEKME /RIGHT PUSH KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SOL ÖN TEKME /LEFT FRONT KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ ÖN TEKME /RIGHT FRONT KICK"));
        dataList.add(new FlagType(R.drawable.lion,"KANCA TEKME /HOOL KICK"));
        dataList.add(new FlagType(R.drawable.lion,"TOPUK TEKME /HEEL KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SOL BALTA TEKME /LEFT AXE KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ BALTA TEKME /RIGHT AXE KICK"));
        dataList.add(new FlagType(R.drawable.lion,"GERİ TEKME /BACK KICK"));
        dataList.add(new FlagType(R.drawable.lion,"SOL DİZ /LEFT KNEE"));
        dataList.add(new FlagType(R.drawable.lion,"SAĞ DİZ /RIGHT KNEE"));





        FlagAdapter adapter = new FlagAdapter(getApplicationContext(),dataList);
        lvFlagList.setAdapter(adapter);
        lvFlagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*Intent intent = new Intent(getApplicationContext(),bacakegzersizlerdetail.class);

                intent.putExtra("key",position);
                startActivity(intent);*/


            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(dovussporlari.this, navigationmainactivity.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }

}









