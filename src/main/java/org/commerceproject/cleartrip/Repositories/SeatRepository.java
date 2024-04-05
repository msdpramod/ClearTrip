package org.commerceproject.cleartrip.Repositories;

import org.commerceproject.cleartrip.Models.Seat;
import org.commerceproject.cleartrip.Models.SeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface SeatRepository extends JpaRepository<Seat, UUID> {
    @Query("SELECT s FROM Seat s WHERE s.type = :type")
    List<Seat> findByType(SeatType type);
}