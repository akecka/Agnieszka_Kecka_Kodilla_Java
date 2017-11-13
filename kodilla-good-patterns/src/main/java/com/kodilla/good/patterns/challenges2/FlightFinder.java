package com.kodilla.good.patterns.challenges2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    private ArrayList<Airport> airports;

    public FlightFinder(ArrayList<Airport> airports) {
        this.airports = airports;
    }

    public void allFlightFromCity(Airport origin) {
        String res = origin.getDestinations().stream()
                .map(airport -> airport.getNameOfAirport())
                .collect(Collectors.joining(", "));
        System.out.println("You can fly from " + origin.getNameOfAirport() + " to these destinations directly: " + res);
    }

    public void allFlightsToCity(Airport destination) {
        String res = airports.stream()
                .filter(airport -> airport.getDestinations().contains(destination))
                .map(airport -> airport.getNameOfAirport())
                .collect(Collectors.joining(", "));
        if (res == null) {
            System.out.println("No flights found to this city!");
        }
        System.out.println("Yoy can fly to " + destination.getNameOfAirport() + " directly from: " + res);
    }

    public void findFlightsVia(Airport origin, Airport via) {

        List<Airport> destinations = origin.getDestinations().stream()
                .filter(airport -> airport.equals(via))
                .flatMap(airport -> airport.getDestinations().stream())
                .filter(airport -> airport != origin)
                .collect(Collectors.toList());

        String des = destinations.stream()
                .map(airport -> airport.getNameOfAirport())
                .collect(Collectors.joining(", "));

        System.out.println("You can fly to these cities: " + des + ", via " + via.getNameOfAirport() + " airport.");

    }

    public Airport getAirport(String airportName) {

        List<Airport> air = airports.stream()
                .filter(airport -> airport.getNameOfAirport() == airportName)
                .collect(Collectors.toList());
        if (air.size() == 1) {
            return air.get(0);
        }
        return null;
    }
}
