package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public enum JPTradingExperiences {
    NO_EXPERIENCE("No experience"),
    LESS_THAN_SIX_MONTHS("Less than 6 months"),
    SIX_MONTHS_TO_ONE_YEAR("6 months to 1 year"),
    ONE_TO_THREE_YEARS("1-3 years"),
    THREE_TO_FIVE_YEARS("3-5 years"),
    OVER_FIVE_YEARS("Over 5 years");

    private final String _value;

    JPTradingExperiences(String _value) {
        this._value = _value;
    }

    public String toString() {
        return this._value;
    }
}
