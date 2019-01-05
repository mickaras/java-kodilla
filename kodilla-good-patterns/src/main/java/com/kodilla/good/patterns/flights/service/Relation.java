package com.kodilla.good.patterns.flights.service;

import java.util.ArrayList;
import java.util.Objects;

public class Relation {
    private String departureAirport;
    private String arrivalAirport;
    private ArrayList<TimeTable> timeTable;

    public Relation(String departureAirport, String arrivalAirport, ArrayList<TimeTable> timeTable) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.timeTable = timeTable;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public ArrayList<TimeTable> getTimeTable() {
        return timeTable;
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
        return Objects.hash(departureAirport, arrivalAirport, timeTable);
    }

    @Override
    public String toString() {
        return "Flight from " + departureAirport + " to " + arrivalAirport +" "+ timeTable.toString();
    }
}
