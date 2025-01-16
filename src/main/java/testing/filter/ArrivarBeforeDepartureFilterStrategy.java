package testing.filter;

import testing.entity.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class ArrivarBeforeDepartureFilterStrategy implements FlyFilterStrategy {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .noneMatch(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate())))
                .collect(Collectors.toList());
    }
}
