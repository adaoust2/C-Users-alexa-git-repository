package process.factory;

import java.util.HashMap;

import data.*;
/**
 * This utility class allows the creation of all HighScoreRepository elements of any concrete type. The
 * class uses simple factory design pattern with static utility methods.
 * @author @Bjmeo
 */
public class HighScoreFactory {

	/**
	 * @param name
	 * @param poste
	 * @param height
	 * @param clubName
	 * @param pStats
	 * @param isStar
	 * @return
	 */
	public static Player createPlayer(String name, String poste, float height, String clubName, PlayerStats pStats, Boolean isStar){
		return new Player(name,poste,height,clubName,pStats,isStar);
	}
	
	
	/**
	 * @param name
	 * @param group
	 * @param players
	 * @param cStat
	 * @return
	 */
	public static Club createClub(String name, String group, HashMap<String, Player> players) {
		return new Club(name,group,players);
	}
	
	/**
	 * @param listOfCLubs
	 * @param nbClub
	 * @param name
	 * @return
	 */
	public static Groups createGroups(HashMap<String, Club> listOfCLubs, int nbClub, String name){
		return new Groups(listOfCLubs,nbClub,name);
	}
	
	/**
	 * @param club1
	 * @param club2
	 * @param lieu
	 * @param resultat
	 * @return
	 */
	public static Match createMatch(Club club1, Club club2, String lieu, String resultat) {
		return new Match(club1,club2,resultat);
	}
	
	/**
	 * @param shoot2Points
	 * @param shoot3Points
	 * @param dribble
	 * @param endurrance
	 * @param clutch
	 * @param defense
	 * @param rebDefense
	 * @param rebAttack
	 * @return
	 */
	public static PlayerStats createPlayerStats(float shoot2Points, float shoot3Points, float dribble, float endurrance, float clutch,
			float defense, float rebDefense, float rebAttack){
		return new PlayerStats(shoot2Points,shoot3Points,dribble,endurrance,clutch,defense,rebDefense,rebAttack);
	}
	
	/**
	 * @return
	 */

	
	/**
	 * @param listOfGroups
	 * @return
	 */
	public static Ranking createRanking(HashMap<String, Groups> listOfGroups){
		return new Ranking(listOfGroups);
	}
	
	
	/**
	 * @param groups
	 * @return
	 */
	public static Tournament createTournament(Groups groups){
		return new Tournament(groups);
	}
	
	
}
