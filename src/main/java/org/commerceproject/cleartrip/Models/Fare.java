package org.commerceproject.cleartrip.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor@Entity
public class Fare extends BaseModel {
    private FareType type;
    private Long price;

    @OneToMany(mappedBy = "fare")
    private List<Seat> seats;

}
