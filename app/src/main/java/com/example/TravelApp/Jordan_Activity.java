package com.example.TravelApp;

import androidx.appcompat.app.AppCompatActivity;
import com.example.TravelApp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Jordan_Activity extends AppCompatActivity {
TextView loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jordan_activity_main);


        loc = findViewById(R.id.Locationonmap);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MapsActivity.class);
                intent.putExtra("latitiude" ,30.3215449 );
                intent.putExtra("Longitiude" , 35.4802033);
                startActivity(intent);
            }
        });
    }
}