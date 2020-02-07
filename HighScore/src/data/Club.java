package data;

import java.util.HashMap;

/**
 * @author Bjmeo
 * *************
 */
public class Club implements Comparable{

	private String name;
	private String group;
	private HashMap<String, Player> players;
	private float level;
	private ClubStats cStats;
	
	
	public Club() {
	} 


	public Club(String name, String group, HashMap<String, Player> players,ClubStats cStat) {

	}
	public Club(String name, String group, HashMap<String, Player> players) {
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
	

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return String group 
	 * */
	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return HashMap players 
	 * */
	public HashMap<String, Player> getPlayers() {
		return players;
	}

	public void setPlayers(HashMap<String, Player> players) {
		this.players = players;
	}

	/**
	 * @return clubStats cstats  
	 * */
	public ClubStats getcStats() {
		return cStats;
	}


	public void setcStats(ClubStats cStats) {
		this.cStats = cStats;
	}


	public float getLevel() {
		return level;
	}

	public void setLevel(float level) {
		this.level = level;
	}


	@Override
	public int compareTo(Object o) {
		float compareLevel =((Club)o).getLevel();
		return Float.compare(this.level,compareLevel);
	}
	@Override
	public String toString() {
		return "Club [name=" + name + ", group=" + group + ", players=" + players + ", cStats=" + cStats + "]";
	}

	
}

