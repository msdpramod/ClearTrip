package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.Models.Fare;
import org.commerceproject.cleartrip.Models.FareType;

import java.util.List;

public interface FareServiceInterface {
    List<Fare> findByFareType(FareType fareType);
}
