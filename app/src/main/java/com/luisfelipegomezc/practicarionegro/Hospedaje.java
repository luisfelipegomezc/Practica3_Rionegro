package com.luisfelipegomezc.practicarionegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hospedaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospedaje);
    }

    public void Inic(View view){
        Intent intent=new Intent(Hospedaje.this, MainActivity.class);
        startActivity(intent);
    }
    public void Turi(View view){
        Intent intent=new Intent(Hospedaje.this, Turismo.class);
        startActivity(intent);
    }

    public void Div(View view){
        Intent intent=new Intent(Hospedaje.this, Diversion.class);
        startActivity(intent);
    }

    public void Demo(View view){
        Intent intent=new Intent(Hospedaje.this, Demografia.class);
        startActivity(intent);
    }
    public void Map(View view){
        Intent intent=new Intent(Hospedaje.this, MapsActivity.class);
        intent.putExtra("mapa",8);
        startActivity(intent);
    }
    public void Map1(View view){
        Intent intent=new Intent(Hospedaje.this, MapsActivity.class);
        intent.putExtra("mapa",9);
        startActivity(intent);
    }
    public void Map2(View view){
        Intent intent=new Intent(Hospedaje.this, MapsActivity.class);
        intent.putExtra("mapa",10);
        startActivity(intent);
    }
}
