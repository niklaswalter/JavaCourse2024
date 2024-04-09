package session1.oopdivisible;

public class CheckDivisibleSol {

	int dividend = 10;
	int divisor = 2;

	void check() {
		if (dividend % divisor != 0){
			System.out.println("Not divisible");
		}
		else {
			System.out.println("It is divisible");
		}
	}
}
