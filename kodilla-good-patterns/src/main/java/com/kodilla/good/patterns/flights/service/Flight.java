package com.kodilla.good.patterns.flights.service;

import java.util.Objects;

public class Flight {
    private Airports departureAirport;
    private Airports arrivalAirport;
    private ShortDate departureTime;
    private ShortDate arrivalTime;

    public Flight(Airports departureAirport, Airports arrivalAirport, ShortDate departureTime, ShortDate arrivalTime) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    public ShortDate getDepartureTime() {
        return departureTime;
    }

    public ShortDate getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                Objects.equals(departureTime, flight.departureTime) &&
                Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport, departureTime, arrivalTime);
    }

    @Override
    public String toString() {
        return "Flight from: " +
                departureAirport +
                " to: " + arrivalAirport +
                " leaves on: " + departureTime +
                " arrives on " + arrivalTime;

    }
}
