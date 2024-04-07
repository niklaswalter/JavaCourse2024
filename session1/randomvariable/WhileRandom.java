package session1.randomvariable;

import java.util.Random;

public class WhileRandom {

	public static void main(String[] args) {
		int numberOfFlips = 0; // initialized to zero

		// create a reference to a new object of type Random: Java class
		Random randomNumberGenerator = new Random(); // current time as a seed for the random number generator
		/*
		 * the seed is an initialization value for the random number generator: the
		 * generator will always produce the same sequence for a particular seed value
		 */
		do {
			numberOfFlips++; // first you flip!
		} while (randomNumberGenerator.nextInt(2) == 1); // 0 is tail, 1 is head
		
		
		//while (randomNumberGenerator.nextInt(2) == 1);{// 0 is tail, 1 is head
		//	numberOfFlips++;
		//}
		
		// nextInt(n) produces a random natural number (0 included) smaller than n
		System.out.println("I got a tail after " + numberOfFlips + " launches");
	}
}
