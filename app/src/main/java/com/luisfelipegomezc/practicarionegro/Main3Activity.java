package com.luisfelipegomezc.practicarionegro;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }
        };

        ActionBar.Tab tab= actionBar.newTab().setText("Parque").setTabListener(tabListener);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("Puente").setTabListener(tabListener);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("Rionegro").setTabListener(tabListener);
        actionBar.addTab(tab);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                getSupportActionBar().setSelectedNavigationItem(position);
            }
        });
    }

    public class PagerAdapter extends FragmentPagerAdapter{


        public PagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:return new ParqueFragment();
                case 1: return new PuenteFragment();
                case 2:return new RionegroFragment();
                default : return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public void Inic(View view){
        Intent intent=new Intent(Main3Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void Map(View view){
        Intent intent=new Intent(Main3Activity.this, MapsActivity.class);
        intent.putExtra("mapa",1);
        startActivity(intent);
    }
}
//@string/google_maps_key