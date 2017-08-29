package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public enum JPOccupations {
    OFFICE_WORKER("Office worker"),
    DIRECTOR("Director"),
    PUBLIC_WORKER("Public worker"),
    SELF_EMPLOYED("Self-employed"),
    HOUSEWIFE_HOUSEHUSBAND("Housewife / Househusband"),
    CONTRACT_TEMPORARY_PART_TIME("Contract / Temporary / Part Time"),
    STUDENT("Student"),
    UNEMPLOYED("Unemployed"),
    OTHERS("Others");

    private final String _value;

    JPOccupations(String _value) {
        this._value = _value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
