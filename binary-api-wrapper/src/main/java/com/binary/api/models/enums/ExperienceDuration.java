package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum ExperienceDuration {

    ZERO_TO_ONE_YEAR("0-1 year"),
    ONE_TO_TWO_YEARS("1-2 years"),
    OVER_THREE_YEARS("Over 3 years");

    private final String _value;

    ExperienceDuration(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
