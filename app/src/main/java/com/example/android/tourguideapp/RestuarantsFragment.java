package com.example.android.tourguideapp;


import android.content.res.TypedArray;

public class RestuarantsFragment extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public RestuarantsFragment() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String[] locationsNames = getResources().getStringArray(R.array.restuarant_names);
        String[] locationsAddresses = getResources().getStringArray(R.array.restuarant_addresses);
        TypedArray locationsImagesResIds = getResources().obtainTypedArray(R.array.restuarant_images);

        for (int i = 0; i < locationsNames.length; ++i) {
            locationsList.add(new Location(locationsNames[i],
                    locationsAddresses[i],
                    getString(R.string.location_wiki_url_not_provided_text),
                    locationsImagesResIds.getResourceId(i, 0)));
        }
        locationsImagesResIds.recycle();
    }
}
