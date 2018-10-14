package com.example.android.tourguideapp;

public class Location {
    /**
     * Member variables
     */
    private String mName;
    private String mAddress;
    private String mWikiUrl = null;
    private static final int NOT_PROVIDED = -1;
    private int mImgResId = NOT_PROVIDED;

    /**
     * Constructors
     */
    public Location(String mName, String mAddress, String mWikiUrl, int mImgResId) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mWikiUrl = mWikiUrl;
        this.mImgResId = mImgResId;
    }


    /**
     * Getters and setters
     */
    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getWikiUrl() {
        return mWikiUrl;
    }

    public int getImgResId() { return mImgResId; }

    /**
     * Other methods
     */
    public boolean hasImage() {
        return mImgResId != NOT_PROVIDED;
    }

}
