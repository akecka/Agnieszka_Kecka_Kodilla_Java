package mychallenges;

import java.util.ArrayList;

public class HealthyShop implements Producer {

    public static ArrayList<Product> products() {

        ArrayList<Product> ecoFoodShop = new ArrayList<>();
        ecoFoodShop.add(new Product("cashew nuts", 10));
        ecoFoodShop.add(new Product("goji", 8));
        ecoFoodShop.add(new Product("rice noodles", 6));

        return ecoFoodShop;
    }

    public boolean process(OrderRetriever orderRetriever) {
        return true;
    }

    public boolean getOrderStatus(OrderRetriever orderRetriever) {
        return true;
    }
}
