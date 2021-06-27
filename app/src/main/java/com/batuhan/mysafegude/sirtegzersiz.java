
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
public class  sirtegzersiz extends AppCompatActivity {
    static List<FlagType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacakegzersiz);
        ListView lvFlagList = findViewById(R.id.listview2);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.lion,"DEADLIFT"));
        dataList.add(new FlagType(R.drawable.lion,"WEIGHTED PULL UP"));
        dataList.add(new FlagType(R.drawable.lion,"DUMBBELL ROMANIAN DEADLIFT"));
        dataList.add(new FlagType(R.drawable.lion,"PALLOF PRESS ISO HOLD"));
        dataList.add(new FlagType(R.drawable.lion,"INCLINE DUMBBELL ROW"));
        dataList.add(new FlagType(R.drawable.lion,"CHIN UP"));
        dataList.add(new FlagType(R.drawable.lion,"TRAP-BAR DEADLIFT"));
        dataList.add(new FlagType(R.drawable.lion,"ALTERNATING DUMBBELL ROW"));
        dataList.add(new FlagType(R.drawable.lion,"INVERTED ROW "));
        dataList.add(new FlagType(R.drawable.lion,"SNATCH-GRIP RACK DEADLIFT"));
        dataList.add(new FlagType(R.drawable.lion,"WIDE-GRIP PULL UP"));
        dataList.add(new FlagType(R.drawable.lion,"LANDMINE ONE-ARM ROW"));
        dataList.add(new FlagType(R.drawable.lion,"TOWEL CABLE ROW"));
        dataList.add(new FlagType(R.drawable.lion,"ROTATIONAL INVERTED ROW"));
        dataList.add(new FlagType(R.drawable.lion,"LYING LATERAL RAISE"));
        dataList.add(new FlagType(R.drawable.lion,"HANG CLEAN"));
        dataList.add(new FlagType(R.drawable.lion,"BACK EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion,"SEATED CABLE ROW"));
        dataList.add(new FlagType(R.drawable.lion,"BENT OVER REVERSE FLY"));
        dataList.add(new FlagType(R.drawable.lion,"AQUAMAN"));
        dataList.add(new FlagType(R.drawable.lion,"SUPERMAN"));
        dataList.add(new FlagType(R.drawable.lion,"SUSPENSION TRAINER CHIN UP"));
        dataList.add(new FlagType(R.drawable.lion,"SUSPENSION TRAINER INVERTED ROW"));
        dataList.add(new FlagType(R.drawable.lion,"SWISS BALL REVERSE BACK EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion,"YATES ROW"));
        dataList.add(new FlagType(R.drawable.lion,"BENT OVER ROW TO NECK"));
        dataList.add(new FlagType(R.drawable.lion,"LAT PULLDOWN"));
        dataList.add(new FlagType(R.drawable.lion,"CHEST SUPPORTED DUMBBELL ROW"));
        dataList.add(new FlagType(R.drawable.lion,"FORMERS WALK"));
        dataList.add(new FlagType(R.drawable.lion,"RENEGADE ROW"));
        dataList.add(new FlagType(R.drawable.lion,"GOOD MORNINGS"));



        FlagAdapter adapter = new FlagAdapter(getApplicationContext(),dataList);
        lvFlagList.setAdapter(adapter);
        lvFlagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

/*                Intent intent = new Intent(getApplicationContext(),bacakegzersizlerdetail.class);

                intent.putExtra("key",position);
                startActivity(intent);*/


            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(sirtegzersiz.this, bolgeler.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }


}
