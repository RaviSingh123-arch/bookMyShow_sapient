package com.sapient.bookMyShow.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Entity
@Transactional
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @OneToOne
    private Show show;
    @OneToMany
    private List<Seat> seats;
    @OneToOne
    private UserDetails userDetails;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    @OneToMany
    private List<Transaction> transactions;
    @UpdateTimestamp
    private LocalDateTime updatedDate;
    @CreationTimestamp
    private LocalDateTime createdDate;




    public boolean isConfirmed() {
        return this.bookingStatus == BookingStatus.Confirmed;
    }
}
