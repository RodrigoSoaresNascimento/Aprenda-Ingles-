package com.example.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aprendaingles.fragments.BichosFragment;
import com.example.aprendaingles.fragments.NumerosFragment;
import com.example.aprendaingles.fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        smartTabLayout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewPager);

        FragmentPagerItemAdapter fragmentPagerItemAdapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Bichos", BichosFragment.class)
                        .add("Numeros", NumerosFragment.class)
                        .add("Vogais", VogaisFragment.class)
                        .create()
        );

        viewPager.setAdapter(fragmentPagerItemAdapter);
        smartTabLayout.setViewPager(viewPager);

    }
}