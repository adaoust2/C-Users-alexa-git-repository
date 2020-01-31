package data;

import java.util.ArrayList;
import java.util.Random;

import elements.GParameters;

public class Test {
	
	private static ArrayList<String> playersStats = new ArrayList<String>();

	
	
	public static void main(String[] args) {
		
		
		generateStat();
		System.out.println("PLAYERS STATS:");
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
		int stat = 0;
		
		String statInfos = "";
		String[] statName = {"SHOOT_2","SHOOT_3","DRIBBLE","ENDURANCE","CLUTCH","DEFENSE","REBOND_DEF","REBOND_ATK"}; 
		
		for(int i=0;i<GParameters.MAX_PLAYERS;i++){
			
			statInfos += "Joueur "+i;
			
			for(int j=0;j<GParameters.MAX_STATS;j++) {
				stat = randomStats(GParameters.intervalle[j].getMin(), GParameters.intervalle[j].getMax());
				statInfos +=" : "+statName[j]+" "+stat;
			}
			
			playersStats.add(statInfos);
			statInfos = "";
		}
	}

}
