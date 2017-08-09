package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/9/2017
 */
public enum Scopes {
    READ("read"),
    TRADE("trade"),
    PAYMENTS("payments"),
    ADMIN("admin");

    private final String value;

    Scopes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
