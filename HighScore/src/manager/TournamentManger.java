package manager;

import java.util.ArrayList;
import java.util.Iterator;

import data.Club;
import generator.ClubGenerator;

public class TournamentManger {
	
	private ClubGenerator clubGenerator;
	
	private ArrayList<Club> clubsList;

    public TournamentManger(){
    	clubsList = new ArrayList<Club>();
    	clubGenerator = new ClubGenerator();
    }
    
    
    public TournamentManger(ClubGenerator clubGenerator, ArrayList<Club> clubsList) {
		super();
		this.clubGenerator = clubGenerator;
		this.clubsList = clubsList;
	}

	public void startTournament(){
    	clubsList = clubGenerator.generateClubs();
    	Iterator<Club> it = clubsList.iterator();
    	while(it.hasNext())
    		System.out.println(it.next().toString());
    }

}