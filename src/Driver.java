import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		// ****Collect information for initialization of game****
		
		// 1) Pick between games by taking choice input
		System.out.println("Which game would you like to play today?");
		System.out.println("Choices:");
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
		if (gameChoice == 'W' || gameChoice == 'w' ) {
			War warGame = new War(numberOfPlayers);
		}

		// Create instance of card game
		War warCardGame = new War();
		
		
	}

}
