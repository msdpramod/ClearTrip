package org.commerceproject.cleartrip.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter @Setter@NoArgsConstructor
@AllArgsConstructor@Entity
public class Flight_ClearTrip extends BaseModel {
    private String number;
    private String airline;
    private String from;
    private String to;
    private LocalDate departDate;
    private LocalTime departTime;

    @OneToMany(mappedBy = "flight")
    private List<Fare> fares;
}

