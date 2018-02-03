package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public class ConnectionRequest {
    private String name;
    private String startCity;
    private String viaCity;
    private String destinationCity;
    private LocalDateTime startDateTiem;

    public ConnectionRequest(String name, String startCity, String viaCity, String destinationCity, LocalDateTime startDateTiem) {
        this.name = name;
        this.startCity = startCity;
        this.viaCity = viaCity;
        this.destinationCity = destinationCity;
        this.startDateTiem = startDateTiem;
    }

    public String getName() {
        return name;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getViaCity() {
        return viaCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public LocalDateTime getStartDateTiem() {
        return startDateTiem;
    }

    @Override
    public String toString() {
        return "ConnectionRequest{" +
                "name='" + name + '\'' +
                ", startCity='" + startCity + '\'' +
                ", viaCity='" + viaCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", startDateTiem=" + startDateTiem +
                '}';
    }
}
