package com.kodilla.good.patterns.flights;



public class Application {
    public static void main(String[] args){
        ConnectionRequestRetrieve connectionRequestRetrieve = new ConnectionRequestRetrieve();
        ConnectionRequest connectionRequest = connectionRequestRetrieve.retrieve();

        ConnectionProcessor connectionProcessor = new ConnectionProcessor();
        connectionProcessor.connectionToCity(connectionRequest);
        connectionProcessor.connectionFromCity(connectionRequest);
        connectionProcessor.connectionViaCity(connectionRequest);
    }
}
