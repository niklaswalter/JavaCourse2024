package session1.gauss;

public class SumOfIntegers {

	/**
	 * Compute the sum of natural numbers form 1 to lastNumber, with a for loop. As an extra, it also prints
	 * all those numbers.
	 *
	 * @param lastNumber: final number of the sum
	 * @return the sum from 1 to lastNumber
	 */

	int sumUpToNumber(int lastNumber) {
		int sum = 0;
		System.out.println("Looping...");
		for (int i = 1; i <= lastNumber; i++) {
			System.out.print(i + " "); //We use print instead of println: We do not want line breaks!
			 sum += i; //sum = sum + i;
		}
		System.out.println();
		return sum;
	}
	
	/**
	 * Compute the sum of natural numbers form 1 to lastNumber, using Gauss formula. 
	 *
	 * @param lastNumber: final number of the sum
	 * @return the sum from 1 to lastNumber
	 */

	int sumUpToNumberWithGauss(int lastNumber) {
		return lastNumber * (lastNumber + 1) / 2;
	}
}
