package Part1;

import java.util.Scanner;

public class Exercice1_ScannerAndPrintAstory {
	
	public static void main(String[] args) {
		
		//Creates a scanner tool
		Scanner scanner = new Scanner(System.in);
		
		//Used to input the story main character
		System.out.print("I will tell you a story, first of all, tell me What is your name: ");
		String name = scanner.nextLine();
		
		//Used to input the character's job
		System.out.print("Now, tell me what is your job: ");
		String job = scanner.nextLine();
		
		//Now the story begging with some concatenations
		System.out.println("\n\n\nHere is the story:");
		System.out.println("Once upon a time there was a boy called "+name+".");
		//System.out.println("And he was a "+job+"...");
		//Outra forma de fazer o comando de cima
		System.out.printf("And he was a %s...",job);
		System.out.println("On his way to work, "+name+" reflected on life!");
		System.out.println("Perhaps "+name+" will not be an "+job+" forever.");
		
		
		System.out.println("");
		

	}
}
