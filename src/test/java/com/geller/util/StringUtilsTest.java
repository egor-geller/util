package com.geller.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberTest() {
        List<String> numbers = List.of("1", "0.3", "-5", "d5", "-9l");
        StringUtils stringUtils = new StringUtils();

        Assertions.assertAll(() -> assertTrue(stringUtils.isPositiveNumber(numbers.get(0))),
                () -> assertTrue(stringUtils.isPositiveNumber(numbers.get(1))),
                () -> assertFalse(stringUtils.isPositiveNumber(numbers.get(2))),
                () -> assertFalse(stringUtils.isPositiveNumber(numbers.get(3))),
                () -> assertFalse(stringUtils.isPositiveNumber(numbers.get(4)))
        );
    }
}
