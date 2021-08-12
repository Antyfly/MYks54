package com.example.ks54;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class odnogrup extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    int Podcategory=0;
    int Category = 0;

    private String[] Title;
    private int[] text;
    private int[] Image;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.odnogrup);
        Intent intent4 = getIntent();
        Category=intent4.getIntExtra("pos",0);
        Podcategory = intent4.getIntExtra("count", 0);

        imageView = findViewById(R.id.memi);
        textView = findViewById(R.id.texti);

        if (Podcategory == 0)
        {
            text = new int[]{R.string.divana, R.string.altina, R.string.danila, R.string.nastia, R.string.bogdan, R.string.sergey, R.string.isakova, R.string.nikita, R.string.vika, R.string.vadim1, R.string.ksusha, R.string.pomazan, R.string.dasha, R.string.pp, R.string.sinitin, R.string.cac, R.string.andre, R.string.vitya, R.string.seva, R.string.dima, R.string.denis, R.string.ribasov, R.string.beloborodov};
            Title = getResources().getStringArray(R.array.isp94);
            Image = new int[]{R.drawable.divana, R.drawable.altina, R.drawable.danila, R.drawable.nastia, R.drawable.bogdan, R.drawable.sergey, R.drawable.isakova, R.drawable.nikita, R.drawable.vika, R.drawable.vadim1, R.drawable.ksusha, R.drawable.pomazan, R.drawable.dasha, R.drawable.pp, R.drawable.sinitin, R.drawable.cac, R.drawable.andre, R.drawable.vitia, R.drawable.seva, R.drawable.dima, R.drawable.denis, R.drawable.ribasov, R.drawable.beloborodov};

            ImageButton back = (ImageButton) findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(odnogrup.this, Study.class);
                    intent.putExtra("index", (Integer) 0); // счетчик для определения страницы
                    startActivity(intent);
                }
            });

            ImageButton homes = (ImageButton) findViewById(R.id.homes);
            homes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(odnogrup.this, MainActivity.class);
                    intent.putExtra("index", (Integer) 1); // счетчик для определения страницы

                    startActivity(intent);
                }
            });
        }
        else if (Podcategory <30)
        {
            text = new int[]{R.string.lazy_tima,R.string.bidlo,R.string.sveto};
            Title = getResources().getStringArray(R.array.razraby);
            Image = new int[]{R.drawable.tima, R.drawable.bidlo,R.drawable.sveto};

            ImageButton back = (ImageButton) findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(odnogrup.this, Razraby.class);
                    intent.putExtra("index", (Integer) 3); // счетчик для определения страницы

                    startActivity(intent);
                }
            });

            ImageButton homes = (ImageButton) findViewById(R.id.homes);
            homes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(odnogrup.this, MainActivity.class);
                    intent.putExtra("index", (Integer) 3); // счетчик для определения страницы

                    startActivity(intent);
                }
            });
        }



        imageView.setImageResource(getResources().getIdentifier(String.valueOf(Image[Category]), "drawble", getPackageName()));
        textView.setText(text[Category]);
        setTitle(Title[Category]);



    }

}