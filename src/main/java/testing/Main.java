package testing;

import testing.data.FlightBuilder;
import testing.entity.Flight;
import testing.filter.ArrivarBeforeDepartureFilterStrategy;
import testing.filter.DirectFlightsFilterStrategy;
import testing.filter.PastDepartureFilterStrategy;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>(FlightBuilder.createFlights());

        List<Flight> correctFlights = new ArrivarBeforeDepartureFilterStrategy().filter(flights);
        System.out.println("Рейсы без ошибок в прибытии и вылета: " + correctFlights);

        List<Flight> directFlights = new DirectFlightsFilterStrategy().filter(flights);
        System.out.println("Рейсы без пересадок : " + directFlights);

        List<Flight> pastDeparture = new PastDepartureFilterStrategy().filter(flights);
        System.out.println("Рейсы без вылета в прошлом : " + pastDeparture);

    }
}
