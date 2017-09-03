package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum TurnoverRanges {

    LESS_THAN_TWENTY_FIVE("Less than $25,000"),
    TWENTY_FIVE_TO_FIFTY("$25,000 - $50,000"),
    FIFTY_TO_ONE_HUNDRED("$50,001 - $100,000"),
    ONE_HUNDRED_TO_FIVE_HUNDRED("$100,001 - $500,000"),
    OVER_FIVE_HUNDRED("Over $500,000");

    private final String _value;

    TurnoverRanges(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
