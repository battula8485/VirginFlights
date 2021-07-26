package com.virginflights.info.model;

public class FlightData {

    private String departureTime;
    private String destination;
    private String destinationAirportIATA;
    private String flightNo;

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationAirportIATA() {
        return destinationAirportIATA;
    }

    public void setDestinationAirportIATA(String destinationAirportIATA) {
        this.destinationAirportIATA = destinationAirportIATA;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }
}
