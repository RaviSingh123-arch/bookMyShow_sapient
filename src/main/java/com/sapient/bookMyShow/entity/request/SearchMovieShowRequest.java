package com.sapient.bookMyShow.entity.request;

import com.sapient.bookMyShow.entity.City;
import com.sapient.bookMyShow.entity.Country;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SearchMovieShowRequest {

    private Country country;
    private City city;
    private String movieId;
    private LocalDateTime showDate;
}
