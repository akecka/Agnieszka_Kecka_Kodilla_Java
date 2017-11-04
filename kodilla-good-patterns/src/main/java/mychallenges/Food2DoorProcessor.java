package mychallenges;

public class Food2DoorProcessor {

    private FoodOrderInformation foodOrderInformation;
    private FoodOrderService foodOrderService;

    public Food2DoorProcessor(final FoodOrderInformation foodOrderInformation, final FoodOrderService foodOrderService) {
        this.foodOrderInformation = foodOrderInformation;
        this.foodOrderService = foodOrderService;
    }

    public FoodDto process(final OrderRetriever orderRetriever, final FoodRetriever foodRetriever) {
        boolean isOrdered = foodOrderService.createFoodOrder(orderRetriever.getOrder(), foodRetriever);

        if (isOrdered) {

            foodOrderInformation.inform(orderRetriever.getOrder());
            return new FoodDto(orderRetriever.getOrder(), true);
        } else {
            return new FoodDto(orderRetriever.getOrder(), false);
        }

    }
}
