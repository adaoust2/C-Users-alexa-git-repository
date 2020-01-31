package data;

import java.util.*;

import elements.GParameters;
import generator.ClubGenerator;

public class Test {
	
	private static ArrayList<String> playersStats = new ArrayList<String>();

	
	
	public static void main(String[] args) {

		System.out.println("PLAYERS STATS:");
		for (int i = 0; i < playersStats.size(); i++) {
			//System.out.println(playersStats.get(i));
		}

		ClubGenerator generator = new ClubGenerator();
		ArrayList<Club> clubs = generator.generateClubs();

		Iterator it = clubs.iterator();

		while (it.hasNext()) {
			Club current = (Club) it.next();
			System.out.println(current.getName() + "\n");
			HashMap<String, Player> players = current.getPlayers();
			for (Map.Entry me : players.entrySet()) {
				Player currentPlayer = (Player) me.getValue();
				System.out.println("\n   NOM : " + currentPlayer.getName() + "\n   POSTE : " + currentPlayer.getPoste() + "\n   TAILLE : " + currentPlayer.getHeight());

			}

		}
	}
	


}
