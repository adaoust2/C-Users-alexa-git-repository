package data;

import java.util.HashMap;
/**
 * @author oumar
 * 
 * This class display the classment of a group
 * for the four club 
 * **/
public class Classement {
	private HashMap<String, Groups> listOfGroups ;

	public HashMap<String, Groups> getListOfGroups() {
		return listOfGroups;
	}
	
	/**
	 * @param lisOfgroups 
	 * **/
	public void setListOfGroups(HashMap<String, Groups> listOfGroups) {
		this.listOfGroups = listOfGroups;
	}

	/**
	 * @param lisOfgroups 
	 * **/
	public Classement(HashMap<String, Groups> listOfGroups) {
		super();
		this.listOfGroups = listOfGroups;
	}
	@Override
	public String toString() {
		return "Classement []";
	}
	
}

