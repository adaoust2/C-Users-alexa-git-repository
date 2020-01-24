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
	//private StatClub stat;
	private Boolean isStar;
	
	
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Club(String name, String group, HashMap<String, Player> players, Boolean isStar) {
		super();
		this.name = name;
		this.group = group;
		this.players = players;
		this.isStar = isStar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public HashMap<String, Player> getPlayers() {
		return players;
	}

	public void setPlayers(HashMap<String, Player> players) {
		this.players = players;
	}

	public Boolean getIsStar() {
		return isStar;
	}

	public void setIsStar(Boolean isStar) {
		this.isStar = isStar;
	}
	
	
	
	
}
