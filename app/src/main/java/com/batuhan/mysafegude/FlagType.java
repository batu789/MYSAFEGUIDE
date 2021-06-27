package com.batuhan.mysafegude;

public class FlagType {
    int mImg;
    String mCountryName;

    public FlagType() {

    }

    public FlagType(int mImg, String mCountryName) {
        this.mImg = mImg;
        this.mCountryName = mCountryName;
    }

    public int getmImg() {
        return mImg;
    }

    public void setmImg(int mImg) {
        this.mImg = mImg;
    }

    public String getmCountryName() {
        return mCountryName;
    }

    public void setmCountryName(String mCountryName) {
        this.mCountryName = mCountryName;
    }
}
