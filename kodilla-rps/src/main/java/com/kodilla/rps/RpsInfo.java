package com.kodilla.rps;

import java.util.Scanner;

public class RpsInfo {
    public String username;
    public Integer howManyRounds;

    public Integer showRpsInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Your Name:");
        username = scan.nextLine();
        System.out.println("Welcome RPS game " + username);
        System.out.println("Write a number how many rounds you want play?");
        do {
            System.out.println("Please write a NUMBER from 1 to 10 and press ENTER");
            while (!scan.hasNextInt()) {
                System.out.println("That`s not a number!");
                scan.next();
            }
            howManyRounds = scan.nextInt();

        } while (howManyRounds <=0 || howManyRounds >= 10 );

                System.out.println("For playing please use buttons:");
                System.out.println("1 - play ROCK");
                System.out.println("2 - play PAPER");
                System.out.println("3 - play SCISSORS");
                System.out.println("x - finish game");
                System.out.println("n - play new game");
        return howManyRounds;
    }
}
