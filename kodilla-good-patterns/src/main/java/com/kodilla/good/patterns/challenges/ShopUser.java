package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ShopUser {

    private String firstname;
    private String lastname;
    private int Id;
    private ArrayList<String> basket;

    public ShopUser(String firstname, String lastname, int id, ArrayList<String> basket) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.Id = id;
        this.basket = basket;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return Id;
    }


    public String showBasket() {
        String shoppingList = basket.stream()
                .collect(Collectors.joining(", "));
        return shoppingList;
    }
}

