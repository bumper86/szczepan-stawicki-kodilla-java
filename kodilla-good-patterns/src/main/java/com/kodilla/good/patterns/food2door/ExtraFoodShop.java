package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producent{
    @Override
    public String process(Product product){
        System.out.println("Extra Food Shop confirms the order of product: " + product.getProductName() + " in an amount: " + product.getQuantity());

        return "Extra Food Shop";
    }
}
