
public class GoFish extends CardGame {

	GoFish()
	{
		super();
		displayRules();
	}
	
	GoFish(int numOfPlayers)
	{
		super(numOfPlayers);
		displayRules();
		deal();
	}
	

	public void displayRules()
	{
		System.out.println("Go fish rules.");
	}
	
	public void deal()
	{
		int playerCycle = 1;
		Card dealingCard;

		while (playerCycle < P.length)
		{
			// Pass 7 cards to everyone
			for (int i=0; i<7; i++)
			{
				dealingCard = deck.removeCard();
				P[playerCycle].playersHand.addCard(dealingCard);	
			}
			playerCycle++;
		}
	}
}
