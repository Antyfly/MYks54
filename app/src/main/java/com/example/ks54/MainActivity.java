package com.example.ks54;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        ImageButton kolledj = (ImageButton) findViewById(R.id.kolledj);
        kolledj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, College.class);
                //intent.putExtra("index",(Integer) 1); // счетчик для определения страницы
                startActivity(intent);
            }
        });
        ImageButton study = (ImageButton)findViewById(R.id.stud);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i;
                i = new Intent(MainActivity.this,Study.class);
                //intent.putExtra("index",(Integer) 2); // счетчик для определения страницы
                startActivity(i);
            }
        });

        ImageButton razb = (ImageButton)findViewById(R.id.razb);
        razb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Razraby.class);
                intent.putExtra("index",(Integer) 3); // счетчик для определения страницы
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}