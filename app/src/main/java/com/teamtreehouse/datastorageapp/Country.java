package com.teamtreehouse.datastorageapp;

public class Country {
    private int mPopulation;
    private String mCountryName;
    private String mContinent;

    public Country(int population, String countryName, String continent) {
        mPopulation = population;
        mCountryName = countryName;
        mContinent = continent;
    }

    public int getPopulation() {
        return mPopulation;
    }

    public void setPopulation(int population) {
        mPopulation = population;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public void setCountryName(String countryName) {
        mCountryName = countryName;
    }

    public String getContinent() {
        return mContinent;
    }

    public void setContinent(String continent) {
        mContinent = continent;
    }
}
