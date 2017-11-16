package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public enum CashierTypes {
    DEPOSIT("deposit"),
    WITHDRAW("withdraw");

    private final String _value;

    CashierTypes(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
