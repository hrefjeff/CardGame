/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : Deck of cards
***************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator; 
import java.util.List;
import java.util.Random;

public class Deck implements Iterator {

	private ArrayList myCardList;
	private int top;
	
	// ~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*==============================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructor
	Params     : N/A
	Return     : N/A
	===============================================================*/
	Deck()
	{
		// Iterator to iterate through deck
		Iterator<Card> it=deck.iterator();	 
 
		// Build deck
	 	for(int suit = ICard.SPADES; suit <= ICard.CLUBS; suit++)
	 	{ 
	 		for (int rank = 1; rank <= 13; rank++)
	 		{ 
	 			deck.add(new Card(suit,rank)); 
	 		} 
		}	
	 	
	 	// Shuffle deck
	 	shuffle();
	}	

	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Adds card to deck
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	public void addCard(int suit, int value)
	{
		Card addedCard = new Card(suit, value);
		deck.add(addedCard);
	}

	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Shuffles the deck
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	private void shuffle()
	{
		long seed = System.nanoTime();
		Collections.shuffle(deck, new Random(seed));
	}
	
	public Object next() { 
		 ICard card = (ICard) myCardList.get(myIndex); 
		 myIndex++; 
		 return card;
	}

				
}
