package mychallenges;

import java.util.ArrayList;

public class FoodDto {

    public ArrayList<Product> basket;
    public boolean isOrdered;

    public FoodDto(ArrayList<Product> basket, boolean isOrdered) {
        this.basket = basket;
        this.isOrdered = isOrdered;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
