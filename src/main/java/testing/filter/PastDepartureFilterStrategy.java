package testing.filter;

import testing.entity.Flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PastDepartureFilterStrategy implements FlyFilterStrategy {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        LocalDateTime now = LocalDateTime.now();
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getDepartureDate().isAfter(now)))
                .collect(Collectors.toList());
    }
}
