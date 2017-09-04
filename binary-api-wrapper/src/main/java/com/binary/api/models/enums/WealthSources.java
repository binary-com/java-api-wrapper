package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 9/3/2017
 */
public enum WealthSources {

    ACCUMULATION_INCOME_SAVINGS("Accumulation of Income/Savings"),
    CASH_BUSINESS("Cash Business"),
    COMPANY_OWNERSHIP("Company Ownership"),
    DIVORCE_SETTLEMENT("Divorce Settlement"),
    INHERITANCE("Inheritance"),
    INVESTMENT_INCOME("Investment Income"),
    SALE_PROPERTY("Sale of Property"),
    OTHER("Other");

    private final String _value;

    WealthSources(String value) {
        this._value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
