package session5.anotherpackage;

/**
 * This class illustrates the use of a package access interface implemented
 * by a public class
 */

import session5.packageaccessinterfaces.ImplementingClass;

public class TesterClass {

	public static void main(String[] args) {
		// ImplementingClass is public! We can import it and create objects
		ImplementingClass objectOfImplementingClass = new ImplementingClass();
		objectOfImplementingClass.methodToBeImplemented();// the method is automatically public!
	}

}
