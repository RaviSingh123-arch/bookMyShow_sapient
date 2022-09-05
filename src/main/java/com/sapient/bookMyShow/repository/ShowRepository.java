package com.sapient.bookMyShow.repository;

import com.sapient.bookMyShow.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface ShowRepository  extends JpaRepository<Show, String> {

    @Query(nativeQuery = true, value = "Select * from Show where city = ?, movieId = ?, startTime = ?" )
    List<Show> findByCityMovieIdAndStartTime(String city, String movieId, LocalDateTime showDate);
}
