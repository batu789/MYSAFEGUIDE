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
public class sogumaegzersiz extends AppCompatActivity {
    static List<FlagType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sogumaegzersiz);

        getSupportActionBar().setTitle("SOĞUMA EGZERSİZLERİ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ListView lvFlagList = findViewById(R.id.listview2);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion," "));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion," "));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));
        dataList.add(new FlagType(R.drawable.lion,""));




        FlagAdapter adapter = new FlagAdapter(getApplicationContext(),dataList);
        lvFlagList.setAdapter(adapter);
        lvFlagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

          /*      Intent intent = new Intent(getApplicationContext(),bacakegzersizlerdetail.class);

                intent.putExtra("key",position);
                startActivity(intent);*/


            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(sogumaegzersiz.this, bolgeler.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }


}









