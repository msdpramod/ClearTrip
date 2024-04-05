package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.Models.Seat;
import org.commerceproject.cleartrip.Models.SeatType;
import org.commerceproject.cleartrip.Repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeatService implements SeatServiceInterface {
    private final SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> findByType(SeatType type) {
        return seatRepository.findByType(type);
    }

}
