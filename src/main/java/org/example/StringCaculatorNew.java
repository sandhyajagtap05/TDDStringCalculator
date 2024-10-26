package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCaculatorNew {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 1;
        }
// second test case
        if (!numbers.contains(",")) { // Step 2: Check for a single number
            return Integer.parseInt(numbers); // Return the number itself
        }

        String delimiter = ",|\n"; // default delimiters: comma and newline

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex); // Extract custom delimiter
            numbers = numbers.substring(delimiterIndex + 1); // Remove delimiter line from numbers string
        }

        String[] numArray = numbers.split(delimiter);
        return calculateSum(numArray);
    }

    private int calculateSum(String[] numbers) {
        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;

        for (String num : numbers) {
            if (!num.isEmpty()) { // Avoid empty values
                int value = Integer.parseInt(num);

                if (value < 0) {
                    negativeNumbers.add(value);
                } else {
                    sum += value;
                }
            }
        }

        // Throw exception if any negative numbers were found
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
        }

        return sum;
        // return -1;

        // trhird test case
//        String[] numArray = numbers.split(","); // Step 2: Split by comma
//        return calculateSum(numArray); // Step 3 & 4: Calculate and return the sum
//    }
//
//    private int calculateSum(String[] numbers) {
//        int sum = 0;
//
//        for (String num : numbers) {
//            if (!num.isEmpty()) {
//                sum += Integer.parseInt(num);
//            }
//
//
//        }
//
//        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Run test cases to verify functionality.");
    }

}
