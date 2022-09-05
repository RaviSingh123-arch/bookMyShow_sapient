package com.sapient.bookMyShow.service.Impl;

import com.sapient.bookMyShow.entity.*;
import com.sapient.bookMyShow.repository.BookingRepository;
import com.sapient.bookMyShow.repository.SeatRepository;
import com.sapient.bookMyShow.repository.ShowRepository;
import com.sapient.bookMyShow.repository.UserRepository;
import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;
import com.sapient.bookMyShow.exception.SeatPermanentlyUnavailableException;
import com.sapient.bookMyShow.exception.SeatTemporaryUnavailableException;
import com.sapient.bookMyShow.service.BMSBookingService;
import com.sapient.bookMyShow.service.SeatLockProvider;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BMSBookingServiceImpl implements BMSBookingService {

    @Autowired
    SeatLockProvider seatLockProvider;
    @Autowired
    ShowRepository showRepository;
    @Autowired
    SeatRepository seatRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public BookTicketResponse bookTicketsForShow(BookTicketRequest bookTicketRequest) throws SeatPermanentlyUnavailableException, SeatTemporaryUnavailableException {
        Optional<Show> show = showRepository.findById(bookTicketRequest.getShowId());
        Optional<User> user = userRepository.findById(bookTicketRequest.getUserId());
        List<Seat> seats = seatRepository.findAllById(bookTicketRequest.getSeatIds());
        if (isAnySeatAlreadyBooked(show.get(), seats)) {
            throw new SeatPermanentlyUnavailableException();
        }
        seatLockProvider.lockSeats(show.get(),seats , user.get());
        final Booking newBooking = Booking.builder().bookingStatus(BookingStatus.Created).seats(seats)
                .show(show.get()).user(user.get()).build();
        bookingRepository.save(newBooking);
        return BookTicketResponse.builder().bookingDetails(newBooking).build();
        // TODO: Create timer for booking expiry
    }



    private boolean isAnySeatAlreadyBooked(final Show show, final List<Seat> seats) {
        final List<Seat> bookedSeats = getBookedSeats(show);
        for (Seat seat : seats) {
            if (bookedSeats.contains(seat)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Seat> getBookedSeats(@NonNull final Show show) {
        return getAllBookings(show).stream()
                .filter(Booking::isConfirmed)
                .map(Booking::getSeats)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    @Override
    public List<Booking> getAllBookings(@NonNull final Show show) {
        return bookingRepository.findAllByShowId(show.getId());
        }
}
