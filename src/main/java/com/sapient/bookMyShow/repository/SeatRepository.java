package com.sapient.bookMyShow.repository;

import com.sapient.bookMyShow.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository  extends JpaRepository<Seat, String> {


}
