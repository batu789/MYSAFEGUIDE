package com.batuhan.mysafegude;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class navigationmainactivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerlayout;
    NavigationView navigationview;
    private AppBarConfiguration mAppBarConfiguration;
    private FirebaseAuth firebaseAuth;/* Yeni bir FirebaseAuth sınıfından obje tanımladık.onOptionsItemSelected da kullanmak için.yani "menu" adlı Menüden
    Sign Out seçeneği seçilirse nasıl Sign In veya SignUp işlemlerinde FirebaseAuth sınıfını kullanmıştık burdada aynısını yapacağız.*/

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationactivity);




        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        firebaseAuth = FirebaseAuth.getInstance();//bu objeyi initialize ettik//
        drawerlayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationview = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { // options menüyü(sağ üst bağlamak için kullanılacak hazır method //
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigationactivity, menu);
        getMenuInflater().inflate(R.menu.optionsmenu, menu);//xml de koyduğumuz menu seçeneğini burada kodla bağlıyoruz.yani
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { // "menu" Menüsünden seçilen seçenek için yapılacaklar //
        if (item.getItemId() == R.id.signout) {
            firebaseAuth.signOut();
            Intent intentToSignUp = new Intent(navigationmainactivity.this, SignUpActivity.class);
            startActivity(intentToSignUp);
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();

    }


    public void egzersizler(View view) {

        Intent intent = new Intent(navigationmainactivity.this, bolgeler.class);
        startActivity(intent);
        finish();
    }

    public void kronometre(View view) {

        Intent intent = new Intent(navigationmainactivity.this, kronometre.class);
        startActivity(intent);
        finish();
    }


    public void dövüşsporları(View view) {

        Intent intent = new Intent(navigationmainactivity.this, dovussporlari.class);
        startActivity(intent);
        finish();
    }

    public void hazırantrenmanprogramları(View view) {

        Intent intent = new Intent(navigationmainactivity.this, hazirantrenmanprogramlari.class);
        startActivity(intent);
        finish();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.kronometree) {
            Intent intenttokronometre = new Intent(navigationmainactivity.this, kronometre.class);
            startActivity(intenttokronometre);
            finish();
        } else if (id == R.id.profill) {
            Intent intenttokronometre = new Intent(navigationmainactivity.this, profil.class);
            startActivity(intenttokronometre);
            finish();
        } else if (id == R.id.rehberr) {
            Intent intenttorehber = new Intent(navigationmainactivity.this, rehber.class);
            startActivity(intenttorehber);
            finish();
        }
         else if (id == R.id.egzersizlerr) {
            Intent intenttokronometre = new Intent(navigationmainactivity.this, bolgeler.class);
            startActivity(intenttokronometre);
            finish();
    } else if (id == R.id.nedendövüşsporlarıı) {
        Intent intenttonedendovussporlari = new Intent(navigationmainactivity.this, nedendovussporlari.class);
        startActivity(intenttonedendovussporlari);
        finish();
    } else if (id == R.id.nedensporyapmalıyım) {
        Intent intenttonedensporyapmaliyim = new Intent(navigationmainactivity.this, nedensporyapmaliyim.class);
        startActivity(intenttonedensporyapmaliyim);
        finish();
    } else if (id == R.id.dövüşsporlarıı) {
        Intent intenttodövüssporlari = new Intent(navigationmainactivity.this, dovussporlari.class);
        startActivity(intenttodövüssporlari);
        finish();
    } else if (id == R.id.hazırantrenmanprogramları) {
            Intent intenttokronometre = new Intent(navigationmainactivity.this, hazirantrenmanprogramlari.class);
            startActivity(intenttokronometre);
            finish();
        }
        else if (id == R.id.gerisayımm) {
            Intent intenttogerisayim = new Intent(navigationmainactivity.this, gerisayim.class);
            startActivity(intenttogerisayim);
            finish();
        }
        else if (id == R.id.instagramm) {
            Intent intenttokronometre = new Intent(navigationmainactivity.this, profil.class);
            startActivity(intenttokronometre);
            finish();
        }
        else if (id == R.id.twitterr) {
            Intent intenttokronometre = new Intent(navigationmainactivity.this, profil.class);
            startActivity(intenttokronometre);
            finish();
        }
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

    }
