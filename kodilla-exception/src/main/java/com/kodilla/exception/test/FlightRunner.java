package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] arg){
        Flight flight1 = new Flight("Up","Down");
        Flight flight2 = new Flight("Left","Right");
        Flight flight3 = new Flight("Right","Left");
        FlightFinder flightFinder = new FlightFinder();
        try{
            flightFinder.findFlight(flight1);
            System.out.println("Is it possible to fly "+flight1.arrivalAirport+"?: "+flightFinder.findFlight(flight1));
        }
        catch(RouteNotFoundException e){
            System.out.println("No such flight");
        }
        try{
            flightFinder.findFlight(flight2);
            System.out.println("Is it possible to fly "+flight2.arrivalAirport+"?: "+flightFinder.findFlight(flight2));
        }
        catch(RouteNotFoundException e){
            System.out.println("No such flight");
        }
        try{
            flightFinder.findFlight(flight3);
            System.out.println("Is it possible to fly "+flight3.arrivalAirport+"?: "+flightFinder.findFlight(flight3));
        }
        catch(RouteNotFoundException e){
            System.out.println("No such flight");
        }
        finally {
            System.out.println("Done!");
        }

    }
}
