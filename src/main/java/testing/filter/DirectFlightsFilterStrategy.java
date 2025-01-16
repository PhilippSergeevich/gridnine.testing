package testing.filter;

import testing.entity.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class DirectFlightsFilterStrategy implements FlyFilterStrategy {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().size() <= 1)
                .collect(Collectors.toList());
    }
}