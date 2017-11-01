package test;

public class FlightExceptionRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Heathrow", "Okęcie");
        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(flight);
            System.out.println("Flights found: " + flight.getDepartureAirport() + " - " + flight.getArrivalAirport());

        } catch (RouteNotFoundException e) {

            System.out.println(e);

        }

    }
}
