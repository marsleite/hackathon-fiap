package com.grupo29.hackathon.utils;


import java.util.Arrays;
import java.util.Objects;

public class FieldUtils {

    private FieldUtils() {}

    public static Boolean areFieldsNotNull(Object... fields) {
        return Arrays.stream(fields).allMatch(Objects::nonNull);
    }


}