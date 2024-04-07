package session1.oopdivisible;

public class CheckDivisible {

	int dividend = 10;
	int divisor = 2;

	void check() {
		if (dividend % divisor == 0) {
			System.out.println(dividend + " is divisible by " + divisor);
		} else {
			System.out.println(dividend + " is not divisible by " + divisor);
		}
	}
	
}
