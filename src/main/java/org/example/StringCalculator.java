package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) { // Step 2: Check for a single number
            return Integer.parseInt(numbers); // Return the number itself
        }

        return 0;
    }



//        public static void main(String[] args) {
//            System.out.println("Run test cases to verify functionality.");
//        }
}
