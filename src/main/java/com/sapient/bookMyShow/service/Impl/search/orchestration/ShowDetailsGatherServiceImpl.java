package com.sapient.bookMyShow.service.Impl.search.orchestration;

import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import com.sapient.bookMyShow.service.search.orchestration.ShowDetailsGatherService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.*;
@Service
public class ShowDetailsGatherServiceImpl implements ShowDetailsGatherService {
	ExecutorService threadPool = Executors.newFixedThreadPool(4);
	Future<List<Show>> taskfuture1,  taskfuture2, taskfuture3 = null;

	@Override
	public List<Show> getShowDetails(SearchMovieShowRequest searchMovieShowRequest) throws InterruptedException,
			ExecutionException {
		List<Show> shows = Collections
				.synchronizedList(new ArrayList<Show>());
		//Todo Get url from applicatio properties bsed on environment
		/*taskfuture1 = threadPool.submit(new ShowDetailsReqScatterServiceImpl(
				"http://localhost:8080/pvr-search/", searchMovieShowRequest));*/
		/*taskfuture2 = threadPool.submit(new ShowDetailsReqScatterServiceImpl(
				"http://localhost:8080/inox-search/", searchMovieShowRequest));*/
		//this is our microservices for Theatres which are managed by our Application
		taskfuture3 = threadPool.submit(new ShowDetailsReqScatterServiceImpl(
				"http://localhost:8080/bms-search/bms-movie-show", searchMovieShowRequest));

		threadPool.awaitTermination(5, TimeUnit.SECONDS);
		if (taskfuture1.isDone()) {
			shows.addAll(taskfuture1.get());
		}
		/*if (taskfuture2.isDone()) {
			shows.addAll(taskfuture2.get());
		}
		if (taskfuture3.isDone()) {
			shows.addAll(taskfuture3.get());
		}*/

		threadPool.shutdownNow();
		return shows;
	}
}
