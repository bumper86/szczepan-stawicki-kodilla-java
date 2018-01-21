package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        int end = 1;
        while (end == 1){
        RpsInfo rpsInfo = new RpsInfo();
        Integer rounds = rpsInfo.showRpsInfo();
        String username = rpsInfo.username;
        RpsGame rpsGame = new RpsGame();
        rpsGame.gamesInput(rounds, username);
        RpsEnd rpsEnd = new RpsEnd();
        end = rpsEnd.theEnd();
        }

    }
}
