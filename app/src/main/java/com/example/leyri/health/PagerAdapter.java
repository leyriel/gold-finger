package com.example.leyri.health;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{

    int NbTabs;

    public PagerAdapter(FragmentManager fm, int nbTabs) {
        super(fm);
        NbTabs = nbTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                ProductFragment productFragment = new ProductFragment();
                return productFragment;
            case 2:
                WishListFragment wishListFragment = new WishListFragment();
                return wishListFragment;
            case 3:
                CartFragment cartFragment = new CartFragment();
                return cartFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.NbTabs;
    }
}
