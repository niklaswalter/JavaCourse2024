package session2.mortgages;

/**
 * In the main method of this class we construct some objects of type Mortgage
 * (i.e., instances of the class Mortgage). This is to show you how the value of
 * a static field is shared among all objects of the class, and how this can be
 * used to set a "counter" (in this case, the total amount of money lent).
 *
 */
public class MortgagesMain {

	public static void main(String[] strings){
		Mortgage firstCustomer = new Mortgage("Smith", 35, 3E5);
		Mortgage secondCustomer = new Mortgage("Muller", 42, 2E5);
		Mortgage thirdCustomer = new Mortgage("Jackson", 19, 1.3E5);
		Mortgage fourthCustomer = new Mortgage("Fries", 37, 3.4E5);
		Mortgage fifthCustomer = new Mortgage("Mustermann", 39, 2.1E5);
	}
}
