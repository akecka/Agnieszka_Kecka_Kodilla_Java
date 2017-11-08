package com.kodilla.good.patterns.challenges2;

import java.util.ArrayList;

public class MainFlight {

    public static void main(String[] args) {
        FlightRetrieve flightRetrieve = new FlightRetrieve();
        flightRetrieve.populateFlights();
        ArrayList<Airport> airports = flightRetrieve.getFlights();

        FlightFinder flightFinder = new FlightFinder(airports);

        System.out.println(flightFinder.getAirports().size());
//        Airport origin = flightFinder.getAirport("Okecie");
//        Airport via = flightRetrieve.getAirport("Charles de Gaulle");

       // System.out.println(flightFinder.findFlightsVia(origin, via));

    }
}
