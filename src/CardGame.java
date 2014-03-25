import java.util.ArrayList;

/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : Abstract class that card games can inherit from
***************************************************************/
public abstract class CardGame {

	Deck deck;
	Player players[];
	
	
	// ~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Constructor
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	CardGame(){}
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Constructor
	 Params     : Amount of players in the game
	 Return     : N/A
	===============================================================*/
	CardGame(int playerCount)
	{
	
		// Initialize deck 
		ArrayList cards = new ArrayList(); 
		while (deck.hasNext())
		{ 
			ICard card = (ICard)deck.next(); 
			System.out.println(card); 
			cards.add(card); 
		} 

		
		initializePlayers(playerCount);
		
		deal();
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~Abstract Methods~~~~~~~~~~~~~~~~~~~~~~~~
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Constructor
	 Params     : Amount of players in the game
	 Return     : N/A
	===============================================================*/
	abstract void displayRules();
	
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Deals cards to players
	 Params     : Amount of players in the game
	 Return     : N/A
	===============================================================*/
	abstract void deal();
	
	// ~~~~~~~~~~~~~~~~~Private Methods~~~~~~~~~~~~~~~~~~~~~
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Initialize the players of the game
	 Params     : Amount of players in the game
	 Return     : N/A
	===============================================================*/
	private void initializePlayers(int numOfPlayers)
	{
		for (int i = 0; i < numOfPlayers; i++)
			players[i] = new Player();
	}
	
	private void initializeDeck()
	{
	}
	

	// ~~~~~~~~~~~~~~~~~Public Methods~~~~~~~~~~~~~~~~~~~~~~
	
}
