package com.virginflights.info.model;

import com.opencsv.bean.CsvBindByPosition;

public class FlightBean {

    @CsvBindByPosition(position = 0)
    private String DepartureTime;

    @CsvBindByPosition(position = 1)
    private String Destination;

    @CsvBindByPosition(position = 2)
    private String DestinationAirportIATA;

    @CsvBindByPosition(position = 3)
    private String FlightNo;

    @CsvBindByPosition(position = 4)
    private String Sunday;

    @CsvBindByPosition(position = 5)
    private String Monday;

    @CsvBindByPosition(position = 6)
    private String Tuesday;

    @CsvBindByPosition(position = 7)
    private String Wednesday;

    @CsvBindByPosition(position = 8)
    private String Thursday;

    @CsvBindByPosition(position = 9)
    private String Friday;

    @CsvBindByPosition(position = 10)
    private String Saturday;


    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDestinationAirportIATA() {
        return DestinationAirportIATA;
    }

    public void setDestinationAirportIATA(String destinationAirportIATA) {
        DestinationAirportIATA = destinationAirportIATA;
    }

    public String getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(String flightNo) {
        FlightNo = flightNo;
    }

    public String getSunday() {
        return Sunday;
    }

    public void setSunday(String sunday) {
        Sunday = sunday;
    }

    public String getMonday() {
        return Monday;
    }

    public void setMonday(String monday) {
        Monday = monday;
    }

    public String getTuesday() {
        return Tuesday;
    }

    public void setTuesday(String tuesday) {
        Tuesday = tuesday;
    }

    public String getWednesday() {
        return Wednesday;
    }

    public void setWednesday(String wednesday) {
        Wednesday = wednesday;
    }

    public String getThursday() {
        return Thursday;
    }

    public void setThursday(String thursday) {
        Thursday = thursday;
    }

    public String getFriday() {
        return Friday;
    }

    public void setFriday(String friday) {
        Friday = friday;
    }

    public String getSaturday() {
        return Saturday;
    }

    public void setSaturday(String saturday) {
        Saturday = saturday;
    }
}
