package IccScenarios;

import org.testng.annotations.Test;

public class Scenario9 {
	@Test
	public void scenario9() {
		int number = 567809;
		int sum = add(number);
		System.out.println("Sum of digits of " + number + " is " + sum);
	} 

	/**
	 * Recursive method to calculate digits of a number
	 * 
	 * @param number
	 * @return
	 */

	static int add(int number) {
		// check if the number is 0
		if (number == 0) {
			return 0;
		}
		
		// get the last digit of number
		int lastDigit = number % 10;
		// call this method again with the sum of digit and remaining number
		return lastDigit + add(number / 10);
	}
}

