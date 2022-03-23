package activity9;
import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		System.out.println("hey" + containsPairSum11(selectedCards));
		System.out.println(containsJQK(selectedCards));
		
		return (containsPairSum11(selectedCards) || containsJQK(selectedCards));
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		for (int i = 0; i < super.size(); i++) {
			for (int j = i+1; j < super.size(); j++) {
				for (int k = j+1; k < super.size(); k++) {
					System.out.println("Another Play 1: " + cardAt(i).pointValue());
					System.out.println("Another Play 2: " + cardAt(j).pointValue());
					System.out.println("Another Play 3: " + cardAt(k).pointValue());
					if (cardAt(i).pointValue() + cardAt(k).pointValue() == 11) {
						return true;
					}
					if (cardAt(i).pointValue() + cardAt(j).pointValue() == 11) {
						return true;
					}
					if (cardAt(j).pointValue() + cardAt(k).pointValue() == 11) {
						return true;
					}
					else if ((cardAt(i).rank() != cardAt(j).rank()  && cardAt(i).rank() != cardAt(k).rank() && cardAt(k).rank() != cardAt(j).rank())) {
						 if(cardAt(i).rank() == "king" || cardAt(i).rank() == "queen" || cardAt(i).rank() == "jack") {
							if ((cardAt(j).rank() == "king" || cardAt(j).rank() == "queen" || cardAt(j).rank() == "jack" )) {
								if ((cardAt(k).rank() == "king" || cardAt(k).rank() == "queen" || cardAt(k).rank() == "jack" )) {
									return true;
								}
							}
						}
					}
				}
			}
		}
		
		return false;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/*for (int i = 0; i < selectedCards.size(); i++) {
			for (int j = i+1; j < selectedCards.size(); j++) {
				for (int k = j+1; k < selectedCards.size(); k++) {
					if (selectedCards.get(i) + selectedCards.get(k) == 11) {
						return true;
					}
					if (selectedCards.get(j) + selectedCards.get(k) == 11) {
						return true;
					}
					if (selectedCards.get(i) + selectedCards.get(j) == 11) {
						return true;
					}
				}
			}
		}*/
		int pos = 0;
		for (int i = 0; i < selectedCards.size(); i++) {
			pos = pos + cardAt(selectedCards.get(i)).pointValue();
		}
		if (pos == 11) {
			return true;
		}
		return false;
		
		
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/*for ( int i = 0; i < selectedCards.size(); i++) {
			for ( int j = i+1; j < selectedCards.size(); j++) {
				for ( int k = j+1; k < selectedCards.size(); k++) {
					if (cardAt(selectedCards.get(i)).pointValue() + selectedCards.get(j) + selectedCards.get(k) == 36) {
						return true;
					}
				}
			}
		}*/
		
		if (cardAt(selectedCards.get(0)).rank() == "jack" || cardAt(selectedCards.get(0)).rank() == "queen" || cardAt(selectedCards.get(0)).rank() == "king") {
			if ((cardAt(selectedCards.get(1)).rank() == "jack" || cardAt(selectedCards.get(1)).rank() == "queen" || cardAt(selectedCards.get(1)).rank() == "king"
					)&& (cardAt(selectedCards.get(1)).rank() != cardAt(selectedCards.get(0)).rank())) {
				if ((cardAt(selectedCards.get(1)).rank() == "jack" || cardAt(selectedCards.get(1)).rank() == "queen" || cardAt(selectedCards.get(1)).rank() == "king"
						)&& (cardAt(selectedCards.get(2)).rank() != cardAt(selectedCards.get(1)).rank() || cardAt(selectedCards.get(2)).rank() != cardAt(selectedCards.get(0)).rank())) {
					return true;
				}
			}
		}
		
		
		return false;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
	}
}