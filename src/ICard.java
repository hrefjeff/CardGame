/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : This is a card interface that specifies the behavior
			  of a card
***************************************************************/
public interface ICard extends Comparable {

	 public static final int SPADES = 0; 
	 public static final int HEARTS = 1; 
	 public static final int DIAMONDS = 2; 
	 public static final int CLUBS = 3; 
	 
	 public int getSuit(); 
	 public int getRank();
	
}
