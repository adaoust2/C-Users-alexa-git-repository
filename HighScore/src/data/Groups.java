package data;

import java.util.HashMap;

public class Groups {
	private HashMap<String, Club> listOfCLubs =  new HashMap<String, Club>();
	private int nbClub;
	private String name;
	
	public Groups() {
		super();
	}
	public Groups(HashMap<String, Club> listOfCLubs, int nbClub, String name) {
		super();
		this.listOfCLubs = listOfCLubs;
		this.nbClub = nbClub;
		this.name = name;
	}

	public HashMap<String, Club> getListOfCLubs() {
		return listOfCLubs;
	}

	public void setListOfCLubs(HashMap<String, Club> listOfCLubs) {
		this.listOfCLubs = listOfCLubs;
	}

	public int getNbClub() {
		return nbClub;
	}

	public void setNbClub(int nbClub) {
		this.nbClub = nbClub;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
