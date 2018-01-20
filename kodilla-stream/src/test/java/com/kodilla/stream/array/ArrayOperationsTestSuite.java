package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[4];
        numbers[0] = 5;
        numbers[1] = 5;
        numbers[2] = 7;
        numbers[3] = 3;

        //When
        double result = getAverage(numbers);


        //Then
        Assert.assertEquals(5.0,result,0);
    }
}
