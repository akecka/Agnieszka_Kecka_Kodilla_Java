package mychallenges;

import java.util.ArrayList;

public class FoodRetriever {

    public static ArrayList<SupplierFood> retrieve() {
        ArrayList<Product> BioFoodShop = new ArrayList<>();
        BioFoodShop.add(new Product("coconut oil", 5));
        BioFoodShop.add(new Product("nigella", 6));
        BioFoodShop.add(new Product("couscous", 8));

        SupplierFood supplierFood = new SupplierFood("ExtraFoodShop", "Bio food", BioFoodShop);

        ArrayList<Product> EcoFoodShop = new ArrayList<>();
        EcoFoodShop.add(new Product("cashew nuts", 10));
        EcoFoodShop.add(new Product("goji", 8));
        EcoFoodShop.add(new Product("rice noodles", 6));

        SupplierFood supplierFood1 = new SupplierFood("HealthyShop", "Eco Food", EcoFoodShop);

        ArrayList<Product> GlutenFree = new ArrayList<>();
        GlutenFree.add(new Product("oatmeal", 11));
        GlutenFree.add(new Product("soya", 12));
        GlutenFree.add(new Product("ciabatta", 15));

        SupplierFood supplierFood2 = new SupplierFood("GlutenFreeShop", "Gluten free", GlutenFree);

        ArrayList<SupplierFood> foodStore = new ArrayList<>();
        foodStore.add(supplierFood);
        foodStore.add(supplierFood1);
        foodStore.add(supplierFood2);

        return foodStore;

    }

}
