package com.company;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 1",
            "5, 10, 2, 2",
            "-5, -10, -2, -10",
            "0, 0, 0, 0",
            "1, 1, 1, 1"
    })
    void testMin(int a, int b, int c, int expected) {
        int[] arr = {a, b, c};

        int actual = Min.findMin(arr);
        assertEquals(expected, actual);
    }
}

