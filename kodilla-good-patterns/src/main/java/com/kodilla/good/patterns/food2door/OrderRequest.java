package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Producent producent;
    private String product;
    private int quantity;

    public OrderRequest(final String product,final int quantity, final  Producent producent) {
         this.product = product;
         this.quantity = quantity;
         this.producent = producent;
    }

    public Producent getProducent() {
        return producent;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "producent=" + producent +
                '}';
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
