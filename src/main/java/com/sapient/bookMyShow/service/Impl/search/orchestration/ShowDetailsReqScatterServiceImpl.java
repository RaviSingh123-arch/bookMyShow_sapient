package com.sapient.bookMyShow.service.Impl.search.orchestration;

import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;


public class ShowDetailsReqScatterServiceImpl implements Callable<List<Show>> {


	private String url;
	private SearchMovieShowRequest searchMovieShowRequest = null;


	public ShowDetailsReqScatterServiceImpl(String url, SearchMovieShowRequest searchMovieShowRequest) {
		this.url = url;
		this.searchMovieShowRequest = searchMovieShowRequest;
	}

	public List<Show> call() throws Exception {

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		RestTemplate restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();        
		//Add the Jackson Message converter
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

		// Note: here we are making this converter to process any kind of response, 
		// not only application/*json, which is the default behaviour
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters); 

		/*
		 * HttpEntity<Object> entity = new HttpEntity<Object>(headers);
		 */
		HttpEntity<SearchMovieShowRequest> requestEntity = new HttpEntity<>(searchMovieShowRequest);
		ResponseEntity<Show[]> response = restTemplate.exchange(
				url, HttpMethod.POST, requestEntity, Show[].class);
		return Arrays.asList(response.getBody());
	}
}
