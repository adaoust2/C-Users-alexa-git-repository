package data;

import java.util.HashMap;

public class Groups {
	private HashMap<String, Club> listOfCLubs =  new HashMap<String, Club>();
	private int nbClub;
	private String name;
	
	public Groups() {
		super();
	}
	/**
	 * @param HashMap listOfClubs 
	 * @param int nbClub 
	 * @param String name
	 * */
	public Groups(HashMap<String, Club> listOfCLubs, int nbClub, String name) {
		super();
		this.listOfCLubs = listOfCLubs;
		this.nbClub = nbClub;
		this.name = name;
	}

	/**
	 * @return HashMap listOfClubs
	 * */
	public HashMap<String, Club> getListOfCLubs() {
		return listOfCLubs;
	}

	/**
	 * @param HashMap listOfClubs
	 * */
	public void setListOfCLubs(HashMap<String, Club> listOfCLubs) {
		this.listOfCLubs = listOfCLubs;
	}
	
	/**
	 * @return int nbClub
	 * */
	public int getNbClub() {
		return nbClub;
	}

	/**
	 * @param int nbClub
	 * */
	public void setNbClub(int nbClub) {
		this.nbClub = nbClub;
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

}
