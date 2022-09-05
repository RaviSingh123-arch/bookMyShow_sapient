package com.sapient.bookMyShow.entity;

import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Data
@Entity
@Transactional
public class TheatreLocation {

    @Id @GeneratedValue
    private String id;
    @Enumerated(EnumType.STRING)
    private City city;
    @Enumerated(EnumType.STRING)
    private Country ctry;
}
