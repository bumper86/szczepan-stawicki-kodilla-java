package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class OrderRequest {
    public User user;
    public LocalDateTime dateOrder;
    public Product product;

    public OrderRequest(final User user, final LocalDateTime dateOrder, final Product product) {
        this.user = user;
        this.dateOrder = dateOrder;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public Product getProduct() {
        return product;
    }
}
