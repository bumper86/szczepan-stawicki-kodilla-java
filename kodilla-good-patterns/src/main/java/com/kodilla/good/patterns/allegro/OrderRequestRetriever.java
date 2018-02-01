package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;
import java.time.Month;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Kowalski", "kowal");
        LocalDateTime orderDate = LocalDateTime.of(2017, Month.JULY, 29, 19, 30, 40);
        Product product = new Product("Socks", 10);

        return new OrderRequest(user, orderDate, product);
    }
}
