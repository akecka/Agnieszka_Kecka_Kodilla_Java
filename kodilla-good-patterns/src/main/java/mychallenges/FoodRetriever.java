package mychallenges;

import java.util.ArrayList;

public class FoodRetriever implements Producer {

    public boolean process(OrderRetriever orderRetriever) {
        return true;
    }

    public boolean getOrderStatus(OrderRetriever orderRetriever) {
        return true;
    }

    public static ArrayList<SupplierFood> retrieve() {
        ArrayList<Product> bioFoodShop = new ArrayList<>();
        bioFoodShop.add(new Product("coconut oil", 5));
        bioFoodShop.add(new Product("nigella", 6));
        bioFoodShop.add(new Product("couscous", 8));

        SupplierFood supplierFood = new SupplierFood("ExtraFoodShop", "Bio food", bioFoodShop);

        ArrayList<Product> ecoFoodShop = new ArrayList<>();
        ecoFoodShop.add(new Product("cashew nuts", 10));
        ecoFoodShop.add(new Product("goji", 8));
        ecoFoodShop.add(new Product("rice noodles", 6));

        SupplierFood supplierFood1 = new SupplierFood("HealthyShop", "Eco Food", ecoFoodShop);

        ArrayList<Product> glutenFree = new ArrayList<>();
        glutenFree.add(new Product("oatmeal", 11));
        glutenFree.add(new Product("soya", 12));
        glutenFree.add(new Product("ciabatta", 15));

        SupplierFood supplierFood2 = new SupplierFood("GlutenFreeShop", "Gluten free", glutenFree);

        ArrayList<SupplierFood> foodStore = new ArrayList<>();
        foodStore.add(supplierFood);
        foodStore.add(supplierFood1);
        foodStore.add(supplierFood2);

        return foodStore;

    }

}
