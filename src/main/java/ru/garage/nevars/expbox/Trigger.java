package ru.garage.nevars.expbox;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Trigger {

    @Id
    private Long id;

    private String symbol;

    private String provider;

    private String tier;

    private BigDecimal percentageTreshold;

    @ManyToOne
    private TriggerGroup group;
}
