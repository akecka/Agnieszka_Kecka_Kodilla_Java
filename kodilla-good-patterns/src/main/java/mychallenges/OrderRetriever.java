package mychallenges;

import java.util.ArrayList;

public class OrderRetriever {

    private int orderNumber;
    private String shopName;
    private ArrayList<Product> order;
    private String address;

    public OrderRetriever(int orderNumber, String shopName, String address, ArrayList<Product> order) {
        this.orderNumber = orderNumber;
        this.shopName = shopName;
        this.order = order;
        this.address = address;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<Product> getOrder() {
        return order;
    }

    public String getAddress() {
        return address;
    }

    public String getShopName() {
        return shopName;
    }

}
