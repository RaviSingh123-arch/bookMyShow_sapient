package com.sapient.bookMyShow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@Transactional
public class Seat {

    @Id
    private final String id;
    private final int rowNo;
    private final int seatNo;
    @ManyToOne(fetch = FetchType.LAZY)
    private Screen screen;
    @Enumerated(EnumType.STRING)
    private OccupancyStatus status;

}
