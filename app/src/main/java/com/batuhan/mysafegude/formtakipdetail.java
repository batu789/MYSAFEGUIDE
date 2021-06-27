package com.batuhan.mysafegude;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class formtakipdetail extends AppCompatActivity {

    EditText bilek,bel,kalca, bacak,kololcusu,boyun, omuzolcusu,kanat;
    Button button;
    SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formtakipdetail);

        bilek =findViewById(R.id.bilek);
        bel =findViewById(R.id.bel);
       kalca =findViewById(R.id.kalca);
       bacak =findViewById(R.id.bacak);
        kololcusu =findViewById(R.id.kololcusu);
        boyun =findViewById(R.id.boyun);
       omuzolcusu =findViewById(R.id.omuzolcusu);
        kanat =findViewById(R.id.kanat);
        button =findViewById(R.id.button);
                database = this.openOrCreateDatabase("Arts",MODE_PRIVATE,null);

                Intent intent = getIntent();//burada yollanan intenti alıyoruz intentler yeni amaçlar oluşturur ve bu amaçlarlar sayesinde bilgileri alırız
                String info = intent.getStringExtra("info");//info isimli bir değişken oluşturduk ve info(putextra intent yani extra amaç)  içindeki "old" veya "new" adlı değerlere yani(bu intent(amaç) içindeki iki değerden birine gidecek
                if(info.matches("new")){//add arttan gelirsek ne olacak?...info adlı extra intenti new değeriyle eşleştririsek:
                    bilek.setText("");
                    bel.setText("");
                    kalca.setText("");
                    bacak.setText("");
                    kololcusu.setText("");
                    boyun.setText("");
                    omuzolcusu.setText("");
                    kanat.setText("");
                    button.setVisibility(View.VISIBLE);

                }else{//eşleştirmezsek: yani old değeri ile eşleştirirsek ne olacak?
                    int artId = intent.getIntExtra("artId",1);//artId extraintentinin içine gidecek orada varsayılan 1 değerine girecek ve orda yaptığı işlemler sounucu bir bir artId bulacak onuda getirecek değeri int olan artId değişkeninin içine atayacak.
                    button.setVisibility(View.INVISIBLE);

                    try {
                        Cursor cursor = database.rawQuery();
                    }catch (Exception e){

                    }


                }
            }

            public void SelectedImage(View view) {/*androidin sayfasında galeriye gitmenin protection levelı"dangerous" olduğu için aktivitemiz içerisinde kullanıcıdan izin istemeliyiz*/

                if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED) {/*uygulama açılırken de izin istendiği için önce bir kontrol yapmalıyız izin alınmış mı alınmamış mı diye.......ContextCompat API seviyesi 23 den sonrada çalışmaktadır yeni bir özelliktir.*/

                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);/*izin yoksa istedik.bir string dizisi içerisine hangi izni isteyeceğimizi girdik.{Manifest.permission.READ_EXTERNAL_STORAGE}iznini istedik.yani kısaca harici depolamaya gitmeye izin istedik ve bu komut satırının kullanım koduna 1 dedik.*/
                } else {
                    //aksi halde önceden verilmiş izin varsa galeriye götür ve galeriye gitme işlemi yine intentle(intent bir otomobil) yapılacak
                    Intent intentToGallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);/*beni al galeriye götür....URI :adres belirtir....  dosyanın URI ı ile dosyayı bulup intentler yadımıyla ulaşacağız*//*Belirlenen URİ ye (adrese) intentlerin (otomobil) yardımıyla gittik ve bu adresdeki veriyi bulduk.*/
                    startActivityForResult(intentToGallery, 2);/*Eli dolu gelecek elinde bir URI ile ve bizde bu metodu başlatmak için bu komut satırını kullancağız*/
            /*bir sonuç için aktivitemizi başlatıyoruz yani galeriye gitme işlemi yapılıyor URI ile
            eleman bulunuyor ama seçilen verinin veya verilerin(bu elemanların) bize verilmesi için hemen alttaki metot kullanılıyor*/

                }
            }


            @Override
            public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

                /*izini kullanıcı verince ne olacak?...izin taleplerinin sonucunda ne olacak?*/
                if (requestCode == 1){
                    if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                /*burada önce grantResults(verilen değer-sonuç) içerisinde bir eleman(foto) var mı
                kontrol ettik(kullanıcı telefonu kapatailir izin vermeyebilir) sonra varsa 0. indeksi(bu elemanı) tut izin verildi dedik.*/

                        Intent intentToGallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        startActivityForResult(intentToGallery, 2);
                    }

                }super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            }

            public void save(View view) {

                String bilek = bilek.getText().toString();
                String  bel= bel.getText().toString();
                String kalca = kalca.getText().toString();
                String  bacak= bacak.getText().toString();
                String  kololcusu= kololcusu.getText().toString();
                String boyun = boyun.getText().toString();
                String  omuzolcusu= omuzolcusu.getText().toString();
                String  kanat= kanat.getText().toString();

                try {/*veritabanını oluşturup kaydetme işlemi*/

                    database = this.openOrCreateDatabase("Arts",MODE_PRIVATE,null);
                    database.execSQL("CREATE TABLE IF NOT EXISTS arts(id INTEGER PRIMARY KEY,artname VARCHAR,paintername VARCHAR,year VARCHAR,image BLOB)");
                    String sqlString="INSERT INTO arts(artname,paintername,year,image)  VALUES(?,?,?,?) ";/*değerler eskiden yaptığımız gibi statik değil
             değişken bu yüzden soru işareti koyduk ve eskiden yaptığımız gibi execSQL komutunda bu sistem kullanılamaz olduğundan yeni bir String tanımladık (yani
             soru işaretlerinin değerlerini tek tek atamak için)*/
                    SQLiteStatement sqLiteStatement = database.compileStatement(sqlString);/*SQLiteStatement sınıfı sayesinde bu String
            değişkeninin SQL de çalışmasını sağlayacağız..*/

                    sqLiteStatement.bindString(1,bilek);
                    sqLiteStatement.bindString(2,bel);
                    sqLiteStatement.bindString(3,kalca);
                    sqLiteStatement.bindString(4,bacak);
                    sqLiteStatement.bindString(5,kololcusu);
                    sqLiteStatement.bindString(6,boyun);
                    sqLiteStatement.bindString(7,omuzolcusu);
                    sqLiteStatement.bindString(8,kanat);


                    sqLiteStatement.execute();

                    /*bir stringi sql de sql kodu gibi çalıştırmaya olanak tanıyor ve üstüne üstlük bağlamaya yarıyor mesela 1e artname 2ye paintername gibi*/


                }catch (Exception e){

                }
                finish();


            }


        }
