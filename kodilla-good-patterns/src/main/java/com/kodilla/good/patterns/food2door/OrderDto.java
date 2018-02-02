package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public String product;
    public boolean isOrder;

    public OrderDto(String product, boolean isOrder) {
        this.product = product;
        this.isOrder = isOrder;
    }

    public String getProduct() {
        return product;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
