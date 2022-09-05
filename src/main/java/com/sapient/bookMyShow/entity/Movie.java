package com.sapient.bookMyShow.entity;

import lombok.Builder;
import lombok.Data;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@Entity
@Transactional
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private final String name;
    @Enumerated(EnumType.STRING)
    private final Language language;
    @Enumerated(EnumType.STRING)
    private final Genre genre;
    private final long durationInSeconds;
    @OneToMany(mappedBy = "movie")
    private final List<Show> shows;


}
