package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyWillThrowException(10, 5);
        } catch (Exception e) {
            System.out.println("Problem with secondChallenge");
        } finally {
            System.out.println("I`am always be here!");
        }
    }
}
