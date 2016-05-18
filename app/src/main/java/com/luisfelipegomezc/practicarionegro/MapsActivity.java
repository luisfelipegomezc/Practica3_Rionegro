package com.luisfelipegomezc.practicarionegro;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle extras = getIntent().getExtras();

        mapa = extras.getInt("mapa");


        /*
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        */
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

        if(mapa==1) {
            LatLng catedral = new LatLng(6.152896, -75.372904);
            mMap.addMarker(new MarkerOptions().position(catedral).title("Rionegro Ant")
                    .snippet("Cabecera Mpal"));

            mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(8));
            /*
            //mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

            catedral (6.152896, -75.372904)
            comfama
            */
        }else {
            if(mapa==2) {

                LatLng catedral = new LatLng(6.152896, -75.372904);
                mMap.addMarker(new MarkerOptions().position(catedral).title("Catedral de Rionegro")
                        .snippet("Parque PPal"));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(20));

                /*LatLng sydney = new LatLng(-34, 151);
                mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
*/
            }else{
                if(mapa==3){
                    LatLng catedral = new LatLng(6.129839, -75.379804);
                    mMap.addMarker(new MarkerOptions().position(catedral).title("San Antonio de Pereira")
                            .snippet("Corregimiento"));

                    mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                }else{
                    if(mapa==4){
                        LatLng catedral = new LatLng(6.138386, -75.378587);
                        mMap.addMarker(new MarkerOptions().position(catedral).title("Comfama")
                                .snippet("Parque Recreativo"));

                        mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                        mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                    }else{
                        if(mapa==5){
                            LatLng catedral = new LatLng(6.171390, -75.428798);
                            mMap.addMarker(new MarkerOptions().position(catedral).title("AeroPuerto")
                                    .snippet("Base Aerea"));

                            mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                            mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                        }else{
                            if(mapa==6){
                                LatLng catedral = new LatLng(6.153299, -75.373634);
                                mMap.addMarker(new MarkerOptions().position(catedral).title("Cafe Bar")
                                        .snippet("Fiesta rock pop"));

                                mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                                mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                            }else{
                                if(mapa==7){
                                    LatLng catedral = new LatLng(6.128814, -75.379882);
                                    mMap.addMarker(new MarkerOptions().position(catedral).title("La Gotera")
                                            .snippet("Fiesta Viejoteca"));

                                    mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                                    mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                                }else{
                                    if(mapa==8){
                                        LatLng catedral = new LatLng(6.172543, -75.435458);
                                        mMap.addMarker(new MarkerOptions().position(catedral).title("Hotel Las Lomas")
                                                .snippet("Lujo y Placer"));

                                        mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                                        mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                                    }else{
                                        if(mapa==9){
                                            LatLng catedral = new LatLng(6.177067, -75.437682);
                                            mMap.addMarker(new MarkerOptions().position(catedral).title("Hotel Santiago de Arma")
                                                    .snippet("Encuentro con la Naturaleza"));

                                            mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                                            mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                                        }else{
                                            LatLng catedral = new LatLng(6.129839, -75.379804);
                                            mMap.addMarker(new MarkerOptions().position(catedral).title("Hotel Oasis")
                                                    .snippet("Un Paso por la Ciudad"));

                                            mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
                                            mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
    public void Inic(View view){
        Intent intent=new Intent(MapsActivity.this, Main3Activity.class);
        startActivity(intent);
    }
    /*
    <fragment xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:map="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/map"
    android:name="com.google.android.gms.maps.SupportMapFragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.luisfelipegomezc.practicarionegro.MapsActivity" />

     */
}
