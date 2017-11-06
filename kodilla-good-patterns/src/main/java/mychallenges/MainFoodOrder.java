package mychallenges;

public class MainFoodOrder {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever(62,"ExtraFoodShop", "Road Harrington 65", SingleOrder.getSingleOrder());

        ShopList shopList = new ShopList();

        Producer shop = shopList.shop(orderRetriever.getShopName());

        Food2DoorProcessor food2DoorProcessor = new Food2DoorProcessor(new FoodService(), new EBuy(), shop );
        food2DoorProcessor.proces(orderRetriever, shop);

    }

}
