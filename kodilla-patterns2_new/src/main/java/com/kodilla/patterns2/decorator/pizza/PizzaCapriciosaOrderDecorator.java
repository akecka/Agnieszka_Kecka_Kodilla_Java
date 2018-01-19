package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaCapriciosaOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaCapriciosaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(35));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with mushrooms";
    }

    @Override
    public String getPizzaName(){
        return "Pizza Capriciosa";
    }
}
