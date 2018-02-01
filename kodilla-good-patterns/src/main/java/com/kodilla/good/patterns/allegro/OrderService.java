package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime localDateTime, Product product);
}
