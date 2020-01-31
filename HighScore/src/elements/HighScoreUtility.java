package elements;

import java.util.Random;

public class HighScoreUtility {

	public static int randomStats(int min, int max){
		
		Random rand = new Random(); 
		
		int stat = rand.nextInt((max - min) + 1) + min;
		
		return stat;
		
	}
}
