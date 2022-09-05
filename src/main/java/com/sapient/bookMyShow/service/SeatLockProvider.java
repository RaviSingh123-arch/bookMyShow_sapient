package com.sapient.bookMyShow.service;

import com.sapient.bookMyShow.entity.Seat;
import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.User;
import com.sapient.bookMyShow.exception.SeatTemporaryUnavailableException;

import java.util.List;

public interface SeatLockProvider {

    public void lockSeats(Show show, List<Seat> seats,
                          User user) throws SeatTemporaryUnavailableException;
    void unlockSeats(Show show, List<Seat> seats,
                     User user);
    boolean validateLock(Show show, Seat seat,
                         User user);

    List<Seat> getLockedSeats(Show show);
}
