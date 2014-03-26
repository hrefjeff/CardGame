
public class War extends CardGame {
	
	War(){
		super();
		displayRules();
	}
	
	War(int numOfPlayers){
		super(numOfPlayers);
		displayRules();
		deal();
	}
	
	public void displayRules(){
		System.out.println("War game");
	}
	
	void deal() 
	{
		int playerCycle = 1;
		Card dealingCard;
		System.out.println("Num of players: " + P.length);
		
		// Iterate through deck
		for (int i=0; i<52; i++)
		{
			// Remove the card off the top of the deck
			dealingCard = deck.removeCard();
			
			// Add that card to someone's hand
			P[playerCycle].playersHand.addCard(dealingCard);
			
			// If cycle equals amount of players
			if (playerCycle == (P.length)) 
				playerCycle = 0;
			
			// Increment cycle
			playerCycle++;
		}
	}

}
