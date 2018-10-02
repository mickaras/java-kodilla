package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight (Flight flight)throws RouteNotFoundException{
        Map<String,Boolean> flightMap = new HashMap<>();
        boolean flightPossible = false;
        flightMap.put("Left",false);
        flightMap.put("Right",true);
        if(flightMap.containsKey(flight.getArrivalAirport())){
            flightPossible = flightMap.get(flight.getArrivalAirport());
        }
        else{
            throw new RouteNotFoundException();
        }
        return flightPossible;
    }

}
