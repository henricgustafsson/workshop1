package lexicon.se.calculator.calculator;

import java.util.Arrays;
import java.util.Iterator;

public class MathOperations {
	
	private ScannerInteraction scannerInteraction;
	
	public MathOperations(ScannerInteraction scannerInteraction) {
		this.scannerInteraction = scannerInteraction;
		
	}


	public int addNumbers(int[] numbersToCalculateArr) {
		int sum = 0;
		for (int number : numbersToCalculateArr) {
			sum+=number;
		}		  	

		return sum;			
			    		
}


	public  int subtractNumbers(int[] numbersToCalculateArr) {
		
		int sum=0;
		Arrays.sort(numbersToCalculateArr);
		int lastElementPos = numbersToCalculateArr.length-1;
		sum = numbersToCalculateArr[lastElementPos];
		
		for(int i=lastElementPos-1;i>=0;i --){
			sum -= numbersToCalculateArr[i];

		}
					
		return sum;
		
		
	}
	
	public  int multiplyNumbers(int[] numbersToCalculateArr) {
		int sum = 1;
		
		for (int i = 0; i < numbersToCalculateArr.length; i++) {
			sum *=numbersToCalculateArr[i];
		}
		return sum;
	}
	
	public  int divideNumbers(int[] numbersToCalculateArr) {
		int sum=0;
		
		Arrays.sort(numbersToCalculateArr);
		
		int lastElementPos = numbersToCalculateArr.length-1;
		sum = numbersToCalculateArr[lastElementPos];
		
		for(int i=lastElementPos-1;i>=0;i --){
			sum /= numbersToCalculateArr[i];

		}
		
		return sum;
	}
	
}
