package com.kodilla;

import java.util.Arrays;
import java.util.List;

public class NumberRepeat {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,3);
        /*for (int i = 1; i <=3; i++) {
            num.add(i); }
            num.add(2);*/
        System.out.println(numbers(num));
    }

    static int numbers(List<Integer> num) {
        int suma = add(num);
        int max = num.size()-1;
        int sumaWithout = (max * (max+1)) / 2;
       /* for (int i = 1; i <= num.size(); i++) {
            sumaWithout = sumaWithout + i;
        }
        return sumaWithout - suma; */
       return suma - sumaWithout;
    }

    static int add(List<Integer> num) {
        int result = 0;
        for (int number: num) {
            result = result + number;
        }
        return result;
    }
}
