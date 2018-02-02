package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Producent {
    @Override
    public String process(OrderRequest orderRequest) {
        System.out.println("Healthy Shop confirms the order of product: " + orderRequest.getProduct() + " in an amount: " + orderRequest.getQuantity());

        return "Healthy Shop";
    }
}
