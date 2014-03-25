// TODO:
// 1) Remove a card from the hand

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Constructor
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	Player(){}

	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Displays the cards a player has in their hand
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	@SuppressWarnings("unused")
	private void displayHand()
	{
		int i = 0;
		Iterator<Card> it=hand.iterator();

        while(it.hasNext())
        {
          Card value = (Card)it.next();
          System.out.println("Card " + i + ": " +value);
          i++;
        }
	}
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Adds card to hand
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
    public void addCard(int suit, int value)
    {
    	Card addedCard = new Card(suit, value);
    	hand.add(addedCard);
    }
	
}