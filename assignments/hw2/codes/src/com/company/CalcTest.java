package com.company;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalcTest {

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 },
                { 1, 2, 3 },
                { 2, 1, 3 },
                { -1, 2, 1 },
                { 2, -1, 1 },
                { -1, -2, -3 }
        });
    }

    private int a;
    private int b;
    private int expectedResult;

    public CalcTest(int a, int b, int expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testAdd() {
        int result = Calc.add(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int result = Calc.subtract(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int result = Calc.multiply(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        double result = Calc.divide(a, b);
        assertEquals(expectedResult, result, 0.001);
    }

    static private int applyOperation (int a, int b, IntBinaryOperator op) {
        return op.applyAsInt(a, b);
    }
}
