package org.commerceproject.cleartrip.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity@Setter @Getter
public class Ticket extends BaseModel {


    @ManyToOne
    private User user;

    @ManyToOne
    private Flight_ClearTrip flight;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private List<Seat> seats = new ArrayList<>();

    private Double amount;

    private LocalDateTime bookingTime;
}
