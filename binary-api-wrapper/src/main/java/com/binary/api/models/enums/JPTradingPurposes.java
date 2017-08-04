package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public enum JPTradingPurposes {
    SHORT_TERM_PROFITS("Targeting short-term profits"),
    MEDIUM_TERM_LONG_TERM_PROFITS("Targeting medium-term / long-term profits"),
    BOTH("Both the above"),
    HEDGING("Hedging");

    private final String _value;

    JPTradingPurposes(String _value) {
        this._value = _value;
    }

    public String toString() {
        return this._value;
    }
}
