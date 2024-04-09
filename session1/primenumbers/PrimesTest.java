package session1.primenumbers;

public class PrimesTest {

	public static void main(String[] args) {
		
		int numberToBeChecked = 10;

		PrimesCheck checker = new PrimesCheck();

		boolean result = checker.checkIfPrime(numberToBeChecked);

		System.out.println("Is the number " + numberToBeChecked + " prime? " + result);
	}
}
