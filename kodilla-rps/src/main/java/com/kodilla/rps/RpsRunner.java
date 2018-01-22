package com.kodilla.rps;

import java.util.List;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = true;
        Scanner scan = new Scanner(System.in);
        while (end){
        RpsInfo rpsInfo = new RpsInfo();
        String username = rpsInfo.getUsername(scan);
        Integer rounds = rpsInfo.howManyRounds(scan);
        rpsInfo.infoGame();
        RpsGame rpsGame = new RpsGame();
        List<Integer> whoWin = rpsGame.gamesInput(rounds, username, scan);
        rpsGame.whoWin(username, whoWin);
        RpsEnd rpsEnd = new RpsEnd();
        end = rpsEnd.theEnd(scan);
        }
    scan.close();
    }
}
