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
		
		// Iterate through whole deck
		for (int i=0; i<52; i++)
		{
			dealingCard = deck.removeCard();
			P[playerCycle].playersHand.addCard(dealingCard);
			
			playerCycle++;
			
			if (playerCycle == (P.length)) 
				playerCycle = 1;
		}
	}

}
