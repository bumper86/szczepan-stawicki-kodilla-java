package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve(String nameProduct, int quantity) {
        Products products = new Products();
        Producent producent = products.ListOfProducts().get(nameProduct);
        return new OrderRequest(nameProduct, quantity, producent);
    }
}

