package selenium_class_practice;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		
		 // Create a Scanner object to get input from the user
		Scanner scan = new Scanner(System.in);

        // Get the temperature in Celsius from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scan.nextDouble();

        // Close the Scanner to avoid resource leak
        scan.close();

        // Convert Celsius to Fahrenheit using the formula: °F = 1.8°C + 32°
        double fahrenheit = 1.8 * celsius + 32;

        // Convert Celsius to Kelvin using the formula: K = °C + 273°
        double kelvin = celsius + 273;

        // Display the results
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperature in Kelvin: " + kelvin + " K");
	}

}
