package session1.oophelloworld;

public class Message {

	String messageToBePrinted = "Standard message, which can be modified";

	// or also:
	//String messageToBePrinted = new String("Standard message: it can be modified");

	/*
	 * Look at the definition of the method: void (it returns no object), name of the
	 * method (first letter not capitalised, Java convention), argument list (in
	 * this case no argument)
	 */

	void printMessage() {
	/*
	 * This method prints the message contained in the string messageToBePrinted, which
	 * is a field of the object: small and simple example of the interplay between methods
	 * and fields
	 */
		System.out.println(messageToBePrinted);
	}

	/*
	 * This method also prints a string: not the one contained in messageToBePrinted, but one
	 * string passed through the argument list. These two methods do the same thing, but in
	 * different ways. We will see in some time how to deal with such a situation.
	 */
	void printMessageWithArgument(String messageFromMethod) {
		System.out.println(messageFromMethod);
	}

}