package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum  EmploymentIndustries {

    CONSTRUCTION("Construction"),
    EDUCATION("Education"),
    FINANCE("Finance"),
    HEALTH("Health"),
    TOURISM("Tourism"),
    OTHER("Other");

    private final String _value;

    EmploymentIndustries(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
