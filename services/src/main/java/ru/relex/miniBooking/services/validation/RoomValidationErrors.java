package ru.relex.miniBooking.services.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RoomValidationErrors {

    private RoomValidationErrors ( ) {
    }

    public static final String HOTELID_IS_INVALID = "HOTELID_IS_INVALID";
    public static final String NUBEROFBEDS_IS_INVALID = "NUBEROFBEDS_IS_INVALID";
    public static final String DESCRIPTION_IS_INVALID = "DESCRIPTION_IS_INVALID";
    public static final String DAILYPRICE_IS_INVALID = "DAILYPRICE_IS_INVALID";
    private static final Map<String, String> ERRORS = new HashMap<> ( ) {
        {
                    put ( HOTELID_IS_INVALID, "Hotel with such id does not exist" );
                    put ( NUBEROFBEDS_IS_INVALID, "Minimum number of beds - 1" );
                    put ( DESCRIPTION_IS_INVALID,
                            "The minimum description length is 30 characters, the maximum is 500 characters" );
                    put ( DAILYPRICE_IS_INVALID, "Minimum daily price - 1" );
        }
    };

    public static String getMessageByCode ( String code ) {
        return ERRORS.get ( code );
    }
}
