
package com.devipriyanka28gmail.ceptechnicians;

/**
 * Created by kondal reddy on 10-10-2017.
 */
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import static android.view.Gravity.FILL;




public class MainActivity extends AppCompatActivity implements ElectricianActivity.OnFragmentInteractionListener, CarpentersActivity.OnFragmentInteractionListener, PlumbersActivity.OnFragmentInteractionListener {
//    String t1, t2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Carpentry_Repairs"));
        tabLayout.addTab(tabLayout.newTab().setText("Electrical_Repairs"));
        tabLayout.addTab(tabLayout.newTab().setText("Plumbing_Repairs"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        final com.devipriyanka28gmail.ceptechnicians.PagerAdapter adapter=new com.devipriyanka28gmail.ceptechnicians.PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            public void onTabUnselected(TabLayout.Tab tab) {

            }

            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void onFragmentInteraction(Uri uri) {

    }
}




