/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : This is a card interface that describes a card with
 			  a value and a suit
Reference   : www.cs.duke.edu
***************************************************************/
public interface ICard extends Comparable<Object> {

	public static final int SPADES = 0; 
	public static final int HEARTS = 1; 
	public static final int DIAMONDS = 2; 
	public static final int CLUBS = 3; 

	// Everything that implements ICard must have a
	// method to get the suit and value of a card
	public int getSuit(); 
	public int getValue();
	
}
