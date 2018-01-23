package com.kodilla.exception.test;

public class FindingFlightRunner {
    public static void main(String[] args){
        Flight flight1 = new Flight("Poznan", "Cracow");
        Flight flight2 = new Flight("Poznan", "Warsaw");
        FindingFlight findingFlight = new FindingFlight();
        try {
            findingFlight.findFlight(flight1);
            findingFlight.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("This connect is not available!");
        }
    }
}
