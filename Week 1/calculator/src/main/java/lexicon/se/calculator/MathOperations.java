package lexicon.se.calculator.calculator;

import java.util.Arrays;

/**
 * @author Henric Gustafsson
 * 
 *
 */
public class MathOperations {
	
	
	
	public MathOperations(){
		// TODO Auto-generated constructor stub
	}


	/** Method for addition. 
	 * Iterates through the integer array passed as a parameter
	 * adding the value of each element to the integer sum.
	 * @param int[] numbersToCalculateArr
	 * @return int sum
	 */
	public int addNumbers(int[] numbersToCalculateArr) {
		int sum = 0;
		for (int number : numbersToCalculateArr) {
			sum+=number;
		}		  	

		return sum;			
			    		
}


	/** Method for subtraction.
	 * Sorts the integer array passed as a parameter in ascending order,
	 * sets the integer sum to the value of the last element
	 * with highest value.
	 * Iterates through the array starting at the 2nd to last element
	 * & subtracts each following element stored in the integer sum.
	 * 
	 * @param numbersToCalculateArr
	 * @return int sum
	 */
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
	
	/**Iterates through the integer array passed as a parameter,
	 * multiplying the value of each element to the sum stored in the integer sum.
	 * @param numbersToCalculateArr
	 * @return int sum
	 */
	public  int multiplyNumbers(int[] numbersToCalculateArr) {
		int sum = 1;
		
		for (int i = 0; i < numbersToCalculateArr.length; i++) {
			sum *=numbersToCalculateArr[i];
		}
		return sum;
	}
	
	/**Sorts the array passed as a parameter, sets integer sum to 
	 * the value of the last element, iterates starting with the 2nd
	 * to last element dividing the integer sum with the value
	 * of each element.
	 * @param numbersToCalculateArr
	 * @return int sum
	 */
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
