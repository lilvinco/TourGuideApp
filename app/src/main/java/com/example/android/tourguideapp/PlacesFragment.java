package com.example.android.tourguideapp;


import android.content.res.TypedArray;

public class PlacesFragment extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public PlacesFragment() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String[] locationsNames = getResources().getStringArray(R.array.places_names);
        String[] locationsAddresses = getResources().getStringArray(R.array.places_addresses);
        TypedArray locationsImagesResIds = getResources().obtainTypedArray(R.array.places_images);

        for (int i = 0; i < locationsNames.length; ++i) {
            locationsList.add(new Location(locationsNames[i],
                    locationsAddresses[i],
                    getString(R.string.location_wiki_url_not_provided_text),
                    locationsImagesResIds.getResourceId(i, 0)));
        }

        locationsImagesResIds.recycle();
    }
}
