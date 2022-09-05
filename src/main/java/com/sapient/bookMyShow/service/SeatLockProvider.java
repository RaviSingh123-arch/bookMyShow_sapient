package com.sapient.bookMyShow.service;

import com.sapient.bookMyShow.entity.Seat;
import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.UserDetails;
import com.sapient.bookMyShow.exception.SeatTemporaryUnavailableException;

import java.util.List;

public interface SeatLockProvider {

    public void lockSeats(Show show, List<Seat> seats,
                          UserDetails userDetails) throws SeatTemporaryUnavailableException;


    List<Seat> getLockedSeats(Show show);
}
