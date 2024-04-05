package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.Models.Booking;
import org.commerceproject.cleartrip.Repositories.BookingRepository;

import java.util.List;
import java.util.UUID;

public interface BookingServiceInterface {
    List<Booking> findBookingsByUserId(UUID userId);


}
