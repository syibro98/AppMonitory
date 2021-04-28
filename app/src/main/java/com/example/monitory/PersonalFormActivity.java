package com.example.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Tanggal Pengerjaan: 28 April 2021
 * Deskripsi Pekerjaan: Latihan layouting dan intent passing serta force close application
 *                      View group yang digunakan adalah constraint
 *                      Pembuatan gradient custom button
 *                      Pembuatan custom edittext
 *
 * NIM: 10118052
 * Nama: Bagus Syibro Malisi
 * Kelas: IF-2
 */

public class PersonalFormActivity extends AppCompatActivity {

    public static final String INPUT_NICKNAME = "com.example.monitory.INPUT_NICKNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_form);
    }

    public void actNext(View view) {
        EditText nickName = (EditText) findViewById(R.id.fieldNickName);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, com.example.monitory.FinishActivity.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);
    }
}