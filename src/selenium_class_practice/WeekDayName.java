package selenium_class_practice;

import java.util.Scanner;

public class WeekDayName {

	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter the month (1-7): ");
	        int day = scanner.nextInt();
	        
	        scanner.close();
	        // check if number entered is valid 
	        
	        if(day == 1) {
	        	System.out.println("It's Monday Today");
	        }
	        else if(day == 2) {
	        	System.out.println("It's Tuesday Today");
	        }
	        else if(day == 3) {
	        	System.out.println("It's Wednesday Today");
	        }
	        else if(day == 4) {
	        	System.out.println("It's Thursday Today");
	        }
	        else if(day == 5) {
	        	System.out.println("It's Friday Today");
	        }
	        else if(day == 6) {
	        	System.out.println("It's Saturday Today");
	        } 
	        else if(day == 7) {
	        	System.out.println("It's Sunday Today");
	        }

	}
}
