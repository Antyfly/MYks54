package com.example.ks54;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class College extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.college);

        ImageButton kabs = (ImageButton)findViewById(R.id.kabs);
        kabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(College.this, Category.class);
                intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                startActivity(intent);
            }
        });

        ImageButton predmet = (ImageButton)findViewById(R.id.predmet);
        predmet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(College.this, Category.class);
                intent.putExtra("index",(Integer) 2); // счетчик для определения страницы

                startActivity(intent);
            }
        });

        ImageButton rasp = (ImageButton)findViewById(R.id.rasp);
        rasp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(College.this, Category.class);
                intent.putExtra("index",(Integer) 3); // счетчик для определения страницы

                startActivity(intent);
            }
        });

        ImageButton back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(College.this,MainActivity.class);
                intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                startActivity(intent);
            }
        });
    }
}
