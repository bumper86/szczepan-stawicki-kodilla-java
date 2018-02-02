package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producent{
    @Override
    public String process(OrderRequest orderRequest){
        System.out.println("Extra Food Shop confirms the order of product: " + orderRequest.getProduct() + " in an amount: " + orderRequest.getQuantity());
        return "Extra Food Shop";
    }
}
