package com.kodilla.good.patterns.challenges2;

import java.util.ArrayList;

public class Airport {

    private final String nameOfAirport;
    private final ArrayList<Airport> destinations = new ArrayList<>();


    public Airport(final String nameOfAirport) {
        this.nameOfAirport = nameOfAirport;
    }

    public void addDestination(Airport airport) {
        destinations.add(airport);
    }

    public String getNameOfAirport() {
        return nameOfAirport;
    }

    public ArrayList<Airport> getDestinations() {
        return destinations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!nameOfAirport.equals(airport.nameOfAirport)) return false;
        return destinations != null ? destinations.equals(airport.destinations) : airport.destinations == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfAirport.hashCode();
        result = 31 * result + (destinations != null ? destinations.hashCode() : 0);
        return result;
    }
}
