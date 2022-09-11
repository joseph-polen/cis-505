/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
*/


/**
 * @author Joe Polen
 *Class for storing team information. Team name, and players on team.
 */
public class Team {
	private String teamName = "";
	private String[] players = new String[20];
	private int playerCount = 0;
			
	/**
	 * Argument constructor
	 * @param teamName - name of the team
	 */
	public Team(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * Method for adding a player to the team.
	 * @param player - The player being added
	 */
	public void addPlayer(String player) {
		players[playerCount] = player;
		playerCount++;
	}
	
	/**
	 * Method for getting array of players on team
	 * @return players
	 */
	public String[] getPlayers() {
		return players;
	}
	
	/**
	 * Method for getting number of players on team
	 * @return playerCount
	 */
	public int getPlayerCount() {
		return playerCount;
	}
	
	/**
	 * Method for getting the team name
	 * @return teamName;
	 */
	public String getTeamName() {
		return teamName;
	}

}
