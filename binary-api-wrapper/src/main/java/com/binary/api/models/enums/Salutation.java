package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/31/2017
 */
public enum Salutation {
    MR("Mr"),
    MRS("Mrs"),
    MS("Ms"),
    MISS("Miss");

    private final String _value;

    Salutation(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }

}
