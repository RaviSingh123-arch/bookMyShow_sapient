package com.sapient.bookMyShow.service.booking.orchestration;

import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;

public interface BookingExecutor {

    public BookTicketResponse executeBooking (BookTicketRequest bookTicketRequest);
}
