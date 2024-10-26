package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void testCustomDelimiter() {
        assertEquals(3, calculator.add("1\n2,3"));
        // assertEquals(10, calculator.add("//|\n1|2|3|4"));
    }

    @Test
    void testCustomDelimiterWithSpecialCharacters() {
        assertEquals(6, calculator.add("//[***]\n1***2***3"));
    }





}
