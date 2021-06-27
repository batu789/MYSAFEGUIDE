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
public class omuzegzersiz extends AppCompatActivity {
    static List<FlagType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.omuzegzersizler);

        getSupportActionBar().setTitle("EGZERSİZ TANIMLARI");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView lvFlagList = findViewById(R.id.listview2);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.lion, "BARBELL OVERHEAD PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "STANDING DUMBBELL FLY"));
        dataList.add(new FlagType(R.drawable.lion, "FACEPULL"));
        dataList.add(new FlagType(R.drawable.lion, "HIGHPULL"));
        dataList.add(new FlagType(R.drawable.lion, "SEATED DUMBBELL CLEAN"));
        dataList.add(new FlagType(R.drawable.lion, "TRAP RAISE"));
        dataList.add(new FlagType(R.drawable.lion, "CLEAN AND PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "SNATCH GRİP PULL DOWN"));
        dataList.add(new FlagType(R.drawable.lion, "BAND BENT OVER LATERAL RAISE"));
        dataList.add(new FlagType(R.drawable.lion, "BAND FRONT RAISE"));
        dataList.add(new FlagType(R.drawable.lion, "SUSPENSION"));
        dataList.add(new FlagType(R.drawable.lion, "HINDU PUSH UP"));
        dataList.add(new FlagType(R.drawable.lion, "PIKE PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "DIP"));
        dataList.add(new FlagType(R.drawable.lion, "DUMBBELL NEUTRAL GRIP OVERHEAD PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "DUMBBELL RAISE COMPLEX"));
        dataList.add(new FlagType(R.drawable.lion, "SNATCH-GRIP LOW PULL"));
        dataList.add(new FlagType(R.drawable.lion, "SNATCH-GRIP SHRUG PULL"));
        dataList.add(new FlagType(R.drawable.lion, "FARMERS WALK"));
        dataList.add(new FlagType(R.drawable.lion, "RACK DEADLİFT"));
        dataList.add(new FlagType(R.drawable.lion, "DUMBBELL BENT-OVER LATERAL RAISE"));
        dataList.add(new FlagType(R.drawable.lion, "MACHINE SHOULDER PRESS"));
        dataList.add(new FlagType(R.drawable.lion, "BENT OVER REVERSE FLY"));


        FlagAdapter adapter = new FlagAdapter(getApplicationContext(), dataList);
        lvFlagList.setAdapter(adapter);
        lvFlagList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(view.getContext(), barbellbicepscurl.class);
                    startActivity(intent);


                }


            }

        });
    }

        @Override
        public boolean onOptionsItemSelected (@NonNull @NotNull MenuItem item){
            int id = item.getItemId();
            if (id == android.R.id.home) {
                Intent categoryIntent = new Intent(omuzegzersiz.this, bolgeler.class);
                startActivity(categoryIntent);
                finish();
            }


            return super.onOptionsItemSelected(item);
        }

    }





     






