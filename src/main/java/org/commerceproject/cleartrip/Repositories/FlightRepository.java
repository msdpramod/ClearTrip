package org.commerceproject.cleartrip.Repositories;


import org.commerceproject.cleartrip.Models.Flight_ClearTrip;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface FlightRepository extends JpaRepository<Flight_ClearTrip, UUID> {
    @Query("SELECT f FROM Flight_ClearTrip f WHERE f.from = :from AND f.to = :to AND f.departDate = :departDate")
    List<Flight_ClearTrip> findFlights(String from, String to, LocalDate departDate);

}
