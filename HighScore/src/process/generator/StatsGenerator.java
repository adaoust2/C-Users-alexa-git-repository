package process.generator;

import java.util.ArrayList;
import data.*;

import elements.GParameters;
import elements.HighScoreUtility;
import process.factory.HighScoreFactory;

public class StatsGenerator {

	private ArrayList<PlayerStats> playersStats = new ArrayList<PlayerStats>();
	
	
	public StatsGenerator(){}
	
	public void generateStats() {
		
		int stat = 0;
		
		PlayerStats pStats;
		
		float[] tabStats = {};
		
		for(int i=0;i<GParameters.MAX_PLAYERS;i++){
									
			for(int j=0;j<GParameters.MAX_STATS;j++) {
				stat = HighScoreUtility.randomStats(GParameters.intervalle[j].getMin(), GParameters.intervalle[j].getMax());
				tabStats[j] = stat;
			}
			
			pStats = HighScoreFactory.createPlayerStats(tabStats[0], tabStats[1], tabStats[2], tabStats[3], tabStats[4], tabStats[5], tabStats[6], tabStats[7]);

			playersStats.add(pStats);
		}
	}


	public ArrayList<PlayerStats> getPlayersStats() {
		return playersStats;
	}


	public void setPlayersStats(ArrayList<PlayerStats> playersStats) {
		this.playersStats = playersStats;
	}
	
	

}
