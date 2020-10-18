package com.example.TravelApp;

import androidx.fragment.app.FragmentActivity;
import com.example.TravelApp.R;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
     double Point1;
    double Point2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent receiveIntent = this.getIntent();
        Point1= getIntent().getDoubleExtra("latitiude" , 0.0);
        Point2 = getIntent().getDoubleExtra("Longitiude" , 0.0);



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng petra = new LatLng(Point1, Point2);
        mMap.addMarker(new MarkerOptions().position(petra).title("Desired location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(petra));
    }
}