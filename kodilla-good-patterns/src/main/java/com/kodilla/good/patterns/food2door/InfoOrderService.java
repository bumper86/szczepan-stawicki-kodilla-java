package com.kodilla.good.patterns.food2door;

public class InfoOrderService implements OrderService {


    public boolean order(String product, String producent) {

        System.out.println("Order product: " + product + " in producer: " + producent + " is order.");

        return true;
    }
}
