package ru.relex.miniBooking.services.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserValidationErrors {

    private UserValidationErrors ( ) {
    }

    public static final String EMAIL_HAS_INVALID_FORMAT = "EMAIL_HAS_INVALID_FORMAT";
    public static final String LAST_NAME_LENGTH_IS_INVALID = "LAST_NAME_LENGTH_IS_INVALID";
    public static final String FIRST_NAME_LENGTH_IS_INVALID = "FIRST_NAME_LENGTH_IS_INVALID";
    private static final String PERSONAL_INFO_MUST_BE_SET = "PERSONAL_INFO_MUST_BE_SET";
    public static final String ROLE_MUST_BE_SET = "ROLE_MUST_BE_SET";
    public static final String LOCATION_DESCRIPTION_IS_INVALID = "LOCATION_DESCRIPTION_IS_INVALID";

    private static final Map<String, String> ERRORS =new HashMap<> ( ) {
        {
                     put ( ROLE_MUST_BE_SET, "Role must be set" );
                    put ( PERSONAL_INFO_MUST_BE_SET, "Personal info must be set" );
                    put ( FIRST_NAME_LENGTH_IS_INVALID, "Invalid first name length" );
                    put ( LAST_NAME_LENGTH_IS_INVALID, "Invalid last name length" );
                    put ( EMAIL_HAS_INVALID_FORMAT, "Email should be of pattern ****@**.**" );
                    put ( LOCATION_DESCRIPTION_IS_INVALID, "Chek tour location description" );
        }};


    public static String getMessageByCode ( String code ) {
        return ERRORS.get ( code );
    }

}
