package session4.testingprotection;

import static session3.useful.Print.printn;

/**
 * This classes shows the effects of the protected access modifier. It has one
 * protected field and one protected method, which will be called from a class
 * in the same package. We see that there is no problem because protected fields
 * have package access.
 *
 */

public class ProtectedSamePackage {
	
	protected int i = 6;

	protected void computeAndSetDouble() {
		printn("A protected method in the same package. You can call it");
		i *= 2;
	}

}
