/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test = new Card("Ace", "Spades", 4);
		System.out.println(test);
		Card moment = new Card("2", "Hearts", 0);
		System.out.println(moment);
		Card time = new Card("Queen", "Diamonds", 2);
		System.out.println(time);
		
	}
}