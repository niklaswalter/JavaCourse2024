package session1.testval;

public class Testing {

	public static void main(String[] args) {

		Comparison test = new Comparison(); // we construct an object of type Comparison

		double testedNumber = 2.7;
		double leftEnd = 2;
		double rightEnd = 3;

		System.out.println("The result of the test as a boolean is: "
				+ test.compactIsInside(testedNumber, leftEnd, rightEnd)/* method called inside the println */);

		int isInsideAsInt = test.isInsideAsInt(testedNumber, leftEnd, rightEnd);
		
		System.out.println("The result of the test as an integer is: " + isInsideAsInt);
	}
}
