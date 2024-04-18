package session5.interfacesandpolymorphism.band;

/**
 * It is implemented by Wind and Percussion. Woodwind extends Wind, so it also
 * implicitly implement Instrument.
 *
 */
public interface Instrument {
	/**
	 * @param n: a value of the enum type Note
	 */
	void play(Note n);
}
