package com.example.finismetodu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonOyna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOyna=findViewById(R.id.buttonOyna);
        buttonOyna.setOnClickListener(view -> {
            Intent yeniIntent= new Intent(MainActivity.this,ActivityOyunEkrani.class);
            startActivity(yeniIntent);
        });
    }
}