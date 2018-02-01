package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, LocalDateTime localDateTime, Product product);
}
