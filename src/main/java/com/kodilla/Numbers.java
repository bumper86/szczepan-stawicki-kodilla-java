package com.kodilla;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.sqrt;

public class Numbers {

    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 0;
            int result = a / b ;

        } catch (ArithmeticException e) {
            System.out.println("Don`t divide by 0");
            System.exit(0);
        } finally {
            System.out.println("Always be here");
        }


        int[] lista = new int[] {1, 2, 4, 5, 8, 5, 2};
        int result = solution2(lista);
        wyswietlWynik(lista, result);

        int[] lista2 = new int[] {1, 4, 8, 3, 2, 3, 3, 3, 5};
        int result2 = solution2(lista2);
        wyswietlWynik(lista2, result2);

        int[] lista3 = new int[] {-3, -1, -1, -3, -3 ,-3, 1, 1, 1, 2, 4};
        int result3 = solution2(lista3);
        wyswietlWynik(lista3, result3);

        int[] lista4 = new int[] {1, 3, 6, 4, 1, 2, 10, 1, 2, 4};
        int result4 = solution2(lista4);
        wyswietlWynik(lista4, result4);

     }

    public static void wyswietlWynik(int[] arr, int result) {
        StringBuilder builder = new StringBuilder();
        builder.append("Wynik dla tablicy: ");
        for (int a : arr) {
            builder.append(a);
            builder.append(" ");
        }
        builder.append("to: ");
        builder.append(result);
        System.out.println(builder.toString());
    }

    public static int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        for(int number : A) {
            if(number == result) {
                result++;
            }
        }

        return result;
    }

      public static int solution2(int[] B) {
        int result = 1;
        Set<Integer> numbers = new HashSet<>();
        for (int number : B) {
            numbers.add(number);
        }
        while (numbers.contains(result)) {
            result++;
        }
        return result;
    }

    public static boolean isSquare(int n) {
        double m = sqrt(n);
        int k = 0;
        k = (int) (m*m);
        if (k == n)
            return true;
        else return false;
    }

}
