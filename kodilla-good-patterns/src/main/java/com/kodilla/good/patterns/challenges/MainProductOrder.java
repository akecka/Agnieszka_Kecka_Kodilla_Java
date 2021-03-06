package com.kodilla.good.patterns.challenges;

public class MainProductOrder {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new MakeOrder());
        productOrderService.process(orderRequest);
    }
}
