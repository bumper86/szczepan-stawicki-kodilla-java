package com.kodilla.good.patterns.food2door;

public class InfoOrderService implements OrderService {
    private OrderRequest orderRequest;

    public boolean order(String product, Producent producent) {
        product = orderRequest.getProduct();
        producent = orderRequest.getProducent();
        System.out.println("Order product: " + product + " in producer: " + producent + " is order.");

        return true;
    }
}
