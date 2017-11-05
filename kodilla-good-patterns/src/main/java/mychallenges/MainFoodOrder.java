package mychallenges;

public class MainFoodOrder {

    public static void main(String[] args) {

        FoodRetriever foodRetriever = new FoodRetriever();
        OrderRetriever orderRetriever = new OrderRetriever(62, "Road Harrington 65", SingleOrder.getSingleOrder());

        Food2DoorProcessor food2DoorProcessor = new Food2DoorProcessor(new FoodService(), new EBuy(), foodRetriever);
        food2DoorProcessor.proces(orderRetriever,foodRetriever);


    }

}
