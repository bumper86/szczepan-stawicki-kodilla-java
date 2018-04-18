package com.kodilla;

public class FirstNumber {

    public static void main(String[] args) {
        long begin = System.nanoTime();
        System.out.println(number(531799));
        long end = System.nanoTime();
        System.out.println(end-begin);

        begin = System.nanoTime();
        System.out.println(number2(531799));
        end = System.nanoTime();
        System.out.println(end-begin);
    }

    static boolean number(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean number2(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


