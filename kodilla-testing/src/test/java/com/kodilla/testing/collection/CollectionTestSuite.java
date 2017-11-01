package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case:begin");
    }
    @After
    public void after(){
        System.out.println("Test Case:end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator  = new OddNumbersExterminator();
        ArrayList<Integer> empty = new ArrayList<>();
        //When
        ArrayList<Integer> result = exterminator.exterminate(empty);
        System.out.println("Testing empty Array: " + result);
        //Then
        Assert.assertEquals(empty, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator  = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<>();
            input.add(1);
            input.add(2);
            input.add(3);
            input.add(4);
            input.add(5);
        ArrayList<Integer> even = new ArrayList<>();
            even.add(2);
            even.add(4);
        //When
        ArrayList<Integer> result2 = exterminator.exterminate(input);
        System.out.println("Testing even list: " + result2);
        //Then
        Assert.assertEquals(even, result2);
    }

}
