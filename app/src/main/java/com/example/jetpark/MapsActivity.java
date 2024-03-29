package com.example.jetpark;



import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button carpark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        carpark = findViewById(R.id.carpark);
        carpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSlotActivity();
            }
        });

    }

    public void openSlotActivity()
    {
        Intent lot = new Intent(this,Space_Booking.class);
        startActivity(lot);
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
      /*  LatLng sydney = new LatLng(1.2947057,103.8565883);
         CameraUpdate yourLoca = CameraUpdateFactory.newLatLngZoom(sydney,18);
          mMap.animateCamera(yourLoca);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        mMap.setMaxZoomPreference(20);
    */


        LatLng sydney = new LatLng(1.2947057,103.8565883);
        CameraUpdate yourLoca = CameraUpdateFactory.newLatLngZoom(sydney,18);
        mMap.animateCamera(yourLoca);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
    }
}
