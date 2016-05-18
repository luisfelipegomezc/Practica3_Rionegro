package com.luisfelipegomezc.practicarionegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Demografia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demografia);
    }

    public void Inic(View view){
        Intent intent=new Intent(Demografia.this, MainActivity.class);
        startActivity(intent);
    }

    public void Turi(View view){
        Intent intent=new Intent(Demografia.this, Turismo.class);
        startActivity(intent);
    }

    public void Div(View view){
        Intent intent=new Intent(Demografia.this, Diversion.class);
        startActivity(intent);
    }

    public void Hosp(View view){
        Intent intent=new Intent(Demografia.this, Hospedaje.class);
        startActivity(intent);
    }
    public void Map(View view){
        Intent intent=new Intent(Demografia.this, MapsActivity.class);
        intent.putExtra("mapa",5);
        startActivity(intent);
    }
}
