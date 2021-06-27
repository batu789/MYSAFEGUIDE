package com.batuhan.mysafegude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class esnemeegzersiz extends AppCompatActivity {

    static List<FlagType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esnemeegzersiz);
        ListView lvFlagList = findViewById(R.id.listview2);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.lion,"SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"LEG PRESS"));
        dataList.add(new FlagType(R.drawable.lion,"DEADLİFT "));
        dataList.add(new FlagType(R.drawable.lion,"LUNGES"));
        dataList.add(new FlagType(R.drawable.lion,"FRONT SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"BULGARIAN SPLIT SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"DUMBBELL STEPUP"));
        dataList.add(new FlagType(R.drawable.lion," SWİSS BALL LEG CURL"));
        dataList.add(new FlagType(R.drawable.lion,"SINGLE-LEG ROMANIAN DEADLIFT"));
        dataList.add(new FlagType(R.drawable.lion,"CALF RAISE"));
        dataList.add(new FlagType(R.drawable.lion,"WALKING LUNGE"));
        dataList.add(new FlagType(R.drawable.lion,"PAUSE SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"REVERSE LUNGE"));
        dataList.add(new FlagType(R.drawable.lion,"DUMBBELL SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"KETTLEBELL SWING "));
        dataList.add(new FlagType(R.drawable.lion,"JUMP SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"BARBELL CALF RAISE"));
        dataList.add(new FlagType(R.drawable.lion,"KNEELING HIP FLEXOR STRECTH"));
        dataList.add(new FlagType(R.drawable.lion,"SKATER SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"JUMPING CALF RAISE"));
        dataList.add(new FlagType(R.drawable.lion,"BARBELL HIP TRUST"));
        dataList.add(new FlagType(R.drawable.lion,"GLUTE BRIDGE WALKOUT"));
        dataList.add(new FlagType(R.drawable.lion,"SINGLE LEG-GLUTE BRIDGE"));
        dataList.add(new FlagType(R.drawable.lion,"SEATED CALF RAISE"));
        dataList.add(new FlagType(R.drawable.lion,"SWISS BALL WALL SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"REVERSE TABLE UP"));
        dataList.add(new FlagType(R.drawable.lion,"KETTLEBELL PRES-OUT"));
        dataList.add(new FlagType(R.drawable.lion,"SWISS BALL WALL SQUAT"));
        dataList.add(new FlagType(R.drawable.lion,"REVERSE TABLE UP"));
        dataList.add(new FlagType(R.drawable.lion,"OVERHEAD LUNGE"));
        dataList.add(new FlagType(R.drawable.lion,"KETTLEBELL PRES-OUT"));




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


}