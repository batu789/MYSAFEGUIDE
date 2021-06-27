
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
public class isinmaegzersiz extends AppCompatActivity {
    static List<FlagType> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isinmaegzersiz);


        getSupportActionBar().setTitle("ISINMA EGZERSİZLERİ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ListView lvFlagList = findViewById(R.id.listview2);
        dataList = new ArrayList<FlagType>();
        dataList.add(new FlagType(R.drawable.lion,"JUMPING JACKS (KELEBEK)"));
        dataList.add(new FlagType(R.drawable.lion,"ARMS CIRCLE (KOLLARI ÇEVİRME)"));
        dataList.add(new FlagType(R.drawable.lion,"MOUNTAIN CLIMBERS (DAĞ TIRMANIŞI)"));
        dataList.add(new FlagType(R.drawable.lion,"SWINGING TOE TOUCHES (PARMAK UCUNA DOKUNMA)"));
        dataList.add(new FlagType(R.drawable.lion,"HIP CIRCLES (KALÇA ÇEVİRME)"));
        dataList.add(new FlagType(R.drawable.lion,"BODYWEIGHTS SQUATS (VÜCUT AĞIRLIĞI İLE SQUAT)"));
        dataList.add(new FlagType(R.drawable.lion,"KNEE PUSH UPS (DİZ ÜZERİNDE ŞINAV)"));
        dataList.add(new FlagType(R.drawable.lion,"REGULAR PUSH UP (NORMAL ŞINAV)"));
        dataList.add(new FlagType(R.drawable.lion,"BODYWEIGHT LUNGES (VÜCUT AĞIRLIĞI İLE LUNGE)"));
        dataList.add(new FlagType(R.drawable.lion,"KNEE PUSH UPS (DİZ ÜZERİNDE ŞINAV)"));
        dataList.add(new FlagType(R.drawable.lion,"REGULAR PUSH UP (NORMAL ŞINAV)"));
        dataList.add(new FlagType(R.drawable.lion,"BODYWEIGHT LUNGES (VÜCUT AĞIRLIĞI İLE LUNGE"));
        dataList.add(new FlagType(R.drawable.lion," BEAR WALK (AYI YÜRÜYÜŞÜ)"));
        dataList.add(new FlagType(R.drawable.lion,"WALKING LIZARD LUNGE (KERTENKELE LUNGE)"));
        dataList.add(new FlagType(R.drawable.lion,"PRONE THORACIC MOBILIZATION (GÖĞÜS MOBİLİTESİ)"));
        dataList.add(new FlagType(R.drawable.lion,"INCH WORMS (EĞİLİP UZANMA)"));
        dataList.add(new FlagType(R.drawable.lion,"LEG SWINGS (BACAK SALLAMA)"));
        dataList.add(new FlagType(R.drawable.lion,"COSSACK SQUAT (YAN SQUAT)"));
        dataList.add(new FlagType(R.drawable.lion,"SHOULDER ROTATIONS (OMUZ ÇEVİRME)"));
        dataList.add(new FlagType(R.drawable.lion,"DYNAMIC CHEST (GÖĞÜS AÇMA)"));
        dataList.add(new FlagType(R.drawable.lion,"HIP ROTATIONS (KALÇA ÇEVİRME)"));
        dataList.add(new FlagType(R.drawable.lion,"SINGLE LEG HOP (TEK BACAK SIÇRAMA)"));
        dataList.add(new FlagType(R.drawable.lion,"TORSO ROTATIONS (BEL ÇEVİRME)"));
        dataList.add(new FlagType(R.drawable.lion,"SIDE TO-SIDE HOPS (YANLARA SIÇRAMA)"));
        dataList.add(new FlagType(R.drawable.lion,"HOPS ON THE SPOT (DİK SIÇRAMA)"));
        dataList.add(new FlagType(R.drawable.lion,"NECK ROTATIONS SIDE AND UP (BOYUN ÇEVİRME)"));
        dataList.add(new FlagType(R.drawable.lion,"SIDE ARM RAISE (KANAT ÇIRPMA)"));
        dataList.add(new FlagType(R.drawable.lion,"ARM ROTATIONS (TESLİM OLMA)"));
        dataList.add(new FlagType(R.drawable.lion,"CHEST EXPANSIONS (GÖĞÜS VE SIRT AÇMA)"));
        dataList.add(new FlagType(R.drawable.lion,"HIGH KNEE HUG (ADIMLA DİZ ÇEKME)"));
        dataList.add(new FlagType(R.drawable.lion,"HIGH KNEE (DİZ ÇEKME)"));
        dataList.add(new FlagType(R.drawable.lion,"HIGH KNEE LATERALLY (YAN DİZ ÇEKME)"));
        dataList.add(new FlagType(R.drawable.lion,"SPIDERMAN (ÖRÜMCEK ADAM)"));
        dataList.add(new FlagType(R.drawable.lion,"ATLAS (SELAMLI KOMANDO YÜRÜYÜŞÜ)"));
        dataList.add(new FlagType(R.drawable.lion,"SPEED SKATER (KAYAKÇI SIÇRAMASI)"));
        dataList.add(new FlagType(R.drawable.lion,"SHUFFLE (YANA KOŞMA"));
        dataList.add(new FlagType(R.drawable.lion,"SUMO SHUFFLE (YAN ADIMLAMA)"));
        dataList.add(new FlagType(R.drawable.lion,"KARAOKE (YANA ADIMLA DİZ ÇEKME)"));
        dataList.add(new FlagType(R.drawable.lion,"BACKWARDS HIP ROTATION (KALÇA ÇEVİRİP LUNGE YAPMA)"));
        dataList.add(new FlagType(R.drawable.lion,"TOY SOLDIER (ADIMLA AYAK KALDIRMA)"));
        dataList.add(new FlagType(R.drawable.lion,"BACK ELBOW THROWING (GERİYE DİRSEK ATMA)"));






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
            Intent categoryIntent = new Intent(isinmaegzersiz.this, bolgeler.class);
            startActivity(categoryIntent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }


}

