package ru.relex.miniBooking.services.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HotelValidationErrors {

    private HotelValidationErrors ( ) {
    }


    public static final String AMENITIES_SIZE_IS_INVALID = "AMENITIES_SIZE_IS_INVALID";
    public static final String ROOMS_SIZE_IS_INVALID = "ROOMS_SIZE_IS_INVALID";
    public static final String LOCATION_DESCRIPTION_IS_INVALID = "LOCATION_DESCRIPTION_IS_INVALID";
    public static final String HOTEL_NAME_IS_INVALID = "HOTEL_NAME_IS_INVALID";
    private static final Map<String, String> ERRORS = new HashMap<String, String> ( ) {
        {
                    put ( AMENITIES_SIZE_IS_INVALID, "Too few amenities, should be at least 3" );
                    put ( LOCATION_DESCRIPTION_IS_INVALID, "Check hotel's location description" );
                    put ( HOTEL_NAME_IS_INVALID, "NewHotel name should be at least 4 letters" );
                    put ( ROOMS_SIZE_IS_INVALID, "NewHotel should have at least 1 room" );
        }
    };

    public static String getMessageByCode ( String code ) {
        return ERRORS.get ( code );
    }
}
