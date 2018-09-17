package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int numbers[] = new int[20];

        for (int i=0;i<20;i++) {
            numbers[i]=i*i*i;
        }

        Assert.assertEquals(1805, ArrayOperations.getAverage(numbers),0);
    }
}
