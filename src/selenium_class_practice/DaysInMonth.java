package selenium_class_practice;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Check if the entered month is valid
        if (month == 1) {
            System.out.println("January Month has 31 Days.");
        }
        else if (month == 2) {
            System.out.println("February Month has 28/29 Days.");
        }
        else if (month == 3) {
            System.out.println("March Month has 31 Days.");
        }
        else if (month == 4) {
            System.out.println("April Month has 30 Days.");
        }
        else if (month == 5) {
            System.out.println("May Month has 31 Days.");
        }
        else if (month == 6) {
            System.out.println("June Month has 30 Days.");
        }
        else if (month == 7) {
            System.out.println("July Month has 31 Days.");
        }
        else if (month == 8) {
            System.out.println("August Month has 31 Days.");
        }
        else if (month == 9) {
            System.out.println("Septeber Month has 30 Days.");
        }
        else if (month == 10) {
            System.out.println("October Month has 31 Days.");
        }
        else if (month == 11) {
            System.out.println("November Month has 30 Days.");
        }
        else if (month == 12) {
            System.out.println("December Month has 31 Days.");
        }else {
        	System.out.println("Invalide Input");

     	}		
    }
}