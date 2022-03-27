package com.example.samplelinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.samplelinearlayout.MainActivity2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    //deklarasi variabel dengan tipe data EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    //deklarasi variabel dengan tipe data floating action
    Button BDaftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        edtEmail = findViewById(R.id.edEmail);
        edtPassword = findViewById(R.id.edpassword);
        BDaftar = findViewById(R.id.btSignin);
        edtrepass = findViewById(R.id.erepass);

        BDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

                Toast.makeText(getApplicationContext(), "Pendaftaran berhasil", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
//        edtNama = findViewById(R.id.ednama);
//        edtAlamat = findViewById(R.id.epass);
//        edtEmail = findViewById(R.id.edemail);
//        edtPassword = findViewById(R.id.edpassword);
//
//        //membuat method untuk event dari floating button
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //membuat kondisi untuk mengecek apakah edittext kosong atau tidak
//                if (edtNama.getText().toString().isEmpty() ||
//                        edtAlamat.getText().toString().isEmpty() ||
//                        edtEmail.getText().toString().isEmpty() ||
//                        edtPassword.getText().toString().isEmpty() ||
//                        edtrepass.getText().toString().isEmpty()) {
//                    //menampilkan pesan notifikasi jika seluruh edit text wajib diisi
//                    Snackbar.make(view, "Wajib isi seluruh data!", Snackbar.LENGTH_LONG).show();
//                } else {
//                    //membuat kondisi untuk mengecek apakah isi dari edit text password dan edtitext repassword
//                    //sama atau tidak
//                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString())) {
//                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil !",
//                                Toast.LENGTH_LONG).show();
//
//                        //method untuk kembali ke activity Main
//                        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
//                        startActivity(i);
//                    } else {
//                        //menampilkan pesan bahwa isi dari edittext password dan edittext repassword
//                        //tidak sama
//                        Snackbar.make(view, "Password dan Repassword harus sama !",
//                                Snackbar.LENGTH_LONG).show();
//                    }
//                }
//            }
//        });