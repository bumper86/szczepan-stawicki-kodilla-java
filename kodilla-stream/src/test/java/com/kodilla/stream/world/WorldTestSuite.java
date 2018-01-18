package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("50000000"));
        Country germany = new Country("Germany", new BigDecimal("65000000"));
        Country france = new Country("France",new BigDecimal("42000000"));
        Country brasil = new Country("Brasil", new BigDecimal("70000000"));
        Country argentina = new Country("Argentina", new BigDecimal("60000000"));
        Country chile = new Country("Chile", new BigDecimal("65000000"));
        Country canada = new Country("Canada", new BigDecimal("34000000"));
        Country mexic = new Country("Mexic", new BigDecimal("90000000"));
        Country cuba = new Country("Cuba", new BigDecimal("20000000"));


        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Continent americaSouth = new Continent("South America");
        americaSouth.addCountry(brasil);
        americaSouth.addCountry(argentina);
        americaSouth.addCountry(chile);

        Continent amerciaNorth = new Continent("North America");
        amerciaNorth.addCountry(canada);
        amerciaNorth.addCountry(mexic);
        amerciaNorth.addCountry(cuba);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(amerciaNorth);
        world.addContinent(americaSouth);

        //When
       BigDecimal resultPeople = world.getPeopleQuantity();
       BigDecimal expected = new BigDecimal("496000000");

       //Then
        Assert.assertEquals(expected,resultPeople);

    }
}
