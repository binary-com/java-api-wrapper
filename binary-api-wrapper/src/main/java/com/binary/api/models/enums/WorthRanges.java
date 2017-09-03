package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum WorthRanges {

    LESS_THAN_ONE_HUNDRED("Less than $100,000"),
    ONE_HUNDRED_TO_TWO_HUNDRED_FIFTY("$100,000 - $250,000"),
    TWO_HUNDRED_FIFTY_TO_FIVE_HUNDRED("$250,001 - $500,000"),
    FIVE_HUNDRED_TO_ONE_MILLION("$500,001 - $1,000,000"),
    OVER_ONE_MILLION("Over $1,000,000");

    private final String _value;

    WorthRanges(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }

}
