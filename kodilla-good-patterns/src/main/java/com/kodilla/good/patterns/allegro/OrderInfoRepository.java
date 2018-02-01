package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class OrderInfoRepository implements OrderRepository  {
    @Override
    public boolean createOrder(final User user, final LocalDateTime orderTime, final Product product) {
        System.out.println("Order product: "  + product.getProductName() + " for user " + user.getNick() + " has been created.");
        return true;
    }
}
