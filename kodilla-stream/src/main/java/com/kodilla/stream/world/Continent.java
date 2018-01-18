package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country){
        return countries.remove(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
