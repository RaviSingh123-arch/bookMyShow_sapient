package com.sapient.bookMyShow.entity.response;

import com.sapient.bookMyShow.entity.Show;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SearchMovieShowResponse {

    private List<Show> shows;
}
