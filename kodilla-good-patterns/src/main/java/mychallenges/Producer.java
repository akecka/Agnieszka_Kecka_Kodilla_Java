package mychallenges;

public interface Producer {
    boolean process(OrderRetriever orderRetriever);

    boolean getOrderStatus(OrderRetriever orderRetriever);
}
