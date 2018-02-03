package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public final class Connections {

    public List<Flight> getConnection() {
        List<Flight> allconnections = new ArrayList<>();
        allconnections.add(new Flight(1, "Warsaw", "Poznan", LocalDateTime.of(2018,2,12,5,30), LocalDateTime.of(2018,2,12,7,0)));
        allconnections.add(new Flight(2, "Cracow", "Poznan", LocalDateTime.of(2018,2,13,6,30), LocalDateTime.of(2018,2,12,8,20)));
        allconnections.add(new Flight(3, "Berlin", "Poznan", LocalDateTime.of(2018,3,12,10,30), LocalDateTime.of(2018,3,12,12,11)));
        allconnections.add(new Flight(4, "Warsaw", "Berlin", LocalDateTime.of(2018,3,12,5,30), LocalDateTime.of(2018,3,12,10,0)));
    return allconnections;
    }
}
