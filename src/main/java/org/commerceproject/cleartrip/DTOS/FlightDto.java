package org.commerceproject.cleartrip.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter
public class FlightDto {
    private String from;
    private String to;
    private LocalDate departDate;
}
