package manager;

import generator.ClubGenerator;

public class TournamentManger {

    public TournamentManger(){

    }

    public void startTournament(){
        ClubGenerator generator  =new ClubGenerator();
        generator.generateClubs();
    }

}
