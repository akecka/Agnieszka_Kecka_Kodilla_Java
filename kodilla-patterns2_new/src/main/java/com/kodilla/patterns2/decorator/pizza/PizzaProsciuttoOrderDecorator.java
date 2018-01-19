package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaProsciuttoOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaProsciuttoOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(25));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with prosciutto di Parma";
    }

    @Override
    public String getPizzaName(){
        return "Pizza Prosciutto";
    }
}
