package com.sapient.bookMyShow.controller;

import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import com.sapient.bookMyShow.entity.response.SearchMovieShowResponse;
import com.sapient.bookMyShow.service.search.orchestration.SearchOrchestratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("/search")
public class SearchOrchetrationController {

    @Autowired
    SearchOrchestratorService searchOrchestratorService;

    @PostMapping(value = "/movie-show")
    public SearchMovieShowResponse getShowDetails(@Valid SearchMovieShowRequest searchMovieShowRequest) {
        return null;
    }

}
