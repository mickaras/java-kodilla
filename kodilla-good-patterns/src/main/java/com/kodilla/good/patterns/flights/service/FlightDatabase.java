package com.kodilla.good.patterns.flights.service;

import java.util.ArrayList;


public class FlightDatabase {
    private ArrayList<Relation> flights = new ArrayList<>();
    public static String KRAKOW = "Krakow";
    public static String GDANSK = "Gdansk";
    public static String WARSAW = "Warsaw";
    public static String WROCLAW = "Wroclaw";
    public void populateDatabase() {
        ArrayList<TimeTable> timeTable1 = new ArrayList<>();
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,9,15), new ShortDate(Day.MONDAY,10,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,11,15), new ShortDate(Day.MONDAY,12,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,12,15), new ShortDate(Day.MONDAY,13,20)));
        timeTable1.add(new TimeTable(new ShortDate(Day.MONDAY,14,15), new ShortDate(Day.MONDAY,15,20)));
        Relation relationKraWro = new Relation(KRAKOW, WROCLAW, timeTable1);
        Relation relationKraWaw = new Relation(KRAKOW, WARSAW, timeTable1);
        Relation relationKraGda = new Relation(KRAKOW, GDANSK, timeTable1);
        Relation relationWroKra = new Relation(WROCLAW, KRAKOW, timeTable1);
        Relation relationWroWaw = new Relation(WROCLAW, WARSAW, timeTable1);
        Relation relationWroGda = new Relation(WROCLAW, GDANSK, timeTable1);
        Relation relationGdaKra = new Relation(GDANSK, KRAKOW, timeTable1);
        Relation relationGdaWro = new Relation(GDANSK, WROCLAW, timeTable1);
        Relation relationGdaWaw = new Relation(GDANSK, WARSAW, timeTable1);
        Relation relationWawKra = new Relation(WARSAW, KRAKOW, timeTable1);
        Relation relationWawWro = new Relation(WARSAW, WROCLAW, timeTable1);
        Relation relationWawGda = new Relation(WARSAW, GDANSK, timeTable1);
        flights.add(relationKraWro);
        flights.add(relationKraWaw);
        flights.add(relationKraGda);
        flights.add(relationWroKra);
        flights.add(relationWroWaw);
        flights.add(relationWroGda);
        flights.add(relationGdaKra);
        flights.add(relationGdaWro);
        flights.add(relationGdaWaw);
        flights.add(relationWawKra);
        flights.add(relationWawWro);
        flights.add(relationWawGda);
    }


    public ArrayList<Relation> getFlights() {
        return flights;
    }
    public void addFlight(Relation relation){
        flights.add(relation);
    }
}
