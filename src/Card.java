import java.util.ArrayList;

/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : This is a card class that describes a card with
 			  a value and a suit
Reference   : www.cs.duke.edu
***************************************************************/
public class Card implements ICard {
	
	// ~~~~~~~~~~~~~~~~~~~~~~Data member~~~~~~~~~~~~~~~~~~~~~~~~
	private final int suit;
	private final int value;
	private String name;
	
	// Declare names of the different suits as strings
	private static final String[] suitStrings = {
		"spades", "hearts", "diamonds", "clubs"	
	};

	// Declare name of the different values as strings
	private static final String[] valueStrings = {
		"joker","ace","two","three","four","five",
		"six","seven","eight","nine","ten",
		"jack","queen","king"	
	};
	
	// ~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*=============================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructor for a card
	Params     : N/A
	Return     : N/A
	===============================================================*/
	public Card(int theSuit, int theValue)
	{
		value = theValue;
		suit  = theSuit;
		name  = valueStrings[getValue()]+" of "+suitStrings[getSuit()];
	}
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Prints all cards in a list
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	public void printCards(ArrayList<Card> cards)
	{
		for(int i=0; i < cards.size(); i++)
		{
			System.out.println(cards.get(i));
		}
	}
	
	/*==============================================================
	Writer     : Jeffrey Allen
	Purpose    : Gets value of the card
	Params     : N/A
	Return     : int
	===============================================================*/
	public int getSuit()
	{
		return suit;
	}

	/*==============================================================
	Writer     : Jeffrey Allen
	Purpose    : Gets value of the card
	Params     : N/A
	Return     : int
	===============================================================*/
	public int getValue()
	{
		return value;
	}

	/*==============================================================
	Writer     : Jeffrey Allen
	Purpose    : Gets the name of the card
	Params     : N/A
	Return     : String
	===============================================================*/
	public String toString()
	{
		return name;
	}

	/*==============================================================
	Writer     : Jeffrey Allen
	Purpose    : Compares two objects of type ICard
	Params     : a card
	Return     : int
	===============================================================*/
	public int compareTo(Object o)
	{	
		// Cast the object so I can even compare the two
		ICard other = (ICard) o;
		
		// Subtract the two values
		int result = getValue() - other.getValue();
		
		// If the value of the two cards are equal
		if (result == 0)
		{
			// Return the difference of the two suits
			return getSuit() - other.getSuit();
		} else {
			// Return which card is of higher value
			return result;
		}
	}
	
	/*==============================================================
	Writer     : Jeffrey Allen
	Purpose    : Place holder because I won't be comparing two objects
	 			 for this project
	Params     : Place holder
	Return     : Place holder
	===============================================================*/
	public boolean equals(Object o)
	{
	    return true;
	}
}