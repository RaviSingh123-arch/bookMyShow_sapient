package com.sapient.bookMyShow.service.Impl.booking.orchestration;

import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;
import com.sapient.bookMyShow.service.booking.orchestration.BookingExecutionFactory;
import com.sapient.bookMyShow.service.booking.orchestration.BookingExecutor;
import com.sapient.bookMyShow.service.booking.orchestration.BookingOrchestratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingOrchestratorServiceImpl implements BookingOrchestratorService {

    @Autowired
    BookingExecutionFactory bookingExecutionFactory;

    @Override
    public BookTicketResponse bookTicketsForShow(BookTicketRequest bookTicketRequest) {
        BookingExecutor bookingExecutor = bookingExecutionFactory.getExecutor(bookTicketRequest.getTheatre().getChannel());
        BookTicketResponse bookTicketResponse = bookingExecutor.executeBooking(bookTicketRequest);
        //Todo update BMS Audit Table to save Booking MetaData
        return bookTicketResponse;
    }
}
