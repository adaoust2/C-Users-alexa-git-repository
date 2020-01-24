package data;

import java.util.HashMap;
/**
 * @author oumar
 * **/
public class Classement {
	private HashMap<Score, Group> listOfGroups ;

	public HashMap<Score, Group> getListOfGroups() {
		return listOfGroups;
	}

	public void setListOfGroups(HashMap<Score, Group> listOfGroups) {
		this.listOfGroups = listOfGroups;
	}

	public Classement(HashMap<Score, Group> listOfGroups) {
		super();
		this.listOfGroups = listOfGroups;
	}

	@Override
	public String toString() {
		return "Classement []";
	}
	
}

