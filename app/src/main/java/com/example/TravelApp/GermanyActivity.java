package com.example.TravelApp;

import androidx.appcompat.app.AppCompatActivity;
import com.example.TravelApp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GermanyActivity extends AppCompatActivity {
    TextView loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);

        loc = findViewById(R.id.Locationonmap);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MapsActivity.class);
                intent.putExtra("latitiude" ,52.5163836 );
                intent.putExtra("Longitiude" , 13.3802595);
                startActivity(intent);
            }
        });
    }
}