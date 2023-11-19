package selenium_class_practice;

import java.util.Scanner;

public class NumberFactorFind {
	public static void main(String[] args) {
		
		// Create a Scanner object to get input from the user
				Scanner scan = new Scanner(System.in);

				// Get the first integer from the user
				System.out.print("Enter Number : ");
				int num = scan.nextInt();
				
				for(int i = 1; i<= num; i++) {
					if(num % i == 0) {
						
						System.out.println(i);
					}
				}
	}

}
