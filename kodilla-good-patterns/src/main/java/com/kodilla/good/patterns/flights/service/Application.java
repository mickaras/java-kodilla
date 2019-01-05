package com.kodilla.good.patterns.flights.service;

import static com.kodilla.good.patterns.flights.service.FlightDatabase.KRAKOW;
import static com.kodilla.good.patterns.flights.service.FlightDatabase.WARSAW;

public class Application {
    public static void main(String[] args){
        ShortDate date1 = new ShortDate(Day.MONDAY,23,22);
        ShortDate date2 = new ShortDate(Day.WEDNESDAY,21,23);
        System.out.println(date1.readableTransferTime(date2));
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.printDestinationsFromAirport(WARSAW);
        System.out.println();
        flightSearch.printArrivalsToAirport(KRAKOW);
        System.out.println();
        flightSearch.searchFlights(WARSAW, KRAKOW);
    }
}
