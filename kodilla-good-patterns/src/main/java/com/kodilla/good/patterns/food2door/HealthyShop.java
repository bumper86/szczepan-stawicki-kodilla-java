package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Producent {
    @Override
    public String process(String product, int quantity) {
        System.out.println("Healthy Shop confirms the order of product: " + product + " in an amount: " + quantity);

        return "Healthy Shop";
    }
}
