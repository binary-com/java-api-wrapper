package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum IncomeSources {

    SALARIED_EMPLOYEE("Salaried Employee"),
    SELF_EMPLOYED("Self-Employed"),
    INVESTMENTS_AND_DIVIDENDS("Investments & Dividends"),
    PENSION("Pension"),
    OTHER("Other");

    private final String _value;

    IncomeSources(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
