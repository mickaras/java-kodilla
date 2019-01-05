package com.kodilla.good.patterns.flights.service;

public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String name;
    Day(final String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}
