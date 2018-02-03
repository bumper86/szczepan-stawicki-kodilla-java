package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public class ConnectionRequestRetrieve {
    public ConnectionRequest retrieve() {
        ConnectionRequest connectionRequest = new ConnectionRequest("John", "Warsaw", "Berlin", "Poznan", LocalDateTime.of(2018,3,12,5,30));
        return connectionRequest;
    }
}
