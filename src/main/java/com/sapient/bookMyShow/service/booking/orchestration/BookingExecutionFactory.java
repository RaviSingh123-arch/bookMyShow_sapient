package com.sapient.bookMyShow.service.booking.orchestration;

import com.sapient.bookMyShow.entity.BookingChannel;


public interface BookingExecutionFactory {

    BookingExecutor getExecutor(BookingChannel channel);
}
