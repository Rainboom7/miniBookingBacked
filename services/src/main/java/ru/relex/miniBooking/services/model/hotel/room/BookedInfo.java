package ru.relex.miniBooking.services.model.hotel.room;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@JsonDeserialize
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookedInfo {
    long hotelId;
    String hotelName;
    long roomId;
    Date arrival;
    Date departure;
    int beds;
    int dailyPrice;
    String description;
}
