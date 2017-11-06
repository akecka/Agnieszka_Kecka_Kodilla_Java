package mychallenges;

import java.util.ArrayList;

public class ExtraFoodShop implements Producer {

    public String shopName = "ExtraFoodShop";

    public static ArrayList<Product> products() {

        ArrayList<Product> bioFoodShop = new ArrayList<>();
        bioFoodShop.add(new Product("coconut oil", 5));
        bioFoodShop.add(new Product("nigella", 6));
        bioFoodShop.add(new Product("couscous", 8));

        return bioFoodShop;
    }

    public boolean process(OrderRetriever orderRetriever) {
        return true;
    }

    public boolean getOrderStatus(OrderRetriever orderRetriever) {
        return true;
    }

}
