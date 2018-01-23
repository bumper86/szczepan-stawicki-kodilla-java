package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindingFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", false);
        flights.put("Cracow", true);
        flights.put("Poznan", true);


        if (flight != null) {
            if (flights.get(flight.getArrivalAirport()) && flights.get(flight.getDepartureAirport())) {
                System.out.println("Lot is available");
            } else {throw new RouteNotFoundException("Lot is not available");}
        } else  {throw new RouteNotFoundException("You don`t add airport"); }

    }
}
