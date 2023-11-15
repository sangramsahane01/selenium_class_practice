package selenium_class_practice;

import java.util.Scanner;

public class SecondsConverter {
	
	public static void main(String[] args) {
		
		// Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

        // Get the input in seconds from the user
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scan.nextInt();

       
        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Display the result
        System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
	


