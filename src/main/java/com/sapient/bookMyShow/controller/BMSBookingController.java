package com.sapient.bookMyShow.controller;

import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;
import com.sapient.bookMyShow.exception.SeatPermanentlyUnavailableException;
import com.sapient.bookMyShow.exception.SeatTemporaryUnavailableException;
import com.sapient.bookMyShow.service.BMSBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/bms-bookings")
public class BMSBookingController {

    @Autowired
    BMSBookingService bookingService;

    @PostMapping("/bms-book-tickets")
    public BookTicketResponse bookTicketsForShow(@Valid BookTicketRequest bookTicketRequest) {
            try {
           return bookingService.bookTicketsForShow(bookTicketRequest); }
           catch (SeatTemporaryUnavailableException e) {

           }catch (SeatPermanentlyUnavailableException e) {

           }
           return null;
    }
}
