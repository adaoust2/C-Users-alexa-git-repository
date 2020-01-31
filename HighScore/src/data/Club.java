package data;

import java.util.HashMap;

/**
 * @author Bjmeo
 * *************
 */
public class Club {

	private String name;
	private String group;
	private HashMap<String, Player> players;
	
	
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	} 

<<<<<<< HEAD
	/**
	 * @param String name ,the name of the club
	 * @param String group ,the 
	 * @param HashMap players , the different players of the club
	 * @param ClubStats cStat , the different stats of the club
	 */
	public Club(String name, String group, HashMap<String, Player> players,ClubStats cStat) {
=======
	public Club(String name, String group, HashMap<String, Player> players) {
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
		super();
		this.name = name;
		this.group = group;
		this.players = players;
	}
	/**
	 * @return String name 
	 * */
	public String getName() {
		return name;
	}
	
	/**
	 * @param String name 
	 * */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return String group 
	 * */
	public String getGroup() {
		return group;
	}

	/**
	 * @param String group 
	 * */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return HashMap players 
	 * */
	public HashMap<String, Player> getPlayers() {
		return players;
	}

	/**
	 * @param HashMap players 
	 * */
	public void setPlayers(HashMap<String, Player> players) {
		this.players = players;
	}

<<<<<<< HEAD
	/**
	 * @return clubStats cstats  
	 * */
	public ClubStats getcStats() {
		return cStats;
	}

	/**
	 * @param ClubStats cStats 
	 * */
	public void setcStats(ClubStats cStats) {
		this.cStats = cStats;
	}
=======
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
		
	
}
