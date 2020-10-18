package com.example.TravelApp;

import androidx.appcompat.app.AppCompatActivity;
import com.example.TravelApp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ItalyActivity extends AppCompatActivity {
    TextView loc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);

        loc = findViewById(R.id.Locationonmap);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MapsActivity.class);
                intent.putExtra("latitiude" ,41.9026964 );
                intent.putExtra("Longitiude" , 12.4964953);
                startActivity(intent);
            }
        });
    }
}