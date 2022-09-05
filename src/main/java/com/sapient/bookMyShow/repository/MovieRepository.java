package com.sapient.bookMyShow.repository;

import com.sapient.bookMyShow.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<Movie, String> {

}
