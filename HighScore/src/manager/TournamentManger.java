package manager;

import java.util.ArrayList;
import java.util.Iterator;

import data.Club;
import generator.ChapeauGenerator;
import generator.ClubGenerator;
import generator.GroupGenerator;

public class TournamentManger {
	
	private ClubGenerator clubGenerator;
	
	private ArrayList<Club> clubsList;
	
	private ArrayList<ArrayList<Club>> chap;
	
	private GroupGenerator groups;
	
	private ChapeauGenerator chapeau;

    public TournamentManger(){
    	clubGenerator = new ClubGenerator();
    	chapeau = new ChapeauGenerator();
    	clubsList = clubGenerator.generateClubs();
    	clubGenerator = new ClubGenerator();
    	
    }
    
    
    public TournamentManger(ClubGenerator clubGenerator, ArrayList<Club> clubsList) {
		super();
		this.clubGenerator = clubGenerator;
		this.clubsList = clubsList;
	}

	public void startTournament(){
    	
		chap = chapeau.generateChapeau(clubsList);
		
        
          
        System.out.println("-------chapeau------");
    	for(ArrayList<Club> chapeauFinal : chap) {
    		for(Club club : chapeauFinal)
    			System.out.println(club.toString());
    	}
    	 
    	groups = new GroupGenerator(chap);
    	
        ArrayList<ArrayList<Club>> g = groups.GenerateGroups();

    	
    	System.out.println("-------groups------");
    	for(ArrayList<Club> groupsFinal : g) {
    		for(Club club : groupsFinal)
    			System.out.println(club.toString());
    	}
    }
}