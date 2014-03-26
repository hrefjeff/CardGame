/***************************************************************
Names       : Jeffrey Allen
Class       : CS315, Graphical User Interface
Assignment  : Assignment 1, Card Game
Description : This class is a player that wields a single hand
***************************************************************/
public class Player {

	private int score;
	public Hand playersHand;
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Constructor
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	Player()
	{
		score = 0;
		playersHand = new Hand();
	}
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Get score
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	@SuppressWarnings("unused")
	private int getScore()
	{
		return score;
	}
	
	/*==============================================================
	 Writer     : Jeffrey Allen
	 Purpose    : Set Score
	 Params     : N/A
	 Return     : N/A
	===============================================================*/
	@SuppressWarnings("unused")
	private void setScore(int updatedScore)
	{
		score = updatedScore;
	}

}