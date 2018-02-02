package com.kodilla.good.patterns.food2door;

public final class Product {
    public final String productName;
    public final int quantity;

    public Product(final String productName, final int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
