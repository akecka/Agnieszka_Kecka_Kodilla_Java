package com.kodilla.patterns2.decorator.pizza;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);

        System.out.println(pizzaOrder.getPizzaName() + " ordered: " + pizzaOrder.getDescription() + " at cost: " + pizzaOrder.getCost());

    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza with pastry, cheese and tomato", description);

    }

    @Test
    public void testPizzaProsciuttoGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaProsciuttoOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);

        System.out.println(pizzaOrder.getPizzaName() + " ordered: " + pizzaOrder.getDescription() + " at cost: " + pizzaOrder.getCost());

    }

    @Test
    public void testPizzaProsciuttoGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaProsciuttoOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza with pastry, cheese and tomato with prosciutto di Parma", description);

    }

    @Test
    public void testPizzaPeperoniGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoniOrderDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(45), cost);

        System.out.println(pizzaOrder.getPizzaName() + " ordered: " + pizzaOrder.getDescription() + " at cost: " + pizzaOrder.getCost());

    }

    @Test
    public void testPizzaPeperoniGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoniOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza with pastry, cheese and tomato with peperoni", description);
    }

    @Test
    public void testPizzaCapriciosaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapriciosaOrderDecorator(pizzaOrder);
        //When
        BigDecimal theOrderCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(50), theOrderCost);

        System.out.println(pizzaOrder.getPizzaName() + " ordered: " + pizzaOrder.getDescription() + " at cost: " + pizzaOrder.getCost());
    }

    @Test
    public void testPizzaCapriciosaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapriciosaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza with pastry, cheese and tomato with mushrooms", description);

    }

    @Test
    public void testPizzaPeperoniWithCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoniOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(47), theCost);

        System.out.println(pizzaOrder.getPizzaName() + " ordered: " + pizzaOrder.getDescription() + " at cost: " + pizzaOrder.getCost());
    }

    @Test
    public void testPizzaPeperoniWithCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaPeperoniOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza with pastry, cheese and tomato with peperoni + cheese", description);
    }

}
