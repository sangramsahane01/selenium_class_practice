package selenium_class_practice;

import java.util.Scanner;

public class PrintNumbersSeries {

	public static void main(String[] args) {

		// Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

		// Get the first integer from the user
		System.out.print("Enter Number (1-100): ");
		int num = scan.nextInt();
		for(int i = 1; i<=num; i++) {
		if (i % 3 == 0) {
			System.out.println("" + i);
		} else if (i % 5 == 0) {
			System.out.println("" + i);
		} else if (i % 3 == 0 && i % 5 == 0) {

			System.out.println("" + i);
		} 
	}
	}
}
