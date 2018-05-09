package com.kodilla;

public class ChangeBinar {
    public static void main(String a[]) {
        ChangeBinar bd = new ChangeBinar();
        System.out.println("11 ===> " + bd.getDecimalFromBinary(11));
        System.out.println("110 ===> " + bd.getDecimalFromBinary(110));
        System.out.println("100110 ===> " + bd.getDecimalFromBinary(100110));
    }

    public double getDecimalFromBinary(int binary) {
        double result = 0;
        int pow = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int num = binary % 10;
                result = result + num * Math.pow(2, pow);
                pow++;
                binary = binary / 10;
            }
        }
        return result;
    }
}
