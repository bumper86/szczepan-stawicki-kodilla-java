package com.kodilla;

public class numbers2 {

    static int rewers(int number) {
        String numberStr;
        String numberRe = "";
        numberStr = String.valueOf(number);
        for (int n = numberStr.length() - 1; n >= 0; n--) {
            numberRe = numberRe + numberStr.charAt(n);
        }
        return Integer.parseInt(numberRe);
    }

    static int rewreTwo(int number) {
        int result = 0;
        while(number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 17868;
        long begin = System.nanoTime();
        int result = rewers(x);
        long end = System.nanoTime();
       System.out.println(end-begin);
        begin = System.nanoTime();
        result = rewreTwo(x);
        end = System.nanoTime();
       System.out.println(end-begin);

    }
}
