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
public class UserDetails {

    @Id
    @GeneratedValue
    private String id;
    private String userName;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetails")
    private List<Booking> bookingHistory;

}
