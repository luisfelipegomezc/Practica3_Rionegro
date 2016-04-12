package com.luisfelipegomezc.practicarionegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bDemo;
    Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

        public void Demo(View view){
            Intent intent=new Intent(MainActivity.this, Demografia.class);
            startActivity(intent);
        }

        public void Turi(View view){
            Intent intent=new Intent(MainActivity.this, Turismo.class);
            startActivity(intent);
        }
        public void Div(View view){
            Intent intent=new Intent(MainActivity.this, Diversion.class);
            startActivity(intent);
        }

        public void Hosp(View view){
            Intent intent=new Intent(MainActivity.this, Hospedaje.class);
            startActivity(intent);
        }
}
