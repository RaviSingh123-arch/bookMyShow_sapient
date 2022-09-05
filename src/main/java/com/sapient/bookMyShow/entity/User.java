package com.sapient.bookMyShow.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
@Entity
@Transactional
public class User {

    @Id
    private String id;
    private String userName;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Booking> bookingHistory;

}
