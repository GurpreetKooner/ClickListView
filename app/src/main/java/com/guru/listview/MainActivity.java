package com.guru.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] schemes = {"AAAA","BBBB","CCCC","DDDD","EEEE","FFFF"};
        ListView listView = (ListView) findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,schemes);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(MainActivity.this,Activity1.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(MainActivity.this,Activity2.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(MainActivity.this,Activity3.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(MainActivity.this,Activity4.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(MainActivity.this,Activity5.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent = new Intent(MainActivity.this,Activity6.class);
                    startActivity(intent);
                }
            }
        });

    }
}
