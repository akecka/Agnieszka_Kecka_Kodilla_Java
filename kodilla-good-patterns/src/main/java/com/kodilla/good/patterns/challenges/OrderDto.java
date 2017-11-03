package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public ShopUser shopUser;
    public boolean isOrdered;

    public OrderDto(final ShopUser shopUser, final boolean isOrdered) {
        this.shopUser = shopUser;
        this.isOrdered = isOrdered;
    }

    public ShopUser getShopUser() {
        return shopUser;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
