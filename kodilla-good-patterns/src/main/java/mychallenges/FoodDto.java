package mychallenges;

import java.util.ArrayList;

public class FoodDto {

    public ArrayList<Product> basket;
    public boolean process;

    public FoodDto(ArrayList<Product> basket, boolean process) {
        this.basket = basket;
        this.process = process;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public boolean isOrdered() {
        return process;
    }
}
