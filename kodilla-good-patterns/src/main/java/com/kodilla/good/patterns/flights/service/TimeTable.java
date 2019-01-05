package com.kodilla.good.patterns.flights.service;

public class TimeTable {
    private ShortDate departureTime;
    private ShortDate arrivalTime;

    public TimeTable(ShortDate departureTime, ShortDate arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public ShortDate getDepartureTime() {
        return departureTime;
    }

    public ShortDate getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "leaves on " +
                 departureTime +
                " arrives on " + arrivalTime+'\n';
    }
}
