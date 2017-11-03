package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    public ShopUser shopUser;

    public OrderRequest(ShopUser shopUser) {
        this.shopUser = shopUser;
    }

    public ShopUser getShopUser() {
        return shopUser;
    }
}
