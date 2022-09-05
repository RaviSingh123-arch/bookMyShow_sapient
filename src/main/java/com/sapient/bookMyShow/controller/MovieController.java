package com.sapient.bookMyShow.controller;

import com.sapient.bookMyShow.entity.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping(value = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value= HttpStatus.OK)
    public Movie getMovieDetails(@Valid @RequestParam String movieId) {
        return null;
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value= HttpStatus.OK)
    public Movie getMovies() {
        return null;
    }

    @GetMapping(value = "/genres", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value= HttpStatus.OK)
    public Movie getMovieListByGenres(@Valid @RequestParam String movieId) {
        return null;
    }

    @GetMapping(value = "/trending", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value= HttpStatus.OK)
    public List<Movie> getMovieListByTrend(@Valid @RequestParam String movieId) {
        return null;
    }


}
