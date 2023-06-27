package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeNumbersTest {

    private PrimeNumbers primeNumbers;

    @BeforeEach
    void setUp() {
        primeNumbers = new PrimeNumbers();
    }

    @Test
    void A() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(5);

        Assertions.assertEquals("[2, 3, 5, 7, 11]", primeNumbers.toString());
    }

    @Test
    void B() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(7);

        Assertions.assertEquals("[2, 3, 5, 7, 11, 13, 17]", primeNumbers.toString());
    }

    @Test
    void C() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(7);

        Assertions.assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
    }

    @Test
    void D() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int numPrimes = 10;

        primeNumbers.computePrimes(numPrimes);
        List<Integer> expectedPrimes = new ArrayList<>(primeNumbers.primes);

        primeNumbers.primes.removeIf(num -> num % 10 == 9);

        Iterator<Integer> iter = primeNumbers.iterator();
        List<Integer> actualPrimes = new ArrayList<>();
        while (iter.hasNext()) {
            actualPrimes.add(iter.next());
        }

        Assertions.assertEquals(expectedPrimes, actualPrimes);
    }

    @Test
    void E() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.computePrimes(7);

        Assertions.assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNumbers.toString());
    }
}
