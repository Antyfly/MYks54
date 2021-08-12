package com.example.ks54;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Vlados extends AppCompatActivity {
    private String[] Title;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vlados);
        Title = getResources().getStringArray(R.array.vlados);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vlados.this, Razraby.class);
                intent.putExtra("index", (Integer) 3); // счетчик для определения страницы
                startActivity(intent);
            }
        });

        ImageButton homes = (ImageButton) findViewById(R.id.homes);
        homes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vlados.this, MainActivity.class);
                intent.putExtra("index", (Integer) 1); // счетчик для определения страницы

                startActivity(intent);
            }
        });
    }

}
