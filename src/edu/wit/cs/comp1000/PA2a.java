package edu.wit.cs.comp1000;

import java.util.Scanner;  // Import Scanner

// TODO: document this class
public class PA2a {

    // TODO: document this function
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Variables to store sums and counts
        int totalSum = 0;
        int positiveSum = 0;
        int nonPositiveSum = 0;
        int positiveCount = 0;
        int nonPositiveCount = 0;

        // Prompt for input
        System.out.print("Enter five whole numbers: ");
        
        // Loop for the input to calculate
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();  // Read the number
            
            totalSum += num;  // Add to total sum
            
            if (num > 0) {
                positiveSum += num;  // Add to positive sum
                positiveCount++;      // Increment positive count
            } else {
                nonPositiveSum += num;  // Add to non-positive sum
                nonPositiveCount++;     // Increment non-positive count
            }
        }

        // Calculate averages
        double totalAverage = totalSum / 5.0;
        double positiveAverage = (positiveCount > 0) ? (positiveSum / (double) positiveCount) : 0.0;
        double nonPositiveAverage = (nonPositiveCount > 0) ? (nonPositiveSum / (double) nonPositiveCount) : 0.0;

        // Output results
        System.out.printf("The sum of the %d positive numbers: %d%n", positiveCount, positiveSum);
        System.out.printf("The sum of the %d non-positive numbers: %d%n", nonPositiveCount, nonPositiveSum);
        System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
        System.out.printf("The average of the %d positive numbers: %.2f%n", positiveCount, positiveAverage);
        System.out.printf("The average of the %d non-positive numbers: %.2f%n", nonPositiveCount, nonPositiveAverage);
        System.out.printf("The average of the 5 numbers: %.2f%n", totalAverage);

        // Close the scanner
        scanner.close();
    }
}
