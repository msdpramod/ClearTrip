package org.commerceproject.cleartrip.Mapper;

import org.commerceproject.cleartrip.Models.*;

public class DtoMapper {
    public static UserDto mapUserToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setFunds(user.getFunds());


        return userDto;
    }

    public static User mapDtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setFunds(userDto.getFunds());

        return user;
    }
    public static BookingDto mapBookingToDto(Booking booking) {
        BookingDto bookingDto = new BookingDto();
        bookingDto.setId(booking.getId());
        bookingDto.setUserId(booking.getUser().getId());
        bookingDto.setFlightId(booking.getFlight().getId());
        bookingDto.setFareId(booking.getFare().getId());
        bookingDto.setSeatId(booking.getSeat().getId());

        return bookingDto;
    }

    public static FareDto mapFareToDto(Fare fare) {
        FareDto fareDto = new FareDto();
        fareDto.setId(fare.getId());
        fareDto.setFareType(fare.getType().toString());
        fareDto.setPrice(fare.getPrice());


        return fareDto;
    }

    public static FlightDto mapFlightToDto(Flight_ClearTrip flight) {
        FlightDto flightDto = new FlightDto();
        flightDto.setId(flight.getId());
        flightDto.setFrom(flight.getFrom());
        flightDto.setTo(flight.getTo());
        flightDto.setDepartDate(flight.getDepartDate());

        return flightDto;
    }

    public static SeatDto mapSeatToDto(Seat seat) {
        SeatDto seatDto = new SeatDto();
        seatDto.setId(seat.getId());
        seatDto.setSeatType(seat.getType().toString());
        seatDto.setRoom(seat.getRoom());
        seatDto.setRow(seat.getRow());
        seatDto.setColumn(seat.getColumn());

        return seatDto;
    }
}
