package mychallenges;

import java.util.ArrayList;

public class FoodService implements FoodOrderInformation {
    public void inform(ArrayList<Product> basket) {
        String shoppingbasketList = "";
        for (int x = 0; x < basket.size(); x++) {
            shoppingbasketList += basket.get(x).getNameOfProduct() + " ";
        }

        System.out.println("Order has been processed: " + shoppingbasketList);
    }

    public void declined() {
        System.out.println("Order Canceled");
    }
}
