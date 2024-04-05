package org.commerceproject.cleartrip.Repositories;

import org.commerceproject.cleartrip.Models.Fare;
import org.commerceproject.cleartrip.Models.FareType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FareRepository extends JpaRepository<Fare, UUID> {
    @Query("SELECT f FROM Fare f WHERE f.type = :fareType") // fare was corrected to type
    List<Fare> findByFareType(FareType fareType);
}
