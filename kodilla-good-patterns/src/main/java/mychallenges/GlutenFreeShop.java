package mychallenges;

import java.util.ArrayList;

public class GlutenFreeShop implements Producer {

    public static ArrayList<Product> products() {

        ArrayList<Product> glutenFree = new ArrayList<>();
        glutenFree.add(new Product("oatmeal", 11));
        glutenFree.add(new Product("soya", 12));
        glutenFree.add(new Product("ciabatta", 15));

        return glutenFree;

    }

    public boolean process(OrderRetriever orderRetriever) {
        return true;
    }

    public boolean getOrderStatus(OrderRetriever orderRetriever) {
        return true;
    }
}
