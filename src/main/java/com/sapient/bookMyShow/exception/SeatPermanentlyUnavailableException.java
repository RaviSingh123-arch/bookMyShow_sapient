package com.sapient.bookMyShow.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.OK, reason = "Selected Seats are not available now.")
public class SeatPermanentlyUnavailableException extends Exception {

}
