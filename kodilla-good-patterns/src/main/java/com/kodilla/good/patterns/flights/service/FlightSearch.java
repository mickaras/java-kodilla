package com.kodilla.good.patterns.flights.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {
    FlightDatabase flightDatabase = new FlightDatabase();

    public FlightSearch() {
        flightDatabase.populateDatabase();
    }
    public void printDestinationsFromAirport(Airports airports){
        flightDatabase.getFlights().entrySet()
                .stream()
                .filter(t -> t.getKey().getDepartureAirport() == airports)
                .forEach(System.out::println);
    }
    public void printArrivalsToAirport(Airports airports){
        flightDatabase.getFlights().entrySet().stream()
                .filter(t -> t.getKey().getArrivalAirport()==airports)
                .forEach(t -> System.out.println("Flight to: "+t.getKey().getArrivalAirport()+" from: "+t.getKey().getDepartureAirport()+" arrives on: "+t.getValue().toString()));
    }
    public void searchFlights(Airports departure, Airports target){
        FlightDatabase midAirports = new FlightDatabase();
        flightDatabase.getFlights().entrySet()
                .stream()
                .filter(t -> t.getKey().getDepartureAirport()==departure)
                .filter(t -> t.getKey().getArrivalAirport()==target)
                .forEach(t -> System.out.println("Direct flights from: "+t.getKey().getDepartureAirport()+" to: "+t.getKey().getArrivalAirport()+
                        t.getValue().toString()));
        midAirports = flightDatabase.getFlights().entrySet()
                .stream()
                .filter(t -> t.getKey().getDepartureAirport()==departure)
                .filter(t -> t.getKey().getArrivalAirport()!=target)
                .collect(Collectors.toMap(Map.Entry));
        System.out.println();
        flightDatabase.getFlights().entrySet()
                .stream()
                .filter(t -> {
                    for (Flight flight:midAirports.getFlights().entrySet()) {
                        flight.getArrivalAirport()==t.getKey().getDepartureAirport();
                    }
                })
                .filter(t -> t.getKey().getArrivalAirport()==target)
                .forEach(System.out::println);
    }

}
