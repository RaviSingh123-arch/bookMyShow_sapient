package com.sapient.bookMyShow.service.Impl.search.orchestration;

import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import com.sapient.bookMyShow.entity.response.SearchMovieShowResponse;
import com.sapient.bookMyShow.service.search.orchestration.SearchOrchestratorService;
import com.sapient.bookMyShow.service.search.orchestration.ShowDetailsGatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@Service
public class SearchOrchestratorServiceImpl implements SearchOrchestratorService {

    @Autowired
    ShowDetailsGatherService showDetailsGatherService;


    @Override
    public SearchMovieShowResponse getShowDetails(SearchMovieShowRequest searchMovieShowRequest) throws ExecutionException, InterruptedException {
        List<Show> shows = showDetailsGatherService.getShowDetails(searchMovieShowRequest);
        return SearchMovieShowResponse.builder().shows(shows).build();
    }


}
