package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public enum CashierProviders {
    DOUGHFLOW("doughflow"),
    EPG("epg");

    private final String _value;

    CashierProviders(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
