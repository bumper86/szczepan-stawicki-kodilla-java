package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddnumbers = new ArrayList<>();
        for (Integer liczba : numbers){
           if (liczba % 2 == 0) {
               oddnumbers.add(liczba);
           }
        }
        return oddnumbers;
    }
}
