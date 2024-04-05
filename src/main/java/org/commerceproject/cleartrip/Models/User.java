package org.commerceproject.cleartrip.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter@NoArgsConstructor
@AllArgsConstructor @Entity
public class User extends BaseModel {
    private String name;
    private Long funds;
}
