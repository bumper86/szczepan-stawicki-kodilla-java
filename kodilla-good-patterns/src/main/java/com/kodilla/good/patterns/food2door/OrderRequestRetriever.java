package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {
    public Producent producent;
    public OrderRequest retrieve(String nameProduct, int quantity) {
        Products products = new Products();
        producent = products.ListOfProducts().get(nameProduct);

        return new OrderRequest(nameProduct, quantity, producent);
    }
}

