/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : Abstract class that card games can inherit from
***************************************************************/
public abstract class CardGame {

	public Deck deck;
	public Player[] P;
	
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
	CardGame(int numOfPlayers)
	{ 	
		deck = new Deck();
		initializePlayers(numOfPlayers);
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
	
	
}
