package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/14/2017
 */
public enum HedgeAssets {

    FOREIGN_CURRENCY_DEPOSIT("Foreign currency deposit"),
    MARGIN_FX("Margin FX"),
    OTHER("Other");

    private final String _value;

    HedgeAssets(String value){
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
