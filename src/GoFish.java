/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : Specific game that inherits from the abstract
			  class card game
***************************************************************/
public class GoFish extends CardGame {

	// ~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructor for a go fish game
	Params     : N/A
	Return     : N/A
	=====================================================*/
	GoFish()
	{
		super();
		displayRules();
	}
	
	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructor for a go fish game
	Params     : Number of players
	Return     : N/A
	=====================================================*/
	GoFish(int numOfPlayers)
	{
		super(numOfPlayers);
		displayRules();
		deal();
	}
	
	// ~~~~~~~~~~~~~~~~~~Public Methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Displays the rules for the Go fish game
	Params     : N/A
	Return     : N/A
	=====================================================*/
	public void displayRules()
	{
		System.out.println("\n");
		System.out.println("**************************************");
		System.out.println("\tGo fish rules.");
		System.out.println("**************************************");
		System.out.println("\n");
	}
	
	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Deals cards to all players in a GoFish game
	Params     : N/A
	Return     : N/A
	=====================================================*/
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
