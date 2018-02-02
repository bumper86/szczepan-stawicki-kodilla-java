package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producent{
    @Override
    public String process(String product, int quantity){
        System.out.println("Extra Food Shop confirms the order of product: " + product + " in an amount: " + quantity);
        return "Extra Food Shop";
    }


}
