package data;
/**
 * @author Bjmeo
 * *************
 */
public class Player {
	
	private String name;
	private String poste;
	private float height ;
	private String clubName;
	private PlayerStats pStats;
	private Boolean isStar;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Player(String name, String poste, float height, String clubName, PlayerStats pStats, Boolean isStar) {
		super();
		this.name = name;
		this.poste = poste;
		this.height = height;
		this.clubName = clubName;
		this.pStats = pStats;
		this.isStar = isStar;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPoste() {
		return poste;
	}


	public void setPoste(String poste) {
		this.poste = poste;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public String getClubName() {
		return clubName;
	}


	public void setClubName(String clubName) {
		this.clubName = clubName;
	}


	public Boolean getIsStar() {
		return isStar;
	}


	public void setIsStar(Boolean isStar) {
		this.isStar = isStar;
	}


	public PlayerStats getpStats() {
		return pStats;
	}


	public void setpStats(PlayerStats pStats) {
		this.pStats = pStats;
	}


	
	
	
	

}
