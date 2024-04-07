package session1.switches;

import java.util.Random;

public class ARandomSwitch {

	public static void main(String[] args) {
		Random randomNumberGenerator = new Random(); // current time as a seed for the random number generator
		int switchValue = randomNumberGenerator.nextInt(7);
		System.out.println("The generated number is " + switchValue);
		System.out.println();
		
		switch (switchValue /* integer between 0 and 6 */ ) {
		/*
		 * The switch compares now the value of switchValue to each value listed below.
		 * If it finds a match, the corresponding statement executes. If no match
		 * occurs, the default statement executes.
		 */
		case 0:
			System.out.println("The selected number has been evented by the Arabs");
			break; // the break causes execution to jump to the end of the switch body.

		case 2:
			System.out.println("The selected number is the smallest, positive even number");
			break;

		case 4:
			System.out.println("The selected number is the number of seasons");
			break;

		case 6:
			System.out.println("The selected number is the numbers of faces of a dice");
			break;

		default: // if no match occurs
			System.out.println("The selected number is odd ");
			/*
			 * The last statement, following the default, doesn’t have a break because the
			 * execution just falls through to where the break would have taken it anyway.
			 * You could put a break at the end of the default statement with no harm if you
			 * considered it important for style’s sake.
			 */

		}
	}
}
