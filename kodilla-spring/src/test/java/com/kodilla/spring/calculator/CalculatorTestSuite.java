package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addresult = calculator.add(2.5, 5.5);
        double subresult = calculator.sub(4.5, 7.5);
        double mulresult = calculator.mul(5.5, 8.5);
        double divresult = calculator.div(10.5, 12.5);
        //Then
        Assert.assertEquals(8.0, addresult, 0.01);
        Assert.assertEquals(-3.0, subresult, 0.01);
        Assert.assertEquals(46.75, mulresult, 0.01);
        Assert.assertEquals(0.84, divresult, 0.01);
    }
}
