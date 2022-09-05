package com.sapient.bookMyShow.service;

import com.sapient.bookMyShow.entity.Booking;
import com.sapient.bookMyShow.entity.Seat;
import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;
import com.sapient.bookMyShow.exception.SeatPermanentlyUnavailableException;
import com.sapient.bookMyShow.exception.SeatTemporaryUnavailableException;
import lombok.NonNull;

import java.util.List;

public interface BMSBookingService {

    public BookTicketResponse bookTicketsForShow(BookTicketRequest bookTicketRequest) throws SeatPermanentlyUnavailableException, SeatTemporaryUnavailableException;
    public List<Seat> getBookedSeats(@NonNull final Show show);
    public List<Booking> getAllBookings(@NonNull final Show show);
}
