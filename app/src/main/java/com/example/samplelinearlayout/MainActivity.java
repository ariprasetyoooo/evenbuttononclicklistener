package com.example.samplelinearlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel  ssauntuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;
    TextView register;
    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        register = findViewById(R.id.register);
//
//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent ari = new Intent(getApplicationContext(),DaftarActivity.class);
//                startActivity(ari);
//            }
//        });
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == R.id.mnDaftar)
//        {
//            Intent i = new Intent(getApplicationContext(),DaftarActivity.class);
//            startActivity(i);
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),DaftarActivity.class);
                startActivity(i);
            }
        });

        //menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen butoon pada layout
        edpassword = findViewById(R.id.edpassword);

        //membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                if (nama.equals("ariprasetyo") && password.equals("12345")) {
                    Bundle b = new Bundle();
                    //key parsing data dimasukkan kedalam bundle
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtras(b);
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Anda Berhasil Login", Toast.LENGTH_LONG);
                    t.show();
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                } else if (nama.equals("ariprasetyo")) {
                    Toast.makeText(getApplicationContext(), "Password salah", Toast.LENGTH_SHORT).show();
                } else if (password.equals("12345")) {
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}