package manager;

import data.Club;

import java.util.HashMap;

public class FinalPhaseManager {

    private String[] tab1 = {"A", "C", "E", "G"};
    private String[] tab2 = {"B", "D", "F", "H"};

    private HashMap<String, Club> resultPoules;

    public FinalPhaseManager(HashMap<String, Club> resultPoules){
        this.resultPoules = resultPoules;
    }

    public void playFinalPhase(){
        eightFinal();
    }

    private void eightFinal(){

        System.out.println("***********  Huitieme de finale *********\n");
        MatchManager matchManager = new MatchManager();
        HashMap<String, Club> quart = new HashMap<String, Club>();
        for(int i = 0; i<4; i++){
            Club club1 = resultPoules.get(tab1[i]+"1");
            Club club2 = resultPoules.get(tab2[i]+"2");
            Club winner = matchManager.matchProcess(club1, club2);

            if(i < 2){
                quart.put("1-"+(i%2), winner);
            }else{
                quart.put("2-"+(i%2), winner);
            }
        }

        for(int i = 0; i<4; i++){
            Club club1 = resultPoules.get(tab2[i]+"1");
            Club club2 = resultPoules.get(tab1[i]+"2");
            Club winner = matchManager.matchProcess(club1, club2);

            if(i < 2){
                quart.put("3-"+(i%2), winner);
            }else{
                quart.put("4-"+(i%2), winner);
            }
        }

        quarterFinal(quart);
    }

    private void quarterFinal(HashMap<String, Club> qclubs){

        System.out.println("***********  Quart de finale *********\n");
        MatchManager matchManager = new MatchManager();
        HashMap<String, Club> semi = new HashMap<String, Club>();
        for(int i = 0; i<4 ;i++){
            Club club1 = qclubs.get(String.valueOf(i+1)+"-0");
            Club club2 = qclubs.get(String.valueOf(i+1)+"-1");
            Club winner = matchManager.matchProcess(club1, club2);

            if(i<2){
                semi.put("1-"+(i%2), winner);
            }else{
                semi.put("2-"+(i%2), winner);
            }
        }

        semiFinal(semi);
    }

    private void semiFinal(HashMap<String, Club> sclubs){

        System.out.println("***********  Demi finale *********\n");

        MatchManager matchManager = new MatchManager();
        HashMap<String, Club> bfinal = new HashMap<String, Club>();
        for(int i = 0; i<2 ;i++){
            Club club1 = sclubs.get(String.valueOf(i+1)+"-0");
            Club club2 = sclubs.get(String.valueOf(i+1)+"-1");
            Club winner = matchManager.matchProcess(club1, club2);

            bfinal.put(String.valueOf(i), winner);
        }

        bigFinal(bfinal);
    }

    private void bigFinal(HashMap<String, Club> bfinal){

        System.out.println("***********  FINALE *********\n");

        MatchManager matchManager = new MatchManager();
        Club club1 = bfinal.get("0");
        Club club2 = bfinal.get("1");

        Club finalWinner = matchManager.matchProcess(club1, club2);

        System.out.println("***********  GAGNANT FINAL DU TOURNOI !! *********"
                            +"\n*      "+finalWinner.getName());
    }

}


