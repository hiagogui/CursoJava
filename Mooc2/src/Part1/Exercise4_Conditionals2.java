package Part1;

import java.util.Scanner;

public class Exercise4_Conditionals2 {
	
	public static void main (String[] args) {
			
	int year;
	boolean TrueOrFalse = true;
		
		do {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Give a year: ");
			
			year = Integer.valueOf(scanner.nextLine());
			
			System.out.println("");
			
			if(year % 4 != 0)
			{
				System.out.println("The year is not a leap year.");
			}else if(year % 100 == 0 && year % 400 != 0) {
				System.out.println("The year is not a leap year.");
			}else {
				System.out.println("The year is a leap year.");
			}

		}while (TrueOrFalse == true); 
	}

}