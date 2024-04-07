package session1.primenumbers;

public class PrimesCheck {

	boolean checkIfPrime(int numberToBeChecked) {

		for (int possibleDivisor = 2; possibleDivisor <= Math.sqrt(numberToBeChecked); possibleDivisor++) {
			if (numberToBeChecked % possibleDivisor == 0) {// only if statement, without else
				return false;// Note here another use of return: it ends the loop and the method
			}
		}
		return true;
	}

}
