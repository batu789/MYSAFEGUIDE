package com.batuhan.mysafegude;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {

    private FirebaseAuth  firebaseAuth; /* FirebaseAuthentication sınıfından firebaseAuth isimli bir obje oluşturduk.Bu objeyi sadece burada kullana
    cağımız için private olarak tanımladık.*/
    EditText emailText, passwordText;/*EditText sınıfından henüz fiziksel olarak var olan ancak gözükmeyen ve programında görmesi için
     birine emailText ismi ile bir diğerinede passwordText ismi ile bir isim atıp tanımlıyoruz.yani bu ikisi şuan oluşturulan iki obje henüz neyi temsil ettikleri bilinmiyor.Fiziksel olarak karşılıkları olması için biz tanımladık.*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth = FirebaseAuth.getInstance();/*objemizi initialize ediyoruz.yani değerini atıyoruz.*/
        emailText =findViewById(R.id.emailText);
        passwordText=findViewById(R.id.passwordText);/*Şuan ise fiziksel olarak karşılığı olan iki textimizi üst tarafta bu oluşturduğumuz objelere eşitliyoruz.*/
        Toast.makeText(SignUpActivity.this,"HOŞGELDİNİZ.... Üye değilseniz üye olmalısınız",Toast.LENGTH_LONG).show();

        FirebaseUser firebaseUser =firebaseAuth.getCurrentUser();//İçeride kullanıcı olup olmadığını kontrol eder.//

        if (firebaseUser!=null){//Eğer içeride kullanıcı var ise navigationacitivity ekranına götürecek yani içeri sokacak.//
            Intent intent =new Intent(SignUpActivity.this, navigationmainactivity.class);
            startActivity(intent);
            finish();//Tüm aktiviteleri destroy eder yani kapatır.//
        }

    }

    public void signInClicked (View view){
        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();

        firebaseAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Intent intent =new Intent(SignUpActivity.this, navigationmainactivity.class);
                startActivity(intent);
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(SignUpActivity.this,e.getLocalizedMessage().toString(),Toast.LENGTH_LONG).show();
            }
        });


    }

    public void signUpClicked (View view){
        String email = emailText.getText().toString();//Bunları burada tekrar bir değişkene attık ama ''firebaseAuth.createUserWithEmailAndPassword(emailText,passwordText)' böylede kullanabilirdik.//
        String password = passwordText.getText().toString();// tekrar bir değişkene atmamızın nedeni alert diyalog ile uyarı mesajı vermek istememiz.//
        if (email.matches("")){
            Toast.makeText(this,"E-Mail Adresinizi Girmelisiniz.",Toast.LENGTH_LONG).show();
        }
        if (password.matches("")){
            Toast.makeText(this,"Password Girmelisiniz.",Toast.LENGTH_LONG).show();
        }

        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(SignUpActivity.this,"BAŞARILI...Kullanıcı Oluşturuldu",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(SignUpActivity.this, navigationmainactivity.class);
                startActivity(intent);
                finish();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(SignUpActivity.this,e.getLocalizedMessage().toString(),Toast.LENGTH_LONG).show();
            }
        });



    }



}
