package com.sapient.bookMyShow.service.booking.orchestration;

import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;

public interface BookingOrchestratorService {

    public BookTicketResponse bookTicketsForShow(BookTicketRequest bookTicketRequest);
}
