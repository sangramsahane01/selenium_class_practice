package selenium_class_practice;

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		
		 // Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        double number = scan.nextDouble();

        // Close the Scanner to avoid resource leak
        scan.close();

        // Calculate square, cube, and fourth power
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        // Display the results
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);
	}
}
