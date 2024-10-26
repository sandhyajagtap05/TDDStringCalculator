package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) { // Step 2: Check for a single number
            return Integer.parseInt(numbers); // Return the number itself
        }


        String[] numArray = numbers.split(","); // Step 2: Split by comma
        return calculateSum(numArray); // Step 3 & 4: Calculate and return the sum
    }

    private int calculateSum(String[] numbers) {
        int sum = 0;

        for (String num : numbers) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        return sum;
    }




//        public static void main(String[] args) {
//            System.out.println("Run test cases to verify functionality.");
//        }
}
