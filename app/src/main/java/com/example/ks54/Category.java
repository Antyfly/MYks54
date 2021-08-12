package com.example.ks54;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Category extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.texthistory);
        listView = findViewById(R.id.listitem);

        Intent intent = getIntent();
        index = intent.getIntExtra("index",0);

        if (index == 1)
        {
            setTitle(R.string.Zagkab);
            listView =(ListView)findViewById(R.id.listitem);
            ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(
                    this,R.array.kabs, android.R.layout.simple_list_item_1);
            listView.setAdapter(adapter);

            ImageButton backs = (ImageButton)findViewById(R.id.backs);
            backs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Category.this,College.class);
                    intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                    startActivity(intent);
                }
            });
        }
        else if (index==2)
        {
            setTitle(R.string.ZagPredmet);
            listView =(ListView)findViewById(R.id.listitem);
            ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(
                    this,R.array.predmet, android.R.layout.simple_list_item_1);
            listView.setAdapter(adapter);

            ImageButton backs = (ImageButton)findViewById(R.id.backs);
            backs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Category.this,College.class);
                    intent.putExtra("index",(Integer) 2); // счетчик для определения страницы

                    startActivity(intent);
                }
            });

        }
        else if (index ==3)
        {
            setTitle(R.string.ZagRaspisanie);
            listView =(ListView)findViewById(R.id.listitem);
            ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(
                    this,R.array.raspisanie, android.R.layout.simple_list_item_1);
            listView.setAdapter(adapter);


            ImageButton backs = (ImageButton)findViewById(R.id.backs);
            backs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(Category.this,College.class);
                    intent.putExtra("index",(Integer) 4); // счетчик для определения страницы

                    startActivity(intent);
                }
            });
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent3 = new Intent(Category.this,Podcategory.class);
                intent3.putExtra("pos",i);
                intent3.putExtra("count", index);
                startActivity(intent3);

            }
        });

    }




}