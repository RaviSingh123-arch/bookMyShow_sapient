package com.sapient.bookMyShow.service;

import com.sapient.bookMyShow.entity.Seat;
import com.sapient.bookMyShow.entity.SeatLock;
import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.UserDetails;
import com.sapient.bookMyShow.exception.SeatTemporaryUnavailableException;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class InMemorySeatLockProvider implements SeatLockProvider {

    private final Integer lockTimeout= 10;
    private final Map<Show, Map<Seat, SeatLock>> locks = new HashMap<>();



    @Override
    synchronized public void lockSeats(final Show show, final List<Seat> seats,
                                       @NonNull final UserDetails userDetails) throws SeatTemporaryUnavailableException {
        for (Seat seat : seats) {
            if (isSeatLocked(show, seat)) {
                throw new SeatTemporaryUnavailableException();
            }
        }

        for (Seat seat : seats) {
            lockSeat(show, seat, userDetails, lockTimeout);
        }
    }





    @Override
    public List<Seat> getLockedSeats(@NonNull final Show show) {
        if (!locks.containsKey(show)) {
            return Collections.emptyList();
        }
        final List<Seat> lockedSeats = new ArrayList<>();

        for (Seat seat : locks.get(show).keySet()) {
            if (isSeatLocked(show, seat)) {
                lockedSeats.add(seat);
            }
        }
        return lockedSeats;
    }

    private void unlockSeat(final Show show, final Seat seat) {
        if (!locks.containsKey(show)) {
            return;
        }
        locks.get(show).remove(seat);
    }

    private void lockSeat(final Show show, final Seat seat, final UserDetails userDetails, final Integer timeoutInSeconds) {
        if (!locks.containsKey(show)) {
            locks.put(show, new HashMap<>());
        }
        final SeatLock lock = new SeatLock(seat, show, timeoutInSeconds, LocalDateTime.now());
        locks.get(show).put(seat, lock);
    }

    private boolean isSeatLocked(final Show show, final Seat seat) {
        return locks.containsKey(show) && locks.get(show).containsKey(seat) && !locks.get(show).get(seat).isLockExpired();
    }
}
