public class Deck {
	
	int numberOfCards = 52;
	int topOfDeck = 0;
	Card cards[];
	
	Deck() {
		// Make new stack of cards
		cards = new Card[numberOfCards];
		
		// Create deck
		// Give all cards a suit/value
		// Shuffle the deck
	}
	
	public void shuffle()
	{
	}
	
	public Card draw() {
		return cards[topOfDeck];
	}
	
}