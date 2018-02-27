package com.kodilla;

public class Fibonacci {
    static int fibonnaciRekurencja(int number) {
        if (number >= 2)
        return fibonnaciRekurencja(number-1) + fibonnaciRekurencja(number-2);
        else return number;
    }

    static int intfibonacciPetla(int number) {
        int n = 1;
        int m = 0;
        for (int i = 1; i <= number +1; i++) {
            m = n + m;
            n = m - n;
        }
        if(number == 0 || number == 1)
        return number;
        else return n;
    }

    static int fibo (int number) {
        int n=0;
        int m=1;
        int result = 0;
        for (int i =2; i<=number; i++){
            result = n + m;
            n = m;
            m = result;
        }
        return result;
    }

    public static void main(String[] args) {
        long begin = System.nanoTime();
        System.out.println(fibonnaciRekurencja(6));
        long end = System.nanoTime();
        System.out.println(end - begin);
        begin = System.nanoTime();
        System.out.println(intfibonacciPetla(6));
        end = System.nanoTime();
        System.out.println(end - begin);

        System.out.println(fibo(10));
    }
}
