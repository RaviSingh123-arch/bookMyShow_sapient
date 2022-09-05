package com.sapient.bookMyShow.entity;

import lombok.Getter;
import lombok.NonNull;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Transactional
public class Theatre {

    @Id
    @GeneratedValue
    private final String id;
    private final String name;
    @OneToMany(mappedBy = "theatre")
    private final List<Screen> screens;
    @OneToOne
    private final TheatreLocation theatreLocation;
    @Enumerated(EnumType.STRING)
    private final BookingChannel channel;

    public Theatre(@NonNull final String id, @NonNull final String name, @NonNull TheatreLocation theatreLocation, @NonNull BookingChannel bookingChannel) {
        this.id = id;
        this.name = name;
        this.screens = new ArrayList<>();
        this.theatreLocation = theatreLocation;
        this.channel = bookingChannel;
    }
}
