package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum  AccountOpeningReasons {
    SPECULATIVE("Speculative"),
    INCOME_EARNING("Income Earning"),
    HEDGING("Hedging");

    private final String _value;

    AccountOpeningReasons(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
