package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public enum JPAnnualIncomes {
    LESS_THAN_1_MILLION_JPY("Less than 1 million JPY"),
    ONE_TO_THREE_MILLION_JPY("1-3 million JPY"),
    THREE_TO_FIVE_MILLION_JPY("3-5 million JPY"),
    FIVE_TO_TEN_MILLION_JPY("5-10 million JPY"),
    TEN_TO_THIRTY_MILLION_JPY("10-30 million JPY"),
    THIRTY_TO_FIFTY_MILLION_JPY("30-50 million JPY"),
    FIFTY_TO_HUNDRED_MILLION_JPY("50-100 million JPY"),
    OVER_HUNDRED_MILLION_JPY("Over 100 million JPY");

    private final String _value;

    JPAnnualIncomes(String value) {
        this._value = value;
    }

    public String toString() {
        return this._value;
    }

}
