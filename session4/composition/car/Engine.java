package session4.composition.car;

import static session3.useful.Print.printn;

/**
 * This class has one only method, start(). This is also a method of the class
 * Car, which delegates its implementation to this class.
 *
 */

public class Engine {
	public void startEngine() { // starts the engine
		printn("Engine starts (and so it starts the car)");
	}
}
