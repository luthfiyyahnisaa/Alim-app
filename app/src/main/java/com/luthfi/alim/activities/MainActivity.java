package com.luthfi.alim.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.luthfi.alim.R;

public class MainActivity extends AppCompatActivity {
Button btnNiat, btnBacaan, btnDoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNiat = findViewById(R.id.btnNiat);
        btnNiat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNiat = new Intent(MainActivity.this, NiatShalatActivity.class);
                startActivity(intentNiat);
            }
        });

        btnBacaan = findViewById(R.id.btnBacaan);
        btnBacaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBacaan = new Intent(MainActivity.this, BacaanShalatActivity.class);
                startActivity(intentBacaan);
            }
        });

        btnDoa = findViewById(R.id.btnDoa);
        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDoa = new Intent(MainActivity.this, DoaShalatActivity.class);
                startActivity(intentDoa);
            }
        });


    }
}