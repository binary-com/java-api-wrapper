package com.binary.api.models.enums;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/30/2017
 */
public enum TestResult {
    PASS("pass"),
    FAIL("fail");

    private final String _value;

    TestResult(String value) {
        _value = value;
    }

    @Override
    public String toString() {
        return this._value;
    }
}
