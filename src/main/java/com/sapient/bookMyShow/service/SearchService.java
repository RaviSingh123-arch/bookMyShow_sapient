package com.sapient.bookMyShow.service;

import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;

import java.util.List;

public interface SearchService {

    public List<Show> getBMSShowDetails(SearchMovieShowRequest searchMovieShowRequest);
}
