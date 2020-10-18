package com.example.TravelApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PalestineActivity extends AppCompatActivity {
    TextView loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palestine);

        loc = findViewById(R.id.Locationonmap);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MapsActivity.class);
                intent.putExtra("latitiude" ,31.5019969 );
                intent.putExtra("Longitiude" , 34.4679139);
                startActivity(intent);
            }
        });
    }
}