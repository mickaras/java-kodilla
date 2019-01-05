package com.kodilla.good.patterns.flights.service;

import java.util.stream.Collectors;

public class FlightSearch {
    FlightDatabase flightDatabase = new FlightDatabase();

    public FlightSearch() {
        flightDatabase.populateDatabase();
    }
    public void printDestinationsFromAirport(String airports){
        flightDatabase.getFlights()
                .stream()
                .filter(t -> t.getDepartureAirport().equals(airports))
                .forEach(t -> System.out.println("Departures from "+t.getDepartureAirport()+" to "+t.getArrivalAirport()+": "+t.getTimeTable().stream().map(TimeTable::getDepartureTime).collect(Collectors.toList())));
    }
    public void printArrivalsToAirport(String airports){
        flightDatabase.getFlights().stream()
                .filter(t -> t.getArrivalAirport().equals(airports))
                .forEach(t -> System.out.println("Arrivals to "+t.getArrivalAirport()+" from "+t.getDepartureAirport()+": "+t.getTimeTable().stream().map(TimeTable::getArrivalTime).collect(Collectors.toList())));
    }
    public void searchFlights(String departure, String target){
        FlightDatabase midAirports = new FlightDatabase();
        flightDatabase.getFlights()
                .stream()
                .filter(t -> t.getDepartureAirport().equals(departure))
                .filter(t -> t.getArrivalAirport().equals(target))
                .forEach(t -> System.out.println("Direct flights from "+t.getDepartureAirport()+" to "+t.getArrivalAirport()+
                        t.getTimeTable().toString()));
        flightDatabase.getFlights()
                .stream()
                .filter(t -> t.getDepartureAirport().equals(departure))
                .filter(t -> !t.getArrivalAirport().equals(target))
                .forEach(midAirports::addFlight);
        System.out.println();
        for(Relation relation:midAirports.getFlights()){
            flightDatabase.getFlights()
                    .stream()
                    .filter(t-> t.getTimeTable()
                            .stream()
                            .map(u->u.getDepartureTime())
                            .filter(v -> v.transferTime(relation.getTimeTable()
                                    .stream()
                                    .flatMap(w->w.getArrivalTime()))))
                                    .collect(Collectors.toList());

        }
        flightDatabase.getFlights()
                .stream()
                .filter(t -> !t.getDepartureAirport().equals(departure))
                .filter(t -> t.getArrivalAirport().equals(target))
                .forEach(t -> System.out.println("Flight from "+departure+" through "+t.getDepartureAirport()+" to "+target+": "));
    }

}
