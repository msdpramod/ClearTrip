package org.commerceproject.cleartrip.Service;

import jakarta.transaction.Transactional;
import org.commerceproject.cleartrip.Models.Booking;
import org.commerceproject.cleartrip.Models.User;
import org.commerceproject.cleartrip.Repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookingService implements BookingServiceInterface {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> findBookingsByUserId(UUID userId) {
        return bookingRepository.findBookingsByUserId(userId);
    }
    public void cancelBooking(Long id) {
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Booking not found for the id :" + id));
        bookingRepository.save(booking);
    }
    @Autowired
    UserRepository userRepository;
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    SeatRepository seatRepository;
    @Autowired
    TicketRepository ticketRepository;

    public Ticket bookFlightTicket(List<Long> seatIds, Long userId, Long flightId) throws InValidArgumetsException, SeatNotAvailableException {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) {
            throw new InValidArgumetsException ("User with id: " + userId + " doesn't exist.");
        }

        Optional<Flight> flightOptional = flightRepository.findById(flightId);
        if(flightOptional.isEmpty()){
            throw new InValidArgumetsException("Flight not found for id: " + flightId);
        }

        List<Seat> seats = seatRepository.findAllByIdIn(seatIds);
        List<Seat> availableSeats = getAndLockSeats(seats, flightOptional.get());

        Ticket ticket = new Ticket();
        ticket.setUser(userOptional.get());
        ticket.setTicketStatus(TicketStatus.PROCESSING);
        ticket.setFlight(flightOptional.get());
        ticket.setSeats(availableSeats);
        ticket.setAmount(0);
        ticket.setBookingTime(new Date());

        Ticket savedTicket = ticketRepository.save(ticket);

        return savedTicket;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE, timeout = 2)
    public List<Seat> getAndLockSeats(List<Seat> seats, Flight flight) throws SeatNotAvailableException {
        for (Seat seat: seats) {
            if (!seat.isAvailable()) {
                throw new SeatNotAvailableException("Seat with id: " + seat.getId() + " is not available.");
            }
        }

        List<Seat> lockedSeats = new ArrayList<>();
        for (Seat seat: seats) {
            seat.setAvailable(false);
            lockedSeats.add(seatRepository.save(seat));
        }
        return lockedSeats;
    }
}
