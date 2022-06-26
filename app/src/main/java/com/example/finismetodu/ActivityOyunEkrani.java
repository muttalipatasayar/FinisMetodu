package com.example.finismetodu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityOyunEkrani extends AppCompatActivity {
    private Button buttonBitir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_ekrani);

        buttonBitir=findViewById(R.id.buttonBitir);
        buttonBitir.setOnClickListener(view -> {
            Intent yeniIntent= new Intent(ActivityOyunEkrani.this,ActivitySonuc.class);
            finish(); // aradan cikarmak istedigimiz ekran oldugunda finis metodunu o activity`e yazmamiz gerekir
            startActivity(yeniIntent);
        });

    }
}