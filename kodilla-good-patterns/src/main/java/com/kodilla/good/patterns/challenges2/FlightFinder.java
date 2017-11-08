package com.kodilla.good.patterns.challenges2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    private ArrayList<Airport> airports;

    public FlightFinder(ArrayList<Airport> airports) {
        this.airports = airports;
    }

    public boolean IsDirectFlight(String destination) {
        Boolean isDirect = false;

        String res = airports.stream()
                .filter(airport -> airport.getNameOfAirport() == destination)
                .map(Airport::getNameOfAirport).toString();
        if (res == destination) {
            isDirect = true;
        }

        return isDirect;
    }

    public Set<Airport> findFlightsVia(Airport origin, Airport via) {
        try {
            return origin.getDestinations().stream()
                    .flatMap(airport -> airport.getDestinations().stream())
                    .filter(airport -> airport == via)
                    .flatMap(airport -> airport.getDestinations().stream())
                    .filter(airport -> airport != origin)
                    .collect(Collectors.toSet());
        } catch (Exception e) {

            System.out.println("No Flights found for: " + origin + " " + via);
        }

        return null;
    }

    public Airport getAirport(String airportName) {

        List<Airport> air =  airports.stream()
                .filter(airport -> airport.getNameOfAirport() == airportName)
                .collect(Collectors.toList());

        if(air.size() == 1 ){
            return air.get(0);

        //        for (int x = 0; x < airports.size(); x++) {
//            if (airports.get(x).getNameOfAirport() == airportName) {
//                if(airports.get(x) == null){
//                    System.out.println("Airport not found :" + airportName);
//                }
//                return airports.get(x);
//
//            }
    }
        return null;
}
}
