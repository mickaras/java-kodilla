package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(n -> n=numbers[n])
                .forEach(System.out::println);
        double result = IntStream.range(0, numbers.length)
                .map(n -> n=numbers[n])
                .average().getAsDouble();
        return result;
    }

}
