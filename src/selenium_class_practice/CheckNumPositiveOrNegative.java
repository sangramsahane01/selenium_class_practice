package selenium_class_practice;

import java.util.Scanner;

public class CheckNumPositiveOrNegative {

	public static void main(String[] args) {
		
		 // Create a Scanner object to read input from the user
		Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user input as a double
        double number = scan.nextDouble();

        // Close the scanner to avoid resource leak
        scan.close();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
	}
}
