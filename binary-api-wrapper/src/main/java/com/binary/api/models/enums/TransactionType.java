package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/7/2017
 */
public enum TransactionType {
    BUY("buy"),
    SELL("sell"),
    DEPOSIT("deposit"),
    WITHDRAWAL("withdrawal");

    private final String value;

    TransactionType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
