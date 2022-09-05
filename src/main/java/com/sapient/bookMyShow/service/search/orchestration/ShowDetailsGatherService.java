package com.sapient.bookMyShow.service.search.orchestration;

import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface ShowDetailsGatherService {

    public List<Show> getShowDetails(SearchMovieShowRequest searchMovieShowRequest) throws InterruptedException,
            ExecutionException;
}
