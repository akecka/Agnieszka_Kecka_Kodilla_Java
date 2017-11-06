package mychallenges;

import java.util.ArrayList;

public class ShopList {

    public static ArrayList<String> retrieve() {

        ArrayList<String> listOfProducers = new ArrayList<>();
        listOfProducers.add("ExtraFoodShop");
        listOfProducers.add("HealthyShop");
        listOfProducers.add("GlutenFreeShop");

        return listOfProducers;
    }

    public Producer shop(String nameOfShop) {
        if (nameOfShop == "ExtraFoodShop") {
            Producer shop = new ExtraFoodShop();
            return shop;
        }
        if (nameOfShop == "HealthyShop") {
            Producer shop = new HealthyShop();
            return shop;
        }
        if (nameOfShop == "GlutenFreeShop") {
            Producer shop = new GlutenFreeShop();
            return shop;
        }
        return null;
    }

}

