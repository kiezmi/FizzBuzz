package com.kiezmi.fizzBuzz;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(DataProviderRunner.class)

public class FizzBuzzTest {

    @DataProvider
    public static Object[][] dataNumberProvider(){
        return new Object [][] {
                {3,true},
                {6,true},
                {9,true},
                {12,true},
                {15,true},
                {18,true},
        };
    }

    @Test
    public void firstTest() {
        assertTrue(true);
    }

    @Test
    @UseDataProvider("dataNumberProvider")
    public void itShoulReturnFizzifDivisiblebythree(final int input,final boolean spected) {
        //Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        int value = 3;
        //Action
        boolean result = fizzbuzz.isFizz(input);
        //Assertion
        assertEquals(spected,result);
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
