package com.example.ks54;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Study extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study);
        listView = findViewById(R.id.listitem1);

        Intent intent = getIntent();
        index = intent.getIntExtra("index",0);


        setTitle(R.string.Isp94);
        listView =(ListView)findViewById(R.id.listitem1);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(
                this,R.array.isp94, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        ImageButton backs = (ImageButton)findViewById(R.id.backs);
        backs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Study.this,MainActivity.class);
                intent.putExtra("index",(Integer) 1); // счетчик для определения страницы

                startActivity(intent);
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent3 = new Intent(Study.this,odnogrup.class);
                intent3.putExtra("pos",i);
                intent3.putExtra("count", index);
                startActivity(intent3);
            }
        });

    }
}