package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum EducationLevels {

    PRIMARY("Primary"),
    SECONDARY("Secondary"),
    TERTIARY("Tertiary");

    private final String _value;

    EducationLevels(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }

}
