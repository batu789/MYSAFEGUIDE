package com.batuhan.mysafegude;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class formtakip extends AppCompatActivity {
    ListView listView;/*sqlite dan verileri çekip listview içerisinde göstericez bu yüzden bu listview ı oluşturduk*/
    ArrayList<String> nameArray;//listview da sıralanacak isimleri tutmak için (içerisinde Stringler olacak)
    ArrayList<Integer>  idArray;//id leri tutmak için(içerisinde numaralar olacak... tur sayısı dediğimiz)
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formtakip);

        listView=findViewById(R.id.listView);
                nameArray=new ArrayList<String>();
                idArray=new ArrayList<Integer>();
                arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,nameArray);
                /*Arrayadapter ları listview lar içerisinde bazı contentleri(içerik) göstermek için kullanırız*/
                listView.setAdapter(arrayAdapter);/*Bu işlemde ise listview ile arrayadapter ı birbirine
        bağlamış oluruz*/

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//tıklanınca ne olacak?
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {  //nereye tıklandığını buradaki int (position)değerinden alacağız.
                        Intent intent = new Intent(formtakip.this,formtakipdetail.class);  //tıklandığı zaman MA den M2A ye gidecek.
                        intent.putExtra("artId",idArray.get(position));   //position içindeki index alınacak idArray içerisine gidilecek ve position hangisine denk geliyorsa onun artId bilgisi alınacak.namedeki yazan artId bu extraintentin adı
                        intent.putExtra("info","old");  //yeni bir info adlı putExtraintent(extra amaç )koyduk ve listview içinden tıklanırsa old(eski sanat)isimli değeri açmaya çalışıyor aynı yere gidecek ama nerden geldiğimizi bilmek için yapıyoruz.
                        startActivity(intent);
                    }
                });




                getData();
            }
            public void getData() {/*verileri çekmek için oluşturduğumuz metot*/
                try {
                    SQLiteDatabase database = this.openOrCreateDatabase("Arts", MODE_PRIVATE, null);
                    Cursor cursor = database.rawQuery("SELECT * FROM arts", null);
                    int nameIx = cursor.getColumnIndex("artname");/*bütün artname paintername
            year ve görselleri çekmek yerine artname ve id yi çekeriz ve id yi mainactivity2 ye atarız sonra tekrar id den tüm bilgileri alırız*/
                    int idIx = cursor.getColumnIndex("id");
                    while (cursor.moveToNext()) {
                        nameArray.add(cursor.getString(nameIx));
                        idArray.add(cursor.getInt((idIx)));

                    }
                    arrayAdapter.notifyDataSetChanged();//dizilere yeni birşeyler ekledim bunu listende göster
                    cursor.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            /*"menu" yü MainActivity mizde tanıtmak için oncreate gibi önceden hazırlanmış 2 tane metot çağırıyoruz*/

            @Override
            public boolean onCreateOptionsMenu(Menu menu) {/*hangi menu yü belirleyeceğimizi gösteriyoruz*/
                //Inflater bir xml(menu) açtığımızda onu MainActivity içerisinde gösterebilmek için kullanılır
                MenuInflater menuInflater = getMenuInflater();
                menuInflater.inflate(R.menu.add_art,menu);/*Bu komut satırında oluşturduğumuz menu yu
        aktivitemize(MainActivity) bağlıyoruz.*/


                return super.onCreateOptionsMenu(menu);
            }


            @Override
            public boolean onOptionsItemSelected(@NonNull MenuItem item) {/*bizim şuan menu içerisinde tek bir item
    var ama bir kaçtane olsaydı bir seçme yapmamız gerekecekti ve bu metotun görevide bu.Kullanıcının
     neye tıkladığını anlamak için if kullanıyoruz*/
                if ((item.getItemId())== R.id.add_art_item)  {/*add_art_item a tıklandıysa ne yapıcaz?*/


                    Intent intent = new Intent(formtakip.this,formtakipdetail.class);
                    intent.putExtra("info","new");//burada ise add art tan geldiğimiz anlayacak yani new bir sanat eklemeye çalışıyoruz
                    startActivity(intent);
                }

                return super.onOptionsItemSelected(item);
            }
        }



    }
}