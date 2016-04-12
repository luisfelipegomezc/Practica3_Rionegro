package com.luisfelipegomezc.practicarionegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Diversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diversion);

    }
    public void Inic(View view){
        Intent intent=new Intent(Diversion.this, MainActivity.class);
        startActivity(intent);
    }

    public void Turi(View view){
        Intent intent=new Intent(Diversion.this, Turismo.class);
        startActivity(intent);
    }

    public void Demo(View view){
        Intent intent=new Intent(Diversion.this, Demografia.class);
        startActivity(intent);
    }

    public void Hosp(View view){
        Intent intent=new Intent(Diversion.this, Hospedaje.class);
        startActivity(intent);
    }
}
