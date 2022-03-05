package com.example.samplelinearlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel  ssauntuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen butoon pada layout
        edpassword=findViewById(R.id.edpassword);

        //membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();
                
                if (nama.equals("ari@gmai.com")&&password.equals("12345")){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                }
                else if (nama.equals("ari@gmail.com")){
                    Toast.makeText(getApplicationContext(), "Password salah", Toast.LENGTH_SHORT).show();
                }
                else if (password.equals("12345")){
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}