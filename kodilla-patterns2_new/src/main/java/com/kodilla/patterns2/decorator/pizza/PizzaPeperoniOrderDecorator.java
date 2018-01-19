package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaPeperoniOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaPeperoniOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(30));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with peperoni";
    }
    @Override
    public String getPizzaName(){
        return "Pizza Peperoni";
    }
}
