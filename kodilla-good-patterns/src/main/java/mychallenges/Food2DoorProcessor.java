package mychallenges;

public class Food2DoorProcessor {

    private FoodOrderInformation foodOrderInformation;
    private FoodOrderService foodOrderService;
    private Producer producer;

    public Food2DoorProcessor(final FoodOrderInformation foodOrderInformation, final FoodOrderService foodOrderService, final Producer producer) {
        this.foodOrderInformation = foodOrderInformation;
        this.foodOrderService = foodOrderService;
        this.producer = producer;
    }

    public FoodDto proces(final OrderRetriever orderRetriever, final FoodRetriever process) {
        FoodService foodService = new FoodService();
        if (process.process(orderRetriever)) {
            foodOrderInformation.inform(orderRetriever.getOrder());

            return new FoodDto(orderRetriever.getOrder(), true);
        } else {
            foodService.declined();
            return new FoodDto(orderRetriever.getOrder(), false);
        }

    }
}
