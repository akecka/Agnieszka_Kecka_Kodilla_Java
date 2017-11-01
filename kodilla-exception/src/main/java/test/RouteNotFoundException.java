package test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String route){
            super(route);
    }
}
