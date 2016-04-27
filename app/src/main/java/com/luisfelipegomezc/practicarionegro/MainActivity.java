package com.luisfelipegomezc.practicarionegro;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();

        ParqueFragment fragment = new ParqueFragment();
        //ft.add(android.R.id.content, fragment).commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        if (id==R.id.mParque){
            ParqueFragment fragment =new ParqueFragment();
            //ft.replace(android.R.id.content, fragment).commit();
        }
        if (id==R.id.mPuente){
            PuenteFragment fragment =new PuenteFragment();
            //ft.replace(android.R.id.content, fragment).commit();
        }
        if (id==R.id.mRionegro){
            RionegroFragment fragment =new RionegroFragment();
            //ft.replace(android.R.id.content, fragment).commit();
        }
        return super.onOptionsItemSelected(item);
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
