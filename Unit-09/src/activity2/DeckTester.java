package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] myRanks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] mySuits = {"hearts", "diamonds", "spades", "clubs"};
		int[] myValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck d = new Deck(myRanks, mySuits, myValues);
		
		System.out.println("Deck Methods Testing");
		System.out.println(" size: " + d.size());
		System.out.println(" deal: " + d.deal());
		System.out.println(" toString: \n" + d.toString());
		d.shuffle();
		System.out.println("Shuffled Deck:\n toString: \n" + d.toString());
	}
}
