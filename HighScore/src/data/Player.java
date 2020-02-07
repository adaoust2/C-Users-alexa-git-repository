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

	/**
	 * @param String name
	 * @param String poste
	 * @param float height
	 * @param String clubName
	 * @param PlayerStats pStats
	 * @param Boolean isStar
	 **/
	public Player(String name, String poste, float height, String clubName, PlayerStats pStats, Boolean isStar) {
		super();
		this.name = name;
		this.poste = poste;
		this.height = height;
		this.clubName = clubName;
		this.pStats = pStats;
		this.isStar = isStar;
	}

	/**
	 * @return String name
	 **/
	public String getName() {
		return name;
	}

	/**
	 * param String name
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return String poste
	 **/
	public String getPoste() {
		return poste;
	}

	/**
	 * @param String poste
	 **/
	public void setPoste(String poste) {
		this.poste = poste;
	}

	/**
	 * @return float height
	 **/
	public float getHeight() {
		return height;
	}

	/**
	 * @param float height
	 **/
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return String clubName
	 **/
	public String getClubName() {
		return clubName;
	}

	/**
	 * @param String clubName
	 **/
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	/**
	 * @param Boolean isStar
	 **/
	public Boolean getIsStar() {
		return isStar;
	}

	/**
	 * @param Boolean isStar
	 **/
	public void setIsStar(Boolean isStar) {
		this.isStar = isStar;
	}

	/**
	 * @return PlayerStats pStats
	 **/
	public PlayerStats getpStats() {
		return pStats;
	}

	/**
	 * @param PlayerStats pStats
	 **/
	public void setpStats(PlayerStats pStats){
		this.pStats = pStats;
	}
}