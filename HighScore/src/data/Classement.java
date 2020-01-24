package data;

import java.util.HashMap;
/**
 * @author oumar
 * **/
public class Classement {
	private HashMap<String, Groups> listOfGroups ;

	public HashMap<String, Groups> getListOfGroups() {
		return listOfGroups;
	}

	public void setListOfGroups(HashMap<String, Groups> listOfGroups) {
		this.listOfGroups = listOfGroups;
	}

	public Classement(HashMap<String, Groups> listOfGroups) {
		super();
		this.listOfGroups = listOfGroups;
	}
	@Override
	public String toString() {
		return "Classement []";
	}
	
}

