package com.sapient.bookMyShow.service.Impl;

import com.sapient.bookMyShow.entity.OccupancyStatus;
import com.sapient.bookMyShow.entity.Seat;
import com.sapient.bookMyShow.entity.Show;
import com.sapient.bookMyShow.entity.request.SearchMovieShowRequest;
import com.sapient.bookMyShow.repository.ScreenRepository;
import com.sapient.bookMyShow.repository.ShowRepository;
import com.sapient.bookMyShow.service.BMSBookingService;
import com.sapient.bookMyShow.service.SearchService;
import com.sapient.bookMyShow.service.SeatLockProvider;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private BMSBookingService bmsBookingService;

    @Autowired
    private SeatLockProvider seatLockProvider;

    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private ScreenRepository screenRepository;

    @Override
    public List<Show> getBMSShowDetails(SearchMovieShowRequest searchMovieShowRequest) {

        List<Show> shows = showRepository.findByCityMovieIdAndStartTime(searchMovieShowRequest.getCity().name(), searchMovieShowRequest.getMovieId()
                ,searchMovieShowRequest.getShowDate());

        shows.stream().forEach(s -> s.setAvailableSeats(getAvailableSeats(s)));
        return shows;
    }

    public List<Seat> getAvailableSeats(@NonNull final Show show) {

        final List<Seat> allSeats = show.getScreen().getSeats();
        final List<Seat> unavailableSeats = getUnavailableSeats(show);
        allSeats.stream().forEach(seat -> seat.setStatus(unavailableSeats.contains(seat)?OccupancyStatus.NOTAVAILABLE
                :OccupancyStatus.AVAILABLE));
        return allSeats;
    }

    private List<Seat> getUnavailableSeats(@NonNull final Show show) {
        final List<Seat> unavailableSeats = bmsBookingService.getBookedSeats(show);
        unavailableSeats.addAll(seatLockProvider.getLockedSeats(show));
        return unavailableSeats;
    }
}
