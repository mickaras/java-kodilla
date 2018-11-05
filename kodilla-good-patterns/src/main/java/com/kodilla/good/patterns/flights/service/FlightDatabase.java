package com.kodilla.good.patterns.flights.service;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightDatabase {
    private HashMap<Relation, ArrayList<TimeTable>> flights = new HashMap<Relation, ArrayList<TimeTable>>();

    public void populateDatabase() {
        Relation relationKraWro = new Relation(Airports.KRAKOW, Airports.WROCLAW);
        Relation relationKraWaw = new Relation(Airports.KRAKOW, Airports.WARSAW);
        Relation relationKraGda = new Relation(Airports.KRAKOW, Airports.GDANSK);
        Relation relationWroKra = new Relation(Airports.WROCLAW, Airports.KRAKOW);
        Relation relationWroWaw = new Relation(Airports.WROCLAW, Airports.WARSAW);
        Relation relationWroGda = new Relation(Airports.WROCLAW, Airports.GDANSK);
        Relation relationGdaKra = new Relation(Airports.GDANSK, Airports.KRAKOW);
        Relation relationGdaWro = new Relation(Airports.GDANSK, Airports.WROCLAW);
        Relation relationGdaWaw = new Relation(Airports.GDANSK, Airports.WARSAW);
        Relation relationWawKra = new Relation(Airports.WARSAW, Airports.KRAKOW);
        Relation relationWawWro = new Relation(Airports.WARSAW, Airports.WROCLAW);
        Relation relationWawGda = new Relation(Airports.WARSAW, Airports.GDANSK);
        ArrayList<TimeTable> timeTable1 = new ArrayList<>();
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,9,15), new ShortDate(Day.MONDAY,10,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,10,15), new ShortDate(Day.MONDAY,11,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,11,15), new ShortDate(Day.MONDAY,12,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,12,15), new ShortDate(Day.MONDAY,13,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,13,15), new ShortDate(Day.MONDAY,14,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,14,15), new ShortDate(Day.MONDAY,15,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,15,15), new ShortDate(Day.MONDAY,16,20)));
        flights.put(relationGdaKra,timeTable1);
        flights.put(relationGdaWaw,timeTable1);
        flights.put(relationGdaWro,timeTable1);
        flights.put(relationKraGda,timeTable1);
        flights.put(relationKraWaw,timeTable1);
        flights.put(relationKraWro,timeTable1);
        flights.put(relationWawGda,timeTable1);
        flights.put(relationWawWro,timeTable1);
        flights.put(relationWroWaw,timeTable1);
    }


    public HashMap<Relation, ArrayList<TimeTable>> getFlights() {
        return flights;
    }
}
