/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

w3Schools. (n.d.). Java User Input (scanner). w3Schools. Retrieved September 11, 2022, 
from https://www.w3schools.com/java/java_user_input.asp 
*/


import java.util.Scanner;

/**
 * @author Joe Polen
 * Class for testing the Team class
 */
public class TestSportsTeamApp {

	public static void main(String[] args) {
		
		//Create scanner for user input
		Scanner scan = new Scanner(System.in);
		
		//Create array for storing player names
		String[] playerNamesArray = new String[20];
		
		//String for controlling the while loop with y/n
		String cont = "y";
		
		//While the user enters y for continue, keep looping
		while(cont.equals("y")) {
			
			//Ask user for team input and read with scanner
			System.out.printf("  Enter a team name: ");
			String teamName = scan.nextLine();
				
			//Ask user for player names and read with scanner, store in playerNames string
			System.out.printf("  Enter the player names:\n");
			System.out.printf("    hint: use commas for multiple players; no spaces>: ");
			String playerNames = scan.nextLine();
			
			//split player names string unto the playerNamesArray
			playerNamesArray = playerNames.split(",");
			
			
			//Create instance of team class using teamName
			Team team = new Team(teamName);
			
			//Iterate over playerNamesArray and create players
			for(int i=0; i<playerNamesArray.length; i++) {
				team.addPlayer(playerNamesArray[i]);
			}
			
			
			//Print Team Summary
			System.out.println("\n  --Team Summary--");
			System.out.println("  Number of players in team: " + team.getPlayerCount());
			System.out.printf("  Players on team: ");
			
			//Get players and store in teamPlayers
			String[] teamPlayers = team.getPlayers();
			
			//Iterate over teamPlayers and print player names
			for(int i=0; i<teamPlayers.length; i++) {
				if(teamPlayers[i] != null)
				System.out.print(teamPlayers[i] + ",");
			}
			
			
			//Ask the user if they want to continue
			System.out.printf("\n\n  Continue? (y/n) ");
			cont = scan.nextLine();
			
		}
		
		System.out.printf("\n  End of line...");
		
		//Close scanner object
		scan.close();
					
	}

}
