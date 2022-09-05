package com.sapient.bookMyShow.entity;

import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Transactional
public class Screen {

    @Id
    @GeneratedValue
    private final String id;
    private final String name;
    @OneToMany(mappedBy = "screen")
    private final List<Seat> seats;
    @ManyToOne
    private final Theatre theatre;



    public Screen(@NonNull final String id, @NonNull final String name, @NonNull Theatre theatre) {
        this.id = id;
        this.name = name;
        this.theatre = theatre;
        this.seats = new ArrayList<>();
    }



}
