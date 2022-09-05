package com.sapient.bookMyShow.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.OK, reason = "Selected Seats are temporarily not available now. please check again after some time.")
public class SeatTemporaryUnavailableException extends Exception {
}
