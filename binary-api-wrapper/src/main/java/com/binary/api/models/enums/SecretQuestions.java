package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum SecretQuestions {
    MOTHER_MAIDEN_NAME("Mother's maiden name"),
    NAME_OF_PET("Name of your pet"),
    NAME_OF_LOVE("Name of first love"),
    MEMORABLE_CITY("Memorable town/city"),
    MEMORABLE_DATE("Memorable date"),
    FAVOURITE_DISH("Favourite dish"),
    BRAND_OF_CAR("Brand of first car"),
    FAVOURITE_ARTIST("Favourite artist");

    private final String _value;

    SecretQuestions(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
