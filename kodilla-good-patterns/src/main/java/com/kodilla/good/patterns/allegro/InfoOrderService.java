package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class InfoOrderService implements OrderService {
    @Override
    public boolean order(final User user, final LocalDateTime orderTime, final Product product) {
        System.out.println("Order product by user: " + user.getNick() + " is: " + product.getProductName() + "; Quantity:  " + product.quantity );
        return true;
    }
}
