package manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import data.Club;
import elements.Couple;
import generator.ChapeauGenerator;
import generator.ClubGenerator;
import generator.GroupGenerator;

public class TournamentManger {

    private ClubGenerator clubGenerator;

    private ArrayList<Club> clubsList;

    private ArrayList<ArrayList<Club>> chap;

    private GroupGenerator groups;

    private ChapeauGenerator chapeau;

    private ArrayList<ArrayList<Club>> g;

    private MatchManager meetting;

    private static String[] grps = {"A","B","C","D","E","F","G","H"};

    public TournamentManger(){
        clubGenerator = new ClubGenerator();
        chapeau = new ChapeauGenerator();
        clubsList = clubGenerator.generateClubs();
        clubGenerator = new ClubGenerator();
        g = new ArrayList<ArrayList<Club>>();
        meetting = new MatchManager();
    }


    public TournamentManger(ClubGenerator clubGenerator, ArrayList<Club> clubsList) {
        super();
        this.clubGenerator = clubGenerator;
        this.clubsList = clubsList;
    }

    public void startTournament(){

        chap = chapeau.generateChapeau(clubsList);

        groups = new GroupGenerator(chap);

        g = groups.GenerateGroups();

    }

    public void matchPools(){
        int currentGroupe = 0;
        System.out.println(" ****** MATCHS DE POULE *****");

        for(ArrayList<Club> groups : g) {
            System.out.println("\n GROUPE "+grps[currentGroupe]+"------\n");
            for(int i=0;i<groups.size();i++){
                for(int j=i+1;j<groups.size();j++){
                    meetting.matchProcess(groups.get(i),groups.get(j));
                }
            }

            currentGroupe++;
        }
    }

    @SuppressWarnings("unchecked")
    public void ranking() {
        ArrayList<Couple> rank = new ArrayList<Couple>();
        int j=0;
        HashMap<String, Club> classement = new HashMap<String, Club>();
        for(ArrayList<Club> groups : g) {
            for(int i=0;i<groups.size();i++){
                rank.add(new Couple(groups.get(i).getPoints(), groups.get(i)));
            }
            Collections.sort(rank);
            classement.put(grps[j]+"1", rank.get(rank.size()-1).getClub());
            classement.put(grps[j]+"2", rank.get(rank.size()-2).getClub());
            //System.out.println(rank.get(rank.size()-2).getClub());
            //System.out.println(rank.get(rank.size()-1).getClub());
            j++;
        }
         FinalPhaseManager manager = new FinalPhaseManager(classement);
        manager.playFinalPhase();
    }
}