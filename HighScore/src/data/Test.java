package data;

import java.util.*;

import elements.GParameters;
<<<<<<< HEAD
import elements.Intervalle;
=======
import generator.ClubGenerator;
import generator.MoyenneGenrator;
import manager.MatchManager;
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git

public class Test {
	private static int stat = 0;  
	private static ArrayList<String> playersStats = new ArrayList<String>();

<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
	public static void main(String[] args) {

<<<<<<< HEAD
		generateStat();
=======
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
		System.out.println("PLAYERS STATS:");
<<<<<<< HEAD
        for(int i=0;i<playersStats.size();i++){
        	
        	System.out.println(playersStats.get(i));
        }
      
	}
	
	public static int randomStats(int min, int max){
		
		Random rand = new Random(); 
		
		int stat = rand.nextInt((max - min) + 1) + min;
		
		return stat;
		
	}
	
	public static void generateStat() {
		//int stat = 0;
		int min =0;
		int max =0;
		
		String statInfos = "";
		String[] statName = {"SHOOT_2","SHOOT_3","DRIBBLE","ENDURANCE","CLUTCH","DEFENSE","REBOND_DEF","REBOND_ATK"}; 
		
		for(int i=0;i<GParameters.MAX_PLAYERS;i++){
			
			statInfos += "Joueur "+i;
			
			for(int j=0;j<GParameters.MAX_STATS;j++) {
				
				min = GParameters.intervalle[j].getMin();
				max = GParameters.intervalle[j].getMax();
				stat = randomStats(min,max);
				statInfos +=" : "+statName[j]+" "+stat; 
			 
			}
			
			for(int x =0 ;x<GParameters.MAX_STATS;x++) {
				int minShoot2 = GParameters.intervalle[0].getMin();
				int maxShoot2 = GParameters.intervalle[0].getMax();
				
				if(minShoot2<60 || maxShoot2>100) {
					System.err.println("Errror of interval for Shoot2");	
				}
			}
			playersStats.add(statInfos);
			statInfos = "";
=======
		for (int i = 0; i < playersStats.size(); i++) {
			System.out.println(playersStats.get(i));
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
		}

		ClubGenerator generator = new ClubGenerator();
		ArrayList<Club> clubs = generator.generateClubs();

		Iterator it = clubs.iterator();
		
		while (it.hasNext()) {
			Club current = (Club) it.next();
			System.out.println("\n\n"+current.getName() + "\n");
			HashMap<String, Player> players = current.getPlayers();
			for (Map.Entry me : players.entrySet()) {
				Player currentPlayer = (Player) me.getValue();
				//System.out.println(currentPlayer.getpStats());

				//System.out.println("\n   NOM : " + currentPlayer.getName() + "\n   POSTE : " + currentPlayer.getPoste() + "\n   TAILLE : " + currentPlayer.getHeight()+currentPlayer.getpStats().toString());


			}
			MoyenneGenrator moyGenerator = new MoyenneGenrator(current);
			System.out.println("\n   MOYENNE : "+moyGenerator.calculMoyenne() );

		}
		
		
		MatchManager match = new MatchManager(0, clubs.get(0), clubs.get(1));
		match.matchProcess(clubs.get(0), clubs.get(1));
	}

}
