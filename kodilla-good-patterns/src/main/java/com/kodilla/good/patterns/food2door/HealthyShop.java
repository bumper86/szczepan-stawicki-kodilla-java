package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Producent {
    @Override
    public String process(Product product) {
        System.out.println("Healthy Shop confirms the order of product: " + product.getProductName() + " in an amount: " + product.getQuantity());

        return "Healthy Shop";
    }
}
