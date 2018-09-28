package com.kiezmi.fizzBuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class FizzBuzzTest {

    @Test
    public void firstTest() {
        assertTrue(true);
    }

    @Test
    public void itShoulReturnFizzifDivisiblebythree() {
        //Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        int value = 3;
        //Action
        boolean result = fizzbuzz.isFizz(value);
        //Assertion
        assertTrue(result);
    }
    public void itShoulReturnFizzifDivisiblebyfive() {
        //Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        int value = 5;
        //Action
        boolean result = fizzbuzz.isBuzz(value);
        //Assertion
        assertTrue(result);
    }

}
