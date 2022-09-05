package com.sapient.bookMyShow.service.search.orchestration;

import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import com.sapient.bookMyShow.entity.response.SearchMovieShowResponse;

import java.util.concurrent.ExecutionException;

public interface SearchOrchestratorService {

    public SearchMovieShowResponse getShowDetails(SearchMovieShowRequest searchMovieShowRequest) throws ExecutionException, InterruptedException;
}
