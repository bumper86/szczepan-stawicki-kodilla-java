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
       /* long begin = System.nanoTime();
        System.out.println(fibonnaciRekurencja(6));
        long end = System.nanoTime();
        System.out.println(end - begin);
        begin = System.nanoTime();
        System.out.println(intfibonacciPetla(6));
        end = System.nanoTime();
        System.out.println(end - begin);

        System.out.println(fibo(10));*/
      //  System.out.println(tribonacci(new double[]{20.0,10.0,4.0},2));
        int i = Integer.MAX_VALUE;
        int b = -i;
        float f = i;
        System.out.println(i +" "+ f +" " + (i-(int)f));
        System.out.println('x' + 'x');


    }

    public static double[] tribonacci(double[] s, int n) {
        double[] m = new double[n];
        if(n==0)
            return m;
        else if(n<=s.length){
            for(int j=0; j<n; j++)
                m[j]=s[j];
        } else
       {
            for(int j=0; j<s.length; j++)
                m[j]=s[j];     }

        for(int i=s.length; i<n; i++) {
            m[i]=m[i-3]+m[i-2]+m[i-1];
        }
        return m;
    }


}
