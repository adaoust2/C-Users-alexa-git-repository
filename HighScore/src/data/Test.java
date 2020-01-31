package data;

import java.util.ArrayList;
import java.util.Random;

import elements.GParameters;
import elements.Intervalle;

public class Test {
	private static int stat = 0;  
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
		}
	}

}
