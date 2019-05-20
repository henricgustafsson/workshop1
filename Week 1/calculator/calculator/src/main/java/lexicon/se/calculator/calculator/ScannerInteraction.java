package lexicon.se.calculator.calculator;

import java.util.Scanner;

public class ScannerInteraction {
	
	
	private Scanner scanner;
	
	public ScannerInteraction(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public int[] getNumbersToCalculateArr() {
		int numbersToCalculate = getNumber("How many numbers do you want to calculate");
							
		int[] numbersToCalculateArr = new int[numbersToCalculate];
		
		for (int i = 0; i < numbersToCalculateArr.length; i++) {
			numbersToCalculateArr[i] = getNumber("Enter number");
		}
		return numbersToCalculateArr;
	}
	
	
	public int menuHandler() {
		System.out.println("\nUse the keyboard to choose option\n*************\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}
	public int getNextInt() {
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}
	public boolean askIfContinue() {
    	System.out.println("Continue? (y/n)");
    	String input = scanner.nextLine();      	
    	return input.equalsIgnoreCase("y");
    	
    }
	
	public int getNumber(String message) {
    	System.out.println(message);
    	int number =0;
    	try {
    		number = scanner.nextInt();
    		scanner.nextLine();
    	}
    	catch(Exception e) {
			System.out.println("Please enter a number!");
			scanner.nextLine();
			getNumber(message);
		}
    	return number;
    }
    
    public boolean CheckifSmallerThan(int numberToCheck,int minimumNumber, String message) {
    	if(numberToCheck < minimumNumber) {
    		System.out.println(message);
    		scanner.nextLine();
    		return false;
    	}
    	else {
    		return true;
    	}
    	
    }
}
