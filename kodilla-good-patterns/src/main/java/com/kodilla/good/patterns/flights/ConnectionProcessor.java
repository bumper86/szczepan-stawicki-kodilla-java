package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectionProcessor {
    Connections connections = new Connections();

    public boolean connectionToCity(ConnectionRequest connectionRequest) {
        List<Flight> toAirport = connections.getConnection().stream()
                .filter(n -> n.getArrivalCity().equals(connectionRequest.getDestinationCity()))
                .collect(Collectors.toList());

        if (toAirport.size() > 0) {
            System.out.println("Your flights to city: " + connectionRequest.getDestinationCity());
            toAirport.stream()
                    .forEach(System.out::println);
            return true;
        } else {
            System.out.println(" We don`t have connections");
            return false;
        }
    }

    public boolean connectionFromCity(ConnectionRequest connectionRequest) {
        List<Flight> formAirport = connections.getConnection().stream()
                .filter(n -> n.getDepartureCity().equals(connectionRequest.getStartCity()))
                .collect(Collectors.toList());

        if (formAirport.size() > 0) {
            System.out.println("Your flights from city: " + connectionRequest.getStartCity());
            formAirport.stream()
                    .forEach(System.out::println);
            return true;
        } else {
            System.out.println(" We don`t have connections");
            return false;
        }
    }

    public boolean connectionViaCity(ConnectionRequest connectionRequest) {
        List<Flight> formViaCity = connections.getConnection().stream()
                .filter(n -> n.getDepartureCity().equals(connectionRequest.getStartCity()))
                .filter(m -> m.getArrivalCity().equals(connectionRequest.getViaCity()))
                .collect(Collectors.toList());

        List<Flight> toViaCity = connections.getConnection().stream()
                .filter(n -> n.getDepartureCity().equals(connectionRequest.getViaCity()))
                .filter(m -> m.getArrivalCity().equals(connectionRequest.getDestinationCity()))
                .collect(Collectors.toList());

        if (formViaCity.size() > 0 && toViaCity.size() > 0) {
            System.out.println("Your possible flights from city: " + connectionRequest.getStartCity() + " to city: " + connectionRequest.getDestinationCity() + " via city: " + connectionRequest.getViaCity());
            formViaCity.stream()
                    .forEach(System.out::println);
            toViaCity.stream()
                    .forEach(System.out::println);
            return true;
        } else {
            System.out.println(" We don`t have connections");
            return false;
        }
    }
}
