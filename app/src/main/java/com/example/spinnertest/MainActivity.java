package com.example.spinnertest;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvTest;
    CustomData customData;
    ArrayList<Data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTest = findViewById(R.id.listViewTest);

        Data d1 = new Data("google", 1, R.drawable.ic_launcher_background);
        Data d2 = new Data("google", 2,R.drawable.ic_launcher_background);
        Data d3= new Data("google", 23,R.drawable.ic_launcher_background);

        list.add(d1);
        list.add(d2);
        list.add(d3);

        customData = new CustomData(this, R.layout.list_datatest, list);

        lvTest.setAdapter(customData);



    }


}