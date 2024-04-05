package org.commerceproject.cleartrip.DTOS;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class BookingDto {
//    private Long id;
    private Long userId;
    private Long flightId;
    private Long fareId;
    private Long seatId;
}
