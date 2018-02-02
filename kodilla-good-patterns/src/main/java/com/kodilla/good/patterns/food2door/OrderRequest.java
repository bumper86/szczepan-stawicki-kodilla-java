package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Producent producent;
    private Product product;

    public OrderRequest(final Product product, final  Producent producent) {
         this.product = product;
         this.producent = producent;
    }

    public Product getProduct() {
        return product;
    }

    public Producent getProducent() {
        return producent;
    }
}
