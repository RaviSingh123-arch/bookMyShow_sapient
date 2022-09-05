package com.sapient.bookMyShow.repository;


import com.sapient.bookMyShow.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookingRepository extends JpaRepository<Booking, String> {

    public List<Booking> findAllByShowId(String showId);

}
