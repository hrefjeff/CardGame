/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : Specific game that inherits from the abstract
			  class card game
***************************************************************/
public class War extends CardGame {
	
	// ~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructor for the card game War
	Params     : N/A
	Return     : N/A
	=====================================================*/
	War()
	{
		super();
		displayRules();
	}

	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructs a game of cards with a certain
				 amount of players, and deals cards to them
	Params     : Number of players
	Return     : N/A
	=====================================================*/
	War(int numOfPlayers)
	{
		super(numOfPlayers);
		displayRules();
		deal();
	}
	
	// ~~~~~~~~~~~~~~~~~~Public Functions~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Dispalys the rules to the game of war
	Params     : N/A
	Return     : N/A
	=====================================================*/
	public void displayRules()
	{
		System.out.println("War game");
	}

	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Deal cards out to all the players
	Params     : N/A
	Return     : N/A
	=====================================================*/
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
