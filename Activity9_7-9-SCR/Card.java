package activity9;
/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
		toString();
	}


	
	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return suit;
   }

	
	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return rank;
	}

   
	public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return pointValue;
	}

	
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		if (otherCard.pointValue == pointValue ) {
			
			if (otherCard.rank == rank) {
				if (otherCard.suit == suit) {
					return true;
				}
			}
		}
		return false;
	}

	
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}