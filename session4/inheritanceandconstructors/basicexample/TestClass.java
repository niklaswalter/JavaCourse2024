package session4.inheritanceandconstructors.basicexample;

import java.time.temporal.ChronoUnit;

/**
 * Running this class we can see that the constructor of the parent class is
 * implicitly called when an object of the derived class is created.
 *
 */
public class TestClass {

	public static void main(String[] args) {
		ChildClass derived = new ChildClass();// look at how constructors are called
	}
}
