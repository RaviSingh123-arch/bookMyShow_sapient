package com.sapient.bookMyShow.service.Impl.booking.orchestration;

import com.sapient.bookMyShow.entity.request.BookTicketRequest;
import com.sapient.bookMyShow.entity.response.BookTicketResponse;
import com.sapient.bookMyShow.entity.BookingChannelType;
import com.sapient.bookMyShow.service.booking.orchestration.BookingExecutor;
import org.springframework.stereotype.Component;

@Component(BookingChannelType.PVR)
public class PVRBookingExecutor implements BookingExecutor {

    @Override
    public BookTicketResponse executeBooking(BookTicketRequest bookTicketRequest) {

        //call PVR API to make a Booking
        return null;
    }
}
