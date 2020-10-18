package com.example.TravelApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.Arrays;
import java.util.List;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        List<Travel> myListData = Arrays.asList(new Travel[]{
                new Travel(R.drawable.jordan, "Jordan", "Petra" , "5 Days" , "400JD"),
                new Travel(R.drawable.palestine, "Palestine", "Gaza" , "3 Days" , "400JD"),
                new Travel(R.drawable.qatar, "Qatar", "Doha" , "4 Days" , "400JD"),
                new Travel(R.drawable.spain, "Spain", "Madrid" , "5 Days" , "$ 330"),
                new Travel(R.drawable.germany, "Germany", "Berlin" , "6 Days" , "$ 620"),
                new Travel(R.drawable.italy, "Italy", "Rome" , "2 Days" , "$ 469"),

        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.countries_rc);
        MyListAdapter adapter = new MyListAdapter(this, myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}