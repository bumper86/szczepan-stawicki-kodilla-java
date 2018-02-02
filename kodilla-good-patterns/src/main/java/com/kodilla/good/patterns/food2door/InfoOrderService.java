package com.kodilla.good.patterns.food2door;

public class InfoOrderService implements OrderService {

    public boolean order(final Product product, final Producent producent) {
        System.out.println("Order product: " + product.getProductName() + " in producer: " + producent.process(product) + " is order.");

        return true;
    }
}
