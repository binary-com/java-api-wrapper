package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/2/2017
 */
public enum BasisTypes {
    PAYOUT("payout"),
    STAKE("stake");

    private final String value;

    BasisTypes(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
