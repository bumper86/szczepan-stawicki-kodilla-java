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
        List<Flight> fromAirport = connections.getConnection().stream()
                .filter(n -> n.getDepartureCity().equals(connectionRequest.getStartCity()))
                .collect(Collectors.toList());

        if (fromAirport.size() > 0) {
            System.out.println("Your flights from city: " + connectionRequest.getStartCity());
            fromAirport.stream()
                    .forEach(System.out::println);
            return true;
        } else {
            System.out.println(" We don`t have connections");
            return false;
        }
    }

    public boolean connectionViaCity(ConnectionRequest connectionRequest) {
        List<Flight> fromViaCity = connections.getConnection().stream()
                .filter(n -> n.getDepartureCity().equals(connectionRequest.getStartCity()) && n.getArrivalCity().equals(connectionRequest.getViaCity()))
                .collect(Collectors.toList());

        List<Flight> toViaCity = connections.getConnection().stream()
                .filter(n -> n.getDepartureCity().equals(connectionRequest.getViaCity()) && n.getArrivalCity().equals(connectionRequest.getDestinationCity()))
                .collect(Collectors.toList());

        if (fromViaCity.size() > 0 && toViaCity.size() > 0) {
            System.out.println("Your possible flights from city: " + connectionRequest.getStartCity() + " to city: " + connectionRequest.getDestinationCity() + " via city: " + connectionRequest.getViaCity());
            fromViaCity.stream()
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
