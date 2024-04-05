package org.commerceproject.cleartrip.Controllers;

import org.commerceproject.cleartrip.DTOS.BookingDto;
import org.commerceproject.cleartrip.DTOS.FlightDto;
import org.commerceproject.cleartrip.DTOS.UserDto;
import org.commerceproject.cleartrip.Models.Ticket;
import org.commerceproject.cleartrip.Service.BookingService;
import org.commerceproject.cleartrip.Service.FlightService;
import org.commerceproject.cleartrip.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clearTrip")
public class FlightController {
    private final UserService userService;
    private final FlightService flightService;
    private final BookingService bookingService;



    public FlightController(UserService userService, FlightService flightService, BookingService bookingService) {
        this.userService = userService;
        this.flightService = flightService;
        this.bookingService = bookingService;
    }
    @PostMapping("/user")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
        UserDto createdUser = userService.saveUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/searchFlight")
    public ResponseEntity<List<FlightDto>> searchFlight(@RequestParam String from, @RequestParam String to, @RequestParam LocalDate departDate, @RequestParam int paxCount) {
        List<FlightDto> availableFlights = flightService.findFlights(from, to, departDate, paxCount);
        return new ResponseEntity<>(availableFlights, HttpStatus.OK);
    }

    @PostMapping("/bookFlight")
    public ResponseEntity<Ticket> bookFlightTicket(@RequestBody TicketRequest ticketRequest) {
        try {
            Ticket ticket = flightService.bookFlightTicket(ticketRequest.getSeatIds(), ticketRequest.getUserId(), ticketRequest.getFlightId());
            return new ResponseEntity<>(ticket, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/flights/{id}")
    public ResponseEntity<FlightDto> getFlightById(@PathVariable UUID id) {
        FlightDto flight = (FlightDto) flightService.findFlights(id);
        return new ResponseEntity<>(flight, HttpStatus.OK);
    }

    // Update User details
    @PutMapping("/user/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable UUID id, @RequestBody UserDto userDto) {
        UserDto updatedUser = userService.updateUser(id, userDto);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Cancel a booking
    @DeleteMapping("/bookings/{id}")
    public ResponseEntity<Void> cancelBooking(@PathVariable Long id) {
        bookingService.cancelBooking(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Return all flights
    @GetMapping("/allFlights")
    public ResponseEntity<List<FlightDto>> getAllFlights() {
        List<FlightDto> allFlights = flightService.getAllFlights();
        return new ResponseEntity<>(allFlights, HttpStatus.OK);
    }

}