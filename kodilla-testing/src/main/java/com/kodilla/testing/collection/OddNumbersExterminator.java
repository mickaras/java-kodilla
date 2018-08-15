package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evens = new ArrayList<>();
        for(int num:numbers){
            if( num%2!=0){
                evens.add(num);
            }

        }
        return evens;
    }
}
