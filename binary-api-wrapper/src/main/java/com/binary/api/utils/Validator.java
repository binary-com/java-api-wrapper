package com.binary.api.utils;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/1/2017
 */
public class Validator {
    public static void checkPattern(String pattern, String value, String message) {
        if (!value.matches(pattern)) {
            throw new IllegalArgumentException(message);
        }
    }
}
