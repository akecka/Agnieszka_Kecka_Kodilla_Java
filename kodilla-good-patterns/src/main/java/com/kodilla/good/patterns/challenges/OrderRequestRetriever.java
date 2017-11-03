package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        ArrayList<String> basket = new ArrayList<>();
        basket.add("socks");
        basket.add("t-shirt");
        basket.add("watch");

        ShopUser shopUser = new ShopUser("Anna", "Kowalska", 001234, basket );

        return new OrderRequest(shopUser);
    }
}
