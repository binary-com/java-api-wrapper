package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public enum DurationUnits {
    DAYS("d"),
    HOURS("h"),
    MINUTES("m"),
    SECONDS("s"),
    TICKS("t");

    private final String value;

    DurationUnits(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
