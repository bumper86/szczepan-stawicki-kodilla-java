package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public final class Products {

    public HashMap<String, Producent> ListOfProducts() {
        Map<String, Producent> listProducts = new HashMap<>();
        listProducts.put("Ham", new ExtraFoodShop());
        listProducts.put("Apple", new HealthyShop());
        return (HashMap<String, Producent>) listProducts;
    }

}
