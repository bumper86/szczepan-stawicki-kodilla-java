package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println("Pizza cost " + theOrder.getCost());
        System.out.println(theOrder.getDescription());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String descripton = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(15.00), calculatedCost);
        assertEquals("Pizza with cheese and tomato sauce", descripton);
    }

    @Test
    public void testHawanaPizza() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawanaPizza(theOrder);
        System.out.println("Pizza cost " + theOrder.getCost());
        System.out.println(theOrder.getDescription());
        //When
        BigDecimal theCost = theOrder.getCost();
        String descripton = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(25), theCost);
        assertEquals("Pizza with cheese and tomato sauce and specials additions mushrooms, ham and pineaple", descripton);
    }

    @Test
    public void testMexicanaWithDouble() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MexicanPizza(theOrder);
        theOrder = new DoubleDough(theOrder);
        System.out.println("Pizza cost " + theOrder.getCost());
        System.out.println(theOrder.getDescription());
        //When
        BigDecimal theCost = theOrder.getCost();
        String descripton = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(35), theCost);
        assertEquals("Pizza with cheese and tomato sauce and specials additions ham, spicy sauce + double dough", descripton);
    }
}
