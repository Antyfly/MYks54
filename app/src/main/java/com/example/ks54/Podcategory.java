package com.example.ks54;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Podcategory extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    int Podcategory=0;
    int Category = 0;

    private String[] Title;
    private int[] text;
    private int[] Image;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcategory);
        Intent intent4 = getIntent();
        Category=intent4.getIntExtra("pos",0);
        Podcategory = intent4.getIntExtra("count", 0);

        imageView = findViewById(R.id.mem);
        textView = findViewById(R.id.text);

        if (Podcategory==1) {
            text = new int[]{R.string.mystical,R.string.volf,R.string.k401, R.string.k402, R.string.k403, R.string.k404, R.string.k405, R.string.k407, R.string.k408, R.string.k508};
            Title = getResources().getStringArray(R.array.kabs);
            Image = new int[]{R.drawable.magic,R.drawable.iu,R.drawable.adishkin,R.drawable.vieru,R.drawable.bastrikin,R.drawable.kazihaniv,R.drawable.kalashnikov,R.drawable.orlov,R.drawable.tokar,R.drawable.nesquik};

            ImageButton back = (ImageButton)findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Podcategory.this,Category.class);
                    intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                    startActivity(intent);
                }
            });

            ImageButton homes = (ImageButton)findViewById(R.id.homes);
            homes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Podcategory.this,MainActivity.class);
                    intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                    startActivity(intent);
                }
            });

        }
        else if(Podcategory == 2)
        {
            Image = new int[] {R.drawable.filosofia,R.drawable.mdk0103,R.drawable.mdk0101,R.drawable.fizra,R.drawable.bj,R.drawable.mdk0402,R.drawable.mdk1101};
            text = new int[]{R.string.filos, R.string.mdk0103, R.string.mdk0101, R.string.fizra, R.string.bj, R.string.mdk0402, R.string.mdk1101};
            Title = getResources().getStringArray(R.array.predmet);

            ImageButton back = (ImageButton)findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Podcategory.this,Category.class);
                    intent.putExtra("index",(Integer) 2); // счетчик для определения страницы

                    startActivity(intent);
                }
            });

            ImageButton homes = (ImageButton)findViewById(R.id.homes);
            homes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Podcategory.this,MainActivity.class);
                    intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                    startActivity(intent);
                }
            });
        }
        else if(Podcategory == 3) {
            Image =new int[] {R.drawable.pon,R.drawable.vt,R.drawable.cr,R.drawable.cht,R.drawable.razvr,R.drawable.cub};
            text = new int[]{R.string.pn, R.string.vt, R.string.sr, R.string.cht, R.string.pt, R.string.cb};
            Title = getResources().getStringArray(R.array.raspisanie);

            ImageButton back = (ImageButton)findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Podcategory.this,Category.class);
                    intent.putExtra("index",(Integer) 3); // счетчик для определения страницы

                    startActivity(intent);
                }
            });
            ImageButton homes = (ImageButton)findViewById(R.id.homes);
            homes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Podcategory.this,MainActivity.class);
                    intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                    startActivity(intent);
                }
            });

        }

        imageView.setImageResource(getResources().getIdentifier(String.valueOf(Image[Category]), "drawble", getPackageName()));
        textView.setText(text[Category]);
        setTitle(Title[Category]);



    }

}