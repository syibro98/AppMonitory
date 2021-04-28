package com.example.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Tanggal Pengerjaan: 28 April 2021
 * Deskripsi Pekerjaan: Latihan layouting dan intent passing serta force close application
 *                      layouting yang dibuat adalah aplikasi Monitory
 *                      View group yang digunakan adalah kombinasi dari constraint, relative, dan linear
 *                      Pembuatan gradient custom button
 *                      Pembuatan custom edittext
 *                      Pembuatan form validation untuk nama panggilan
 *
 * NIM: 10118052
 * Nama: Bagus Syibro Malisi
 * Kelas: IF-2
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actStart(View view) {
        Intent intent = new Intent(this, com.example.monitory.VerifyCodeActivity.class);
        startActivity(intent);
    }
}