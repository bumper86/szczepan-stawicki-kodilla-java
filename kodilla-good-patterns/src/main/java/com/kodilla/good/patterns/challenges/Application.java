package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args){
        MovieStore allTitles = new MovieStore();
        String theResultStringAllTitles = allTitles.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(theResultStringAllTitles);
    }
}
