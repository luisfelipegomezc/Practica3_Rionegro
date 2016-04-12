package com.luisfelipegomezc.practicarionegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Turismo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
    }

    public void Inic(View view){
        Intent intent=new Intent(Turismo.this, MainActivity.class);
        startActivity(intent);
    }
    public void Turi(View view){
        Intent intent=new Intent(Turismo.this, Turismo.class);
        startActivity(intent);
    }

    public void Div(View view){
        Intent intent=new Intent(Turismo.this, Diversion.class);
        startActivity(intent);
    }

    public void Hosp(View view){
        Intent intent=new Intent(Turismo.this, Hospedaje.class);
        startActivity(intent);
    }
    public void Demo(View view){
        Intent intent=new Intent(Turismo.this, Demografia.class);
        startActivity(intent);
    }
}
