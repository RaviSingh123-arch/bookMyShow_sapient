package com.sapient.bookMyShow.controller;

import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import com.sapient.bookMyShow.entity.response.SearchMovieShowResponse;
import com.sapient.bookMyShow.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bms-search")
public class SearchController {

    @Autowired
    SearchService searchService;

    @PostMapping(value = "/bms-movie-show", produces = MediaType.APPLICATION_JSON_VALUE)
    public SearchMovieShowResponse getBMSShowDetails(SearchMovieShowRequest searchMovieShowRequest) {
        return new SearchMovieShowResponse(searchService.getBMSShowDetails(searchMovieShowRequest));
    }
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getBMSShowDetailsTest(SearchMovieShowRequest searchMovieShowRequest) {
        return "Success";
    }
}
