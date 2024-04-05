package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.DTOS.FlightDto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface FlightServiceInterface {
    List<FlightDto> findFlights(String from, String to, LocalDate departDate, int paxCount);


}
