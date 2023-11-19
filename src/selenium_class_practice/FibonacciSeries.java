package selenium_class_practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

		// Get the first integer from the user
		System.out.print("Enter Number ");
		int num = scan.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(b);
		for (int i = 0; i <= num; i++) {


			int c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
		}
	}
}
