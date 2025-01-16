package testing.filter;


import testing.entity.Flight;

import java.util.List;

public interface FlyFilterStrategy {
    List<Flight> filter(List<Flight> flights);
}
