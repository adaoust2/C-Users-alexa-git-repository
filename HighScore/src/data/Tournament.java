package data;

import java.util.ArrayList;

/**
 * @author oumar
 * */
public class Tournament {
	
	private Groups groups ;
	
	private ArrayList<String> randomStat = new ArrayList<String>();

	public Tournament(Groups groups) {
		super();
		this.groups = groups;
	}

	public Groups getGroups() {
		return groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Tournoi [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
