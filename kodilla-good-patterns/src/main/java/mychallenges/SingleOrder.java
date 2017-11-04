package mychallenges;

import java.util.ArrayList;

public class SingleOrder {

    public static ArrayList<Product> getSingleOrder(){

        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product("goji", 4));
        prod.add(new Product("rice noodles", 3));

        return prod;
    }
}
