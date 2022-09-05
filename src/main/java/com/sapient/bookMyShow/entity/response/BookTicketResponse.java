package com.sapient.bookMyShow.entity.response;

import com.sapient.bookMyShow.entity.Booking;
import com.sapient.bookMyShow.entity.BookingStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookTicketResponse {

    private Booking bookingDetails;
    private BookingStatus bookingStatus;

}
