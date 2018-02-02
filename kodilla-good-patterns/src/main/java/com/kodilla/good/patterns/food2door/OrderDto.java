package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public Product product;
    public boolean isOrder;

    public OrderDto(Product product, boolean isOrder) {
        this.product = product;
        this.isOrder = isOrder;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
