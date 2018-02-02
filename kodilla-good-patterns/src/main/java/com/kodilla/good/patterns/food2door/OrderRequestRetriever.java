package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Product product = new Product("Ham", 20);
        Producent healthyShop = new HealthyShop();

        return new OrderRequest(product,healthyShop);
    }
}

