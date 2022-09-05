package com.sapient.bookMyShow.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@AllArgsConstructor
@Getter
@Entity
@Transactional
public class SeatLock {

    @Id
    @GeneratedValue
    private String seatLockId;
    @OneToOne
    private Seat seat;
    @OneToOne
    private Show show;
    private Integer timeoutInSeconds;
    private LocalDateTime lockTime;

    public SeatLock(Seat seat, Show show, Integer timeoutInSeconds, LocalDateTime now) {
        this.seat = seat;
        this.show = show;
        this.timeoutInSeconds = timeoutInSeconds;
        this.lockTime = LocalDateTime.now();
    }

    public boolean isLockExpired() {
        final Instant lockInstant = lockTime.toInstant(ZoneOffset.UTC).plusSeconds(timeoutInSeconds);
        final Instant currentInstant = new Date().toInstant();
        return lockInstant.isBefore(currentInstant);
    }
}
