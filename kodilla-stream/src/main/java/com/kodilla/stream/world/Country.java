package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal populationOfCountry;

    public Country(final String countryName, final BigDecimal populationOfCountry) {
        this.countryName = countryName;
        this.populationOfCountry = populationOfCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return populationOfCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {

        return countryName.hashCode();
    }
}
