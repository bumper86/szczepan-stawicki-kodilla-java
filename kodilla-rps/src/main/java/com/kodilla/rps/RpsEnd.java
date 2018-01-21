package com.kodilla.rps;

import java.util.Scanner;

public class RpsEnd {
    public Integer theEnd() {
        String chose = "";
        int again = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Do you want play again? \n Yes please 'n' and enter. \n No please x and enter.");
        while (!scan.hasNext("[xn]")) {
            System.out.println("Wrong char please enter x or n");
            scan.next();
        }
        String whatNext = scan.next();
        if (whatNext.equals("n")) {
            System.out.println("Are you sure you want to play again?");
            do {
                while (!scan.hasNext("[yn]")) {
                    System.out.println("Wrong char please enter 'y' to yes or 'n' to end program");
                    scan.next();
                }
                chose = scan.next();
            } while (!chose.equals("y"));
            again = 1;
        } if(whatNext.equals("x")) {
            System.out.println("Are you sure you want to finish game?");
            do {
                while (!scan.hasNext("[yn]")) {
                    System.out.println("Wrong char please enter 'y' to end program or 'n' to play again");
                    scan.next();
                }
                chose = scan.next();
            } while (!chose.equals("y"));
            again = 2;
        }
        scan.close();
        return again;
    }
}

