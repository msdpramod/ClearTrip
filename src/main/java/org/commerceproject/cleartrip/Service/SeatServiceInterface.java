package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.Models.Seat;
import org.commerceproject.cleartrip.Models.SeatType;

import java.util.List;

public interface SeatServiceInterface {
    public List<Seat> findByType(SeatType type);
}
