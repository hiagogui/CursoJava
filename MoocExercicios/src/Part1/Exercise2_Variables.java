package Part1;

import java.util.Scanner;

public class Exercise2_Variables {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Give a string: ");
		String text = scanner.nextLine();
		System.out.print("Give a integer number: ");
		int integer = Integer.valueOf(scanner.nextLine());
		System.out.print("Give a double number: ");
		double floatingPoint = Double.valueOf(scanner.nextLine());
		System.out.print("Give a boolean: ");
		boolean TrueOrFalse = Boolean.valueOf(scanner.nextLine());

		System.out.println("");
		System.out.println("You gave the string: " + text);
		System.out.println("You gave the integer: " + integer);
		System.out.println("You gave the string: " + floatingPoint);
		System.out.println("You gave the boolean: " + TrueOrFalse);

		System.out.println();

	}

}
