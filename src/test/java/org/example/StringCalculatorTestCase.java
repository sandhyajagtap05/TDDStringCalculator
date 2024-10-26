package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class StringCalculatorTestCase {


    private final StringCalculator calculator=new StringCalculator();
    @Test
   void testEmptyString(){
        assertEquals(0,calculator.add(""));
    }


    @Test
    void testSingleNumber() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    void testTwoNumbers() {
        assertEquals(3, calculator.add("1,2"));
        assertEquals(6, calculator.add("1,5"));
    }

    @Test
    void testMultipleNumbers() {
        assertEquals(10, calculator.add("1,2,3,4"));
    }




}
