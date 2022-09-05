package com.sapient.bookMyShow.controller;

import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;
import com.sapient.bookMyShow.service.booking.orchestration.BookingOrchestratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("bookings")
public class BookingOrchestrationController {

    @Autowired
    private BookingOrchestratorService bookingOrchestratorService;

    @PostMapping("/book-tickets")
    public BookTicketResponse bookTicketsForShow(@Valid BookTicketRequest bookTicketRequest) {
        return bookingOrchestratorService.bookTicketsForShow(bookTicketRequest);
    }
}
