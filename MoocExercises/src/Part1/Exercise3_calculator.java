package Part1;
import java.util.Scanner;

public class Exercise3_calculator {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double result = 0;
		int operation;
		int aux = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		do {
		System.out.println("");
		System.out.println("");
		
		System.out.print("input the first number: ");
		num1 = Double.valueOf(scanner.nextLine());
		System.out.println("");
		System.out.print("input the second number: ");
		num2 = Double.valueOf(scanner.nextLine());
		
		System.out.println("select an operation:\n1 - plus\n2 - minus\n3 - multi\n4 - div");
		operation = Integer.valueOf(scanner.nextLine());
		if(operation == 1)
			result = num1 + num2;
		if(operation == 2)
			result = num1 - num2;
		if(operation == 3)
			result = num1 * num2;
		if(operation == 4)
			result = num1 / num2;
		System.out.print("O resultado é: " +result);
		
		scanner.nextLine();
		
		}while(aux==0);

	}

}
