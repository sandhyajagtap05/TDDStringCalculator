package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorFinal {

    private final StringCaculatorNew calculator = new StringCaculatorNew();

    @Test
    void testEmptyString() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void testSingleNumber() {
        assertEquals(1, calculator.add("1"));
        assertEquals(5, calculator.add("5"));
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
    void testNewlineDelimiter() {
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    void testCustomDelimiter() {
        assertEquals(3, calculator.add("//;\n1;2"));
        // assertEquals(10, calculator.add("//|\n1|2|3|4"));
    }

    @Test
    void testCustomDelimiterWithSpecialCharacters() {
        assertEquals(6, calculator.add("//[***]\n1***2***3"));
    }

    @Test
    void testNegativeNumbersException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3,-4"));
        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
    }

    @Test
    void testMixedDelimitersAndNegativeNumbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("//;\n1;-2;3;-4"));
        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
    }

    @Test
    void testLargeNumberOfInputs() {
        assertEquals(5050, calculator.add("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100"));
    }

}
