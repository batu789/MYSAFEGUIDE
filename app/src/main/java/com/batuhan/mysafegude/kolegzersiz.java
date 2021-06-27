
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
public class kolegzersiz extends AppCompatActivity {
    static List<FlagType> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolegzersiz);

        getSupportActionBar().setTitle("KOL EGZERSİZLERİ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ListView lvFlagList = findViewById(R.id.listview2);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.lion, "BARBELL BICEPS CURL"));
        dataList.add(new FlagType(R.drawable.lion, "DUMBBELL PREACHER CURL"));
        dataList.add(new FlagType(R.drawable.lion, "CABLE PREACHER CURL "));
        dataList.add(new FlagType(R.drawable.lion, "SKULL CRASHER"));
        dataList.add(new FlagType(R.drawable.lion, "CABLE TRICEPS PUSHDOWN"));
        dataList.add(new FlagType(R.drawable.lion, "SINGLE-ARM DUMBBELL OVERHEAD TRICEPS EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion, "HAMMER CURL"));
        dataList.add(new FlagType(R.drawable.lion, "CLOSE GRIP CURL"));
        dataList.add(new FlagType(R.drawable.lion, "CHIN-UP"));
        dataList.add(new FlagType(R.drawable.lion, "SUSPENSION TRAINER TRICEPS EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion, "DIAMOND PUSH UP"));
        dataList.add(new FlagType(R.drawable.lion, "NEUTRAL-GRIP TRICEPS EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion, "POUNDSTONE CURL"));
        dataList.add(new FlagType(R.drawable.lion, "SUSPENSION TRAINER ROTATIONAL INVERTED ROW"));
        dataList.add(new FlagType(R.drawable.lion, "SUSPENSION TRAINER BICEPS CURL "));
        dataList.add(new FlagType(R.drawable.lion, "BEHIND-THE-BACK CABLE CURL"));
        dataList.add(new FlagType(R.drawable.lion, "EZ-BAR PREACHER CURL"));
        dataList.add(new FlagType(R.drawable.lion, "REVERSE CURL"));
        dataList.add(new FlagType(R.drawable.lion, "WIDE-GRIP CURL"));
        dataList.add(new FlagType(R.drawable.lion, "OVERHEAD PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "PULLOVER/TRICEPS EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion, "CONVENTIONAL CURL"));
        dataList.add(new FlagType(R.drawable.lion, "SIDE CURL WITH BAND"));
        dataList.add(new FlagType(R.drawable.lion, "DECLINE TRICEPS EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion, "CLOSE GRIP BENCH PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "LYING TRICEPS EXTENSION"));
        dataList.add(new FlagType(R.drawable.lion, "FACE PULL"));
        dataList.add(new FlagType(R.drawable.lion, "UNDERHAND KICKBACK"));
        dataList.add(new FlagType(R.drawable.lion, "TATE PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "HINDU PUSH-UP"));


        FlagAdapter adapter = new FlagAdapter(getApplicationContext(), dataList);
        lvFlagList.setAdapter(adapter);
        lvFlagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(view.getContext(), barbellbicepscurl.class);
                    startActivity(intent);

                }
                if (position == 6) {

                    Intent intent = new Intent(view.getContext(), hammerlcurl.class);
                    startActivity(intent);

                }

            }

        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categoryIntent = new Intent(kolegzersiz.this, bolgeler.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }
}











