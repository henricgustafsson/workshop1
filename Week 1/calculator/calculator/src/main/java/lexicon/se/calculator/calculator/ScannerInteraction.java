package lexicon.se.calculator.calculator;


import java.util.Scanner;

public class ScannerInteraction {
	
	
	private Scanner scanner;
	
	public ScannerInteraction(Scanner scanner) {
		this.scanner = scanner;
	}
	
	
	/**Promts user for number, displays
	 * error message if incorrect input & recurses
	 * @return int number
	 */
	public int getNextInt() {
		System.out.println("Enter Number");
		int number =0;
		try {
			number = scanner.nextInt();
			//Clear the number
			scanner.nextLine();
		}
		catch(Exception e){
			System.out.println("Please enter a number");
			getNextInt();
		}
		
		return number;
	}
	
	/**Prompts user for numbers, at least 2 required
	 * validates using checkIfSmallerThan().
	 * @return int[] numbersToCalculateArr
	 */
	public int[] getNumbersToCalculateArr() {
		System.out.println("How many numbers do you want to calculate");
		int numbersToCalculate = getNextInt();
		
		/*validate using numbersToCalculateArr, if user inputs at least 2 numbers 
		 * new array with n elements created, otherwise an empty array is created.
		 */
			int[] numbersToCalculateArr= checkIfSmallerThan(numbersToCalculate, 2,
					"Please enter atleast 2 numbers") ? new int[numbersToCalculate] : new int[0];
			
			if(numbersToCalculateArr.length >0) {
				for (int i = 0; i < numbersToCalculateArr.length; i++) {
					numbersToCalculateArr[i] = getNextInt();
				}
			}
			else {
				throw new IllegalArgumentException();
			}
			
		
		
		return numbersToCalculateArr;
	}
	
	
	/**Print menu options, takes input using scanner
	 * using getNextInt()
	 * @return int number
	 */
	public int menuHandler() {
		System.out.println("\nUse the keyboard to choose option\n*************\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int number =getNextInt();
		return number;
	}
	
	
	/**Prompts user, if user enters "y" returns true, else false
	 * @return boolean
	 */
	public boolean askIfContinue() {
    	System.out.println("Continue? (y/n)");
    	String input = scanner.nextLine();      	
    	return input.equalsIgnoreCase("y");
    	
    }
	
	
    
    /** Checks if parameter numberToCheck is smaller than parameter
     * minimumNumber, displays message
     * @param numberToCheck
     * @param minimumNumber
     * @param message
     * @return
     */
    public boolean checkIfSmallerThan(int numberToCheck,int minimumNumber, String message) {
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
