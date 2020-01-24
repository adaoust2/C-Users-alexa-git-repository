package elements;

public class GParameters {

	public static final Intervalle SHOOT_2 = new Intervalle(60,100);
	
	public static final Intervalle SHOOT_3 = new Intervalle(40,80);
	
	public static final Intervalle DRIBBLE = new Intervalle(20,40);
		
	public static final Intervalle ENDURANCE = new Intervalle(20,40);
	
	public static final Intervalle CLUTCH = new Intervalle(30,50);
	
	public static final Intervalle DEFENSE = new Intervalle(20,40);
	
	public static final Intervalle REBOND_DEF = new Intervalle(50,70);
	
	public static final Intervalle REBOND_ATK = new Intervalle(30,80);
	
	public static final int MAX_PLAYERS = 352;
	
	public static final int MAX_STATS = 8;
	
	public static final Intervalle[] intervalle = {SHOOT_2,SHOOT_3,DRIBBLE,ENDURANCE,CLUTCH,DEFENSE,REBOND_DEF,REBOND_ATK};
	
	public static final String[] post = {"meneur","arriere","ailier","ailier_fort","pivot"};
	

}
 