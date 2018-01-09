package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // kolejny test ->
        System.out.println("test - pierwszy test jednostkowy:");

        Calculator numbers = new Calculator(5, 6);

        int add = numbers.add();
        int substract = numbers.substract();

        if (add == 11) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        if (substract == -1) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
