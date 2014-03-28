/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : This class is an abstract class which Deck
			  and Hand inherit from
***************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public abstract class CardStack implements Iterator<Card> {
	
	public ArrayList<Card> cardStack;
	public int top;
	
	// ~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*====================================================
	Writer     : Jeffrey Allen
	Purpose    : Constructor
	Params     : N/A
	Return     : N/A
	=====================================================*/
	CardStack()
	{
		cardStack = new ArrayList<Card>();	
	}
	
	// ~~~~~~~~~~~~~~~~~~Public Methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Shuffles the deck
	 Params     : N/A
	 Return     : N/A
	=====================================================*/
	public void shuffle()
	{
		Collections.shuffle(cardStack);
	}
	
	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Adds card to deck
	 Params     : Suit and Value
	 Return     : N/A
	=====================================================*/
	public void addCard(int suit, int value)
	{
		Card addedCard = new Card(suit, value);
		cardStack.add(addedCard);
	}
	
	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Adds card to deck
	 Params     : Card
	 Return     : N/A
	=====================================================*/
	public void addCard(Card card)
	{
		Card addedCard = new Card(card.getSuit(), card.getValue());
		cardStack.add(addedCard);
	}
	
	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Shows all card in stack
	 Params     : N/A
	 Return     : N/A
	=====================================================*/
	public void displayCards()
	{
		for (int i=0; i<cardStack.size(); i++)
		{
			System.out.println("Card " + (i+1) + ":" + cardStack.get(i));
		}
	}

	
	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Returns the next card in the stack
	 Params     : N/A
	 Return     : N/A
	=====================================================*/
	public Card next()
	{
		 Card card = (Card) cardStack.get(top++);
		 return card;
	}
	
	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Sees if cardstack has a next slot
	 Params     : N/A
	 Return     : N/A
	=====================================================*/
	public boolean hasNext()
	{
		return top < cardStack.size();
	}

	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Removes a card from the stack
	 Params     : N/A
	 Return     : N/A
	=====================================================*/
	public Card removeCard()
	{
		Card card = (Card) cardStack.get(--top);
		return card;
	}

	/*====================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Place holder because I'm not removing 
	 			  anything from the card stack
	 Params     : N/A
	 Return     : N/A
	=====================================================*/
	public void remove()
	{
		throw new UnsupportedOperationException();
	}

}
