package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    public RpsNumbersWin gamesInput(Integer rounds, String username, Scanner move){
        int computerwin = 0;
        int playerWin = 0;
        int moveplayer = 0;
        int movecomputer = 0;
        Random random = new Random();
        for (int round = 1; round <= rounds; round++) {
                System.out.println("Please make your move.");
                do {
                    System.out.println("Write a number from 1 to 3 and press ENTER");
                    while (!move.hasNextInt()) {
                        System.out.println("That`s not a number!");
                        move.next();
                    }
                    moveplayer = move.nextInt();

                } while (moveplayer <= 0 || moveplayer >= 4);
                movecomputer = random.nextInt(3) + 1;
                System.out.println("Computer move was: " + movecomputer + "\n" + "Your move was: " + moveplayer);
                if (movecomputer == moveplayer) {
                    System.out.println("In round " + round + " we have a draw!");
                }
                if (movecomputer == 1 && moveplayer == 2) {
                    System.out.println("In round " + round + " win: " + username);
                    playerWin = playerWin + 1;
                }
                if (movecomputer == 1 && moveplayer == 3) {
                    System.out.println("In round " + round + " win:  Computer");
                    computerwin = computerwin + 1;
                }
                if (movecomputer == 2 && moveplayer == 1) {
                    System.out.println("In round " + round + " win: Computer");
                    computerwin = computerwin + 1;
                }
                if (movecomputer == 2 && moveplayer == 3) {
                    System.out.println("In round " + round + " win: " + username);
                    playerWin = playerWin + 1;
                }
                if (movecomputer == 3 && moveplayer == 2) {
                    System.out.println("In round " + round + " win: Computer");
                    computerwin = computerwin + 1;
                }
                if (movecomputer == 3 && moveplayer == 1) {
                    System.out.println("In round " + round + " win: " + username);
                    playerWin = playerWin + 1;
                }
                System.out.println("In game player wins " + playerWin + " round \nComputer wins " + computerwin + " round");
            }
            RpsNumbersWin rpsNumbersWin = new RpsNumbersWin(computerwin, playerWin);
            return rpsNumbersWin;

    }

    public void whoWin(String username, RpsNumbersWin rpsNumbersWin){
        Integer player = rpsNumbersWin.getPlayer();
        Integer computer = rpsNumbersWin.getComputer();
        System.out.println("GAME FINISH");
        if (computer < player) {
            System.out.println("The winner is " + username + " Congratulations");
        }
        if (computer > player) {
            System.out.println("You lost game. Win COMPUTER!");
        }
        if (computer == player) {
            System.out.println("DRAW");
        }
    }
}
