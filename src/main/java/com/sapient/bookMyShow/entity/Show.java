package com.sapient.bookMyShow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
@Setter
@Getter
@Entity
@Transactional
public class Show {

    @Id
    @GeneratedValue
    private final String id;
    @ManyToOne
    private final Movie movie;
    @OneToOne
    private final Screen screen;
    private final LocalDateTime startTime;
    private transient List<Seat> availableSeats;
    private final Long durationInSeconds;
    @Enumerated(EnumType.STRING)
    private final City city;


}
