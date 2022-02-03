package activity1;
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
		
		Card aceClubs1 = new Card("ace", "clubs", 1);
		Card aceClubs2 = new Card("ace", "clubs", 1);
		Card sixHearts = new Card("six", "hearts", 6);
		
		System.out.println(aceClubs1.matches(sixHearts));
		System.out.println(aceClubs1.matches(aceClubs2));
		
		System.out.println(aceClubs1);
		System.out.println(aceClubs2);
		System.out.println(sixHearts);
	}
}
