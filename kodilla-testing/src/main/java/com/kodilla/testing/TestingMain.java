package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        Calculator calc = new Calculator();
        int a = 6;
        int b = 5;

        int test_1 = calc.add(a, b);
        int test_2 = calc.subtract(a, b);

        if (test_1 == 11) {
            System.out.println("Adding works");
        } else {
            System.out.println("Error in adding");
        }
        if (test_2 == 1) {
            System.out.println("Subtraction works");
        } else {
            System.out.println("Error in subtraction");
        }
    }
}