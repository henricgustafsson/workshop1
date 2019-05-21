package lexicon.se.calculator.calculator;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import lexicon.se.calculator.MathOperations;

public class MathOperationsTest {
	
	private MathOperations testMathOperations;
	
	@Before
	public void init() {
		
		testMathOperations = new MathOperations();
	}
	
	@Test
	public void test_addNumbers_two_elements_array() {
		int[] testArr = {1,2};
		
		double expected = 3;
		
		assertEquals(expected, testMathOperations.addNumbers(testArr), 0.0);

	}
	
	@Test
	public void test_addNumbers_three_elements_array() {
		int[] testArr = {1,2,3};
		
		double expected = 6;
		
		assertEquals(expected, testMathOperations.addNumbers(testArr), 0.0);

	}
	@Test
	public void test_addNumbers_twenty_elements_array() {
		int[] testArr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		
		double expected = 20;
		
		assertEquals(expected, testMathOperations.addNumbers(testArr), 0.0);

	}
	
	@Test
	public void test_subtractNumbers_two_elements_array() {
		int[] testArr = {2,1};
		
		double expected = 1;
		
		assertEquals(expected, testMathOperations.subtractNumbers(testArr), 0.0);

	}
	
	
	@Test
	public void test_subtractNumbers_three_elements_array() {
		int[] testArr = {5,1,1};
		
		double expected = 3;
		
		assertEquals(expected, testMathOperations.subtractNumbers(testArr), 0.0);

	}

	@Test
	public void test_multiplyNumbers_two_elements_array() {
		int[] testArr = {2,1};
		
		double expected = 2;
		
		assertEquals(expected, testMathOperations.multiplyNumbers(testArr), 0.0);

	}
	
	@Test
	public void test_multiplyNumbers_three_elements_array() {
		int[] testArr = {2,3,3};
		
		double expected = 18;
		
		assertEquals(expected, testMathOperations.multiplyNumbers(testArr), 0.0);

	}
	
	@Test
	public void test_divideNumbers_two_elements_array() {
		int[] testArr = {10,2};
		
		double expected = 5;
		
		assertEquals(expected, testMathOperations.divideNumbers(testArr), 0.0);

	}
	
	public void test_divideNumbers_three_elements_array() {
		int[] testArr = {100,2,2};
		
		double expected = 25;
		
		assertEquals(expected, testMathOperations.multiplyNumbers(testArr), 0.0);

	}

}
