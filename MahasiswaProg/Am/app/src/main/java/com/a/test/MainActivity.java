package com.a.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomerPendaftaran,etNama;
    Button btnDaftar;
    String nomorPendaftaran,nama;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNomerPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.et_Nama_Calon_Mahasiswa);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomorPendaftaran = etNomerPendaftaran.getText().toString();
                nama = etNama.getText().toString();

                if (nomorPendaftaran.trim().equals("")){
                    etNomerPendaftaran.setError("Diisi Dulu!");
                }else if (nama.trim().equals("")){
                    etNama.setError("maaf harus diisi");

                }else{
                    Toast.makeText(MainActivity.this,"Selamat"+
                            nama +", Anda Terdaftar!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}