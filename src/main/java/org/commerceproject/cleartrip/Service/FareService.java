package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.Models.Fare;
import org.commerceproject.cleartrip.Models.FareType;
import org.commerceproject.cleartrip.Repositories.FareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FareService implements FareServiceInterface {
    private final FareRepository fareRepository;

    public FareService(FareRepository fareRepository) {
        this.fareRepository = fareRepository;
    }

    public List<Fare> findByFareType(FareType fareType) {
        return fareRepository.findByFareType(fareType);
    }
}
