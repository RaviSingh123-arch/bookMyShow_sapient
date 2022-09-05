package com.sapient.bookMyShow.controller;

import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import com.sapient.bookMyShow.entity.response.SearchMovieShowResponse;
import com.sapient.bookMyShow.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bms-search")
public class SearchController {

    @Autowired
    SearchService searchService;

    @PostMapping(value = "/bms-movie-show")
    public SearchMovieShowResponse getBMSShowDetails(SearchMovieShowRequest searchMovieShowRequest) {
        return new SearchMovieShowResponse(searchService.getBMSShowDetails(searchMovieShowRequest));
    }
}
