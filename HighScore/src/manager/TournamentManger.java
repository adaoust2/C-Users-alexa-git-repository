package manager;

import java.util.ArrayList;
import java.util.Iterator;

import data.Club;
import generator.ClubGenerator;

public class TournamentManger {
	
	ClubGenerator generator = new ClubGenerator();
	ArrayList<Club> clubs = generator.generateClubs();
	Iterator it = clubs.iterator();
	Club current = (Club) it.next();

    public TournamentManger(){

    }

    public void startTournament(){
    	MatchManager match1 = new MatchManager(0,current , (Club) it.next());
    }

}