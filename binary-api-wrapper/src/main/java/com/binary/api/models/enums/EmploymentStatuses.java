package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum EmploymentStatuses {

    EMPLOYED("Employed"),
    PENSIONER("Pensioner"),
    SELF_EMPLOYED("Self-Employed"),
    STUDENT("Student"),
    UNEMPLOYED("Unemployed");

    private final String _value;

    EmploymentStatuses(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
