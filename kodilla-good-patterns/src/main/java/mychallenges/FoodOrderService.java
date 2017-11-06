package mychallenges;

import java.util.ArrayList;

public interface FoodOrderService {
    boolean createFoodOrder(ArrayList<Product> basket, Producer shop);
}
