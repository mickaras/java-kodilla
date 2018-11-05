package com.kodilla.good.patterns.flights.service;

import java.util.Objects;

public class Relation {
    private Airports departureAirport;
    private Airports arrivalAirport;

    public Relation(Airports departureAirport, Airports arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relation relation = (Relation) o;
        return departureAirport == relation.departureAirport &&
                arrivalAirport == relation.arrivalAirport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport);
    }
}
