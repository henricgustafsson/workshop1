package lexicon.se.calculator;

import java.util.Scanner;

public class App 
{
	public static Scanner scanner = new Scanner(System.in);
	public static ScannerInteraction scannerInteraction= new ScannerInteraction(scanner);
	public static MathOperations mathOperations = new MathOperations();
	
	
	
 
    public static void main( String[] args )
    { 
    	
    	System.out.println("*************\nWelcome to Lexicon's awesome calculator\n*************");
    	
    	
    	while(true) {
    		
    	 	int[] numbersToCalculateArr = scannerInteraction.getNumbersToCalculateArr();
    		
    		System.out.print("Choose operator.\n");
    		
    		int menuInput =scannerInteraction.menuHandler();
    		
    		System.out.print("The sum is: ");
    		
    		boolean continueApp = false;
    		
    	    switch(menuInput) {
    	    
    	    case 1:System.out.println(mathOperations.addNumbers(numbersToCalculateArr));
    	    	   continueApp = scannerInteraction.askIfContinue(); 
    	    	   break;
    	    case 2:System.out.println(mathOperations.subtractNumbers(numbersToCalculateArr));
	    	       continueApp = scannerInteraction.askIfContinue(); 
    	    	   break;
    	    case 3:System.out.println(mathOperations.multiplyNumbers(numbersToCalculateArr));
	    	       continueApp = scannerInteraction.askIfContinue(); 
    	    	   break;
    	    case 4:System.out.println(mathOperations.divideNumbers(numbersToCalculateArr));
	    	       continueApp = scannerInteraction.askIfContinue(); 
    	    	   break;
    	    	default: System.out.println("Invalid option.Please try again.");
    	    }	    	
	    	if(!continueApp) {
	    		break;
	    	}
    	}
    		
    }

    

    
    
    
    
    
}
