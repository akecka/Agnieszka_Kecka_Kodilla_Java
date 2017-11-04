package mychallenges;

import java.util.ArrayList;

public class SupplierFood {

    private String supplierName;
    private String kindOfFood;
    private ArrayList<Product> food;

    public SupplierFood(String supplierName, String kindOfFood, ArrayList<Product> food) {
        this.supplierName = supplierName;
        this.kindOfFood = kindOfFood;
        this.food = food;
    }
    public String getSupplierName() {
        return supplierName;
    }

    public String getKindOfFood() {
        return kindOfFood;
    }

}