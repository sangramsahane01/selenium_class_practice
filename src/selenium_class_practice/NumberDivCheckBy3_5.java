package selenium_class_practice;

import java.util.Scanner;

public class NunberDivCheckBy3_5 {
	public static void main(String[] args) {

		// Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

		// Get the first integer from the user
		System.out.print("Enter Number (1-100): ");
		int num = scan.nextInt();
		System.out.println("Number Divided By 3 = " + num);
		for(int i = 1; i<=num; i++) {
		if (i % 3 == 0) {
			System.out.print(i + "," );
		} 
		}
		System.out.println("\n Number Divided By 5 = ");
		for(int i = 1; i<=num; i++) {
			if (i % 5 == 0) {
				System.out.print(i + "," );
			} 
		
		} 
		System.out.println("\n Number Divided By 3 & 5 = ");
		for(int i = 1; i<=num; i++) {
		if (i % 3 == 0 && i % 5 == 0) {

			System.out.print(i + "," );
		} 
	}
	}

}
