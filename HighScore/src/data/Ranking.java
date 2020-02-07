package data;

import java.util.HashMap;
/**
 * @author oumar
 * **/
public class Ranking {
	private HashMap<String, Groups> listOfGroups ;
	
	/**
	 * @return HashMap listOfGroups
	 **/
	public HashMap<String, Groups> getListOfGroups() {
		return listOfGroups;
	}

	/**
	 *@param HashMap listOfGroups
	 **/
	public void setListOfGroups(HashMap<String, Groups> listOfGroups) {
		this.listOfGroups = listOfGroups;
	}

	/**
	 * @param listOfGroups 
	 **/
	public Ranking(HashMap<String, Groups> listOfGroups) {
		super();
		this.listOfGroups = listOfGroups;
	}
	@Override
	public String toString() {
		return "Classement []";
	}
	
}

