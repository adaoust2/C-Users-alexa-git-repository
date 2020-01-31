package data;

/**@author oumar
 * 
 * 
 * 
 * */
public class Match {
   
	private Club club1 ;
    private Club club2 ;
    private String location;
    private String result ; 
    
    public Match(Club club1, Club club2, String lieu, String resultat) {
		super();
		this.club1 = club1;
		this.club2 = club2;
		this.location = lieu;
		this.result = resultat;
	}

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Club getClub1() {
		return club1;
	}

	public void setClub1(Club club1) {
		this.club1 = club1;
	}

	public Club getClub2() {
		return club2;
	}

	public void setClub2(Club club2) {
		this.club2 = club2;
	}

	public String getLieu() {
		return location;
	}

	public void setLieu(String lieu) {
		this.location = lieu;
	}

	public String getResultat() {
		return result;
	}

	public void setResultat(String resultat) {
		this.result = resultat;
	}

	@Override
	public String toString() {
		return "Match [club 1 = " +club1 + "club2= "+club2+" location=" + location + ", result=" + result + "]";
	}
    
}
