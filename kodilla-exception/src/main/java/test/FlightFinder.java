package test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Charles de Gaulle", true);
        airport.put("Okęcie", true);
        airport.put("Heathrow", true);
        airport.put("Vancouver International", true);
        if (airport.get(flight.getArrivalAirport()) != null &&
                airport.get(flight.getDepartureAirport()) != null &&
                airport.get(flight.getArrivalAirport()).booleanValue() &&
                airport.get(flight.getDepartureAirport()).booleanValue()) {
            return true;
        }
        throw new RouteNotFoundException("Route not found: " + flight.getDepartureAirport() + " - " + flight.getArrivalAirport());
    }

}
