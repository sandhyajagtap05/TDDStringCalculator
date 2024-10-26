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
}
