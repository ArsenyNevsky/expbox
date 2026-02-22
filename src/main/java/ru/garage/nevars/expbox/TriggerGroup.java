package ru.garage.nevars.expbox;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Entity
public class TriggerGroup {

    @Id
    private Long id;

    @Column(name = "job_duration")
    private int maxJobDurationInSec;

    private String name;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;

    @OneToMany
    private List<Trigger> triggers;
}
