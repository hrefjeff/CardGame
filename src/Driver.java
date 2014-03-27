import java.util.*;
public class Driver {
	
		public static void main(String[] args) {

			// 1) Pick between games by taking choice input
			System.out.println("Which game would you like to play today?");
			System.out.println("\tG: Go Fish");
			System.out.println("\tW: War");

			// initialize answer
			Scanner user_input = new Scanner( System.in );
			String temp = user_input.next();
			char gameChoice = temp.charAt(0);

			// 2) Collect input how many number of players there are
			System.out.println("How many players are there?");
			System.out.println("--->");

			int numberOfPlayers = user_input.nextInt();

			// Initialize game player picked
			if (gameChoice == 'W' || gameChoice == 'w' )
			{
				War warGame = new War(numberOfPlayers);
				warGame.P[1].playersHand.displayCards();
			} else {
				GoFish goFishGame = new GoFish(numberOfPlayers);
				goFishGame.P[1].playersHand.displayCards();
			}
		}
}