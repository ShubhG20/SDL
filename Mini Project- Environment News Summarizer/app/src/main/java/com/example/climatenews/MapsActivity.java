package com.example.climatenews;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


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

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        LatLng newdelhi= new LatLng(27, 77);
        LatLng newyork= new LatLng(41, -74);
        LatLng london= new LatLng(51, 0);
        LatLng capetown= new LatLng(-34, 18);
        LatLng riyadh= new LatLng(25, 47);

        mMap.addMarker(new MarkerOptions().position(sydney).title("Pacific"));
        mMap.addMarker(new MarkerOptions().position(newdelhi).title("Asia"));
        mMap.addMarker(new MarkerOptions().position(newyork).title("Americas"));
        mMap.addMarker(new MarkerOptions().position(london).title("Europe"));
        mMap.addMarker(new MarkerOptions().position(riyadh).title("Middle East"));
        mMap.addMarker(new MarkerOptions().position(capetown).title("Africa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(newdelhi));


        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {


                Intent i= new Intent(MapsActivity.this, Category.class);

                i.putExtra("content", marker.getTitle());

                startActivity(i);
               /** if(marker.getTitle().equals("Pacific")){

                    Intent i= new Intent(MapsActivity.this, Category.class);

                    i.putExtra("content", marker.getTitle());

                    startActivity(i);
                    return false;
                }


                if(marker.getTitle().equals("Asia")){

                    Intent i= new Intent(MapsActivity.this, Category.class);

                    i.putExtra("content", marker.getTitle());

                    startActivity(i);
                    return false;
                }

                if(marker.getTitle().equals("Americas")){

                    Intent i= new Intent(MapsActivity.this, Category.class);

                    i.putExtra("content", marker.getTitle());

                    startActivity(i);
                    return false;
                }

                if(marker.getTitle().equals("Europe")){

                    Intent i= new Intent(MapsActivity.this, Category.class);

                    i.putExtra("content", marker.getTitle());

                    startActivity(i);
                    return false;
                }

                if(marker.getTitle().equals("Middle East")){

                    Intent i= new Intent(MapsActivity.this, Category.class);

                    i.putExtra("content", marker.getTitle());

                    startActivity(i);
                    return false;
                }

                if(marker.getTitle().equals("Africa")){

                    Intent i= new Intent(MapsActivity.this, Category.class);

                    i.putExtra("content", marker.getTitle());

                    startActivity(i);
                    return false;
                }

*/

    return false;

            }
        });

       // mMap.setBuiltinzoomcontrols(true);





    }
}
