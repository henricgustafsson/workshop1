package lexicon.se.calculator.calculator;


public class MathOperations {
	
	private ScannerInteraction scannerInteraction;
	
	public MathOperations(ScannerInteraction scannerInteraction) {
		this.scannerInteraction = scannerInteraction;
		
	}


	public int addNumbers() {
	 	
		int numbersToCalculate = scannerInteraction.getNumber("How many numbers do you want to calculate");
		int sum = 0;
    	
    	if(scannerInteraction.CheckifSmallerThan(numbersToCalculate, 2,"Atleast two numbers needed")) {	
		
			int[] numbers = new int[numbersToCalculate];
			
			
			for (int number : numbers) {
				number = scannerInteraction.getNextInt();
				sum += number;
			}				
			
		}
    	else throw new IllegalArgumentException(); 
		return sum;			
			    		
}


	public  int subtractNumbers() {
		
		
		int firstNumber = scannerInteraction.getNumber("Enter first number");
		int secondNumber = scannerInteraction.getNumber("Enter second number");
		int sum =firstNumber -secondNumber;
		return sum;
		//System.out.println("The sum is: "+ sum);
		
	/*    	int numbersToCalculate = getNumber("How many numbers do you want to calculate");
		if(CheckifSmallerThan(numbersToCalculate, 2,"Atleast two numbers needed")) {	
	    	int[] numbers = new int[numbersToCalculate];
	    	int sum = 0;
	    	
	    	for (int number : numbers) {
				System.out.println("Enter Number");
			    number = scanner.nextInt();
				scanner.nextLine();	
			}
	    	
	    	
	    	for (int i = 0; i < numbers.length; i++) {
				
				
			}
	    	*/
		
	    	//System.out.println("The sum is: "+ sum);
		
	}
	
	public  int multiplyNumbers() {
		int firstNumber = scannerInteraction.getNumber("Enter first number");
		int secondNumber = scannerInteraction.getNumber("Enter second number");
		int sum =firstNumber *secondNumber;
		
		return sum;
	}
	
	public  int divideNumbers() {
		int firstNumber = scannerInteraction.getNumber("Enter first number");
		int secondNumber = scannerInteraction.getNumber("Enter second number");
		int sum =firstNumber /secondNumber;
		
		return sum;
	}
	
}
