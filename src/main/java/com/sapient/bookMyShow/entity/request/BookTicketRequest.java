package com.sapient.bookMyShow.entity.request;

import com.sapient.bookMyShow.entity.Theatre;
import lombok.Data;

import java.util.List;

@Data
public class BookTicketRequest {


    private Theatre theatre;
    private String showId;
    private String screenId;
    private List<String> seatIds;
    private String userId;

}
