package com.luisfelipegomezc.practicarionegro;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
