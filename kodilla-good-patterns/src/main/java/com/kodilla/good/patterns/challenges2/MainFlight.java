package com.kodilla.good.patterns.challenges2;

import java.util.ArrayList;

public class MainFlight {

    public static void main(String[] args) {
        FlightRetrieve flightRetrieve = new FlightRetrieve();
        flightRetrieve.populateFlights();
        ArrayList<Airport> airports = flightRetrieve.getFlights();

        FlightFinder flightFinder = new FlightFinder(airports);

        Airport origin = flightFinder.getAirport("Okecie");
        Airport via = flightFinder.getAirport("Charles de Gaulle");
        Airport wro = flightFinder.getAirport("Wroclaw");

        flightFinder.findFlightsVia(origin, via);
        flightFinder.allFlightFromCity(origin);
        flightFinder.allFlightsToCity(wro);

    }
}
