package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum TradeFrequency {

    ZERO_TO_FIVE_TRANSACTIONS("0-5 transactions in the past 12 months"),
    SIX_TO_TEN_TRANSACTIONS("6-10 transactions in the past 12 months"),
    OVER_FORTY_TRANSACTIONS("40 transactions or more in the past 12 months");

    private final String _value;

    TradeFrequency(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
