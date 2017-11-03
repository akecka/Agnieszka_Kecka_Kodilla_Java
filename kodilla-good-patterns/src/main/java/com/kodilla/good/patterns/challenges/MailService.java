package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    public void inform(ShopUser shopUser) {
        System.out.println("User " + shopUser.getFirstname() + shopUser.getLastname() + shopUser.getId() + " ordered: " + shopUser.showBasket());
    }
}
