package com.kodilla.good.patterns.food2door;

public class InfoOrderService implements OrderService {


    public boolean order(final String product, final int quantity, final Producent producent) {

        System.out.println("Order product: " + product + " in producer: " + producent.process(product, quantity)+ " is order.");

        return true;
    }
}
