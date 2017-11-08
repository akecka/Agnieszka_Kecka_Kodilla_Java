package com.kodilla.good.patterns.challenges2;

import java.util.ArrayList;

public class FlightRetrieve {
    private ArrayList<Airport> airports;

    public ArrayList<Airport> getFlights() {
        return airports;
    }



    public void populateFlights() {

        Airport airport1 = new Airport("Okecie");
        Airport airport2 = new Airport("Charles de Gaulle");
        Airport airport3 = new Airport("Gdańsk");
        Airport airport4 = new Airport("Wroclaw");
        Airport airport5 = new Airport("Heathrow");
        Airport airport6 = new Airport("Madrid");

        airport1.addDestination(airport2);
        airport2.addDestination(airport3);
        airport3.addDestination(airport4);
        airport4.addDestination(airport5);
        airport5.addDestination(airport6);

        ArrayList<Airport> listOfFlights = new ArrayList<>();
        listOfFlights.add(airport1);
        listOfFlights.add(airport2);
        listOfFlights.add(airport3);
        listOfFlights.add(airport4);
        listOfFlights.add(airport5);
        listOfFlights.add(airport6);

    }
}
