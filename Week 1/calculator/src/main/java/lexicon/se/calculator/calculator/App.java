package lexicon.se.calculator.calculator;

import java.util.Scanner;

public class App 
{
	public static Scanner scanner = new Scanner(System.in);
	public static String addition ="add";
	public static ScannerInteraction scannerInteraction= new ScannerInteraction(scanner);
	public static MathOperations mathOperations = new MathOperations(scannerInteraction);
    public static void main( String[] args )
    { 
    	System.out.println("*************\nWelcome to Lexicon's awesome calculator\n*************");
    	// Create an infinite loop
    	while(true) {    
    		int menuInput =scannerInteraction.menuHandler();
    		boolean continueApp = false;
    	    switch(menuInput) {
    	    case 1:System.out.println("The sum is:"+mathOperations.addNumbers());
    	    	   continueApp = scannerInteraction.askIfContinue(); 
    	    	   break;
    	    case 2:System.out.println("The sum is:"+mathOperations.subtractNumbers());
	    	       continueApp = scannerInteraction.askIfContinue(); 
    	    	   break;
    	    case 3:System.out.println("The sum is:"+mathOperations.multiplyNumbers());
	    	       continueApp = scannerInteraction.askIfContinue(); 
    	    	   break;
    	    case 4:System.out.println("The sum is:"+mathOperations.divideNumbers());
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
