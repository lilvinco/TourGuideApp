package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    /**
     * Constructor
     */
    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CompaniesFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new PlacesFragment();
        } else {
            return new RestuarantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.companies_fragment_label);
        } else if (position == 1) {
            return mContext.getString(R.string.hotels_fragment_label);
        } else if (position == 2) {
            return mContext.getString(R.string.places_fragment_label);
        } else {
            return mContext.getString(R.string.restuarants_fragment_label);
        }
    }
}