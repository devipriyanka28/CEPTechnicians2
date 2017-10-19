package com.devipriyanka28gmail.ceptechnicians;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Created by kondal reddy on 11-10-2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public PagerAdapter(FragmentManager fm, int noOfTabs){
        super(fm);
        this.mNoOfTabs=noOfTabs;
    }
    public Fragment getItem(int position){
        switch (position)
        {
            case 0:
                CarpentersActivity tab1=new CarpentersActivity();
                return tab1;
            case 1:
                ElectricianActivity tab2=new ElectricianActivity();
                return tab2;
            case 2:
                PlumbersActivity tab3=new PlumbersActivity();
                return tab3;
            default:
                return null;
        }
    }
    public int getCount(){
        return mNoOfTabs;
    }
}
