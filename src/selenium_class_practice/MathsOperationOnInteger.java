package selenium_class_practice;

import java.util.Scanner;

public class MathsOperationOnInteger {

	public static void main(String[] args) {
		
		 // Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

        // Get the first integer from the user
        System.out.print("Enter the first integer: ");
        int num1 = scan.nextInt();

        // Get the second integer from the user
        System.out.print("Enter the second integer: ");
        int num2 = scan.nextInt();

        // Close the Scanner to avoid resource leak
        scan.close();

        // Perform calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double) (num1 + num2) / 2;
        int distance = Math.abs(num1 - num2);
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
	

