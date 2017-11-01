package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[]{6, 7, 8, 9, 10};
        //Then
        Assert.assertEquals(8, getAverage(numbers), 0.001);
    }

}
