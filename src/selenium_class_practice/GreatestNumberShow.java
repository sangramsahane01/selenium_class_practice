package selenium_class_practice;

import java.util.Scanner;

public class GreatestNumberShow {
	public static void main(String[] args) {
		
		// Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();

        // Close the Scanner to avoid resource leak
        scan.close();

        // Find the greatest number
        int max = num1; // Assume the first number is the maximum

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        // Display the result
        System.out.println("The greatest number is: " + max);
	}

}
