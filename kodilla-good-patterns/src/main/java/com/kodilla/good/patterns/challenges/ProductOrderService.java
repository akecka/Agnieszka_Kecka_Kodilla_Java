package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private ServiceSale serviceSale;

    public ProductOrderService(final InformationService informationService,
                               final ServiceSale serviceSale) {
        this.informationService = informationService;
        this.serviceSale = serviceSale;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = serviceSale.createOrder(orderRequest.getShopUser());

        if (isOrdered) {
            informationService.inform(orderRequest.getShopUser());
            serviceSale.createOrder(orderRequest.getShopUser());
            return new OrderDto(orderRequest.getShopUser(), true);
        } else {
            return new OrderDto(orderRequest.getShopUser(), false);
        }
    }
}
