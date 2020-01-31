package data;

/**@author oumar
 * 
 * 
 * 
 * */
public class Match {
   
    private Club club1 ;
    private Club club2 ;
<<<<<<< HEAD
    private String result ; 
=======
    private String resultat ; 
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
    
<<<<<<< HEAD
    /**
	 * @param Club club1
	 * @param Club club2
	 * @param String club1
	 * */
=======
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
    public Match(Club club1, Club club2, String resultat) {
		super();
		this.club1 = club1;
		this.club2 = club2;
<<<<<<< HEAD
		this.result = resultat;
=======
		this.resultat = resultat;
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
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

	public String getResultat() {
		return result;
	}

	public void setResultat(String resultat) {
		this.result = resultat;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Match [club 1 = " +club1 + "club2= "+club2+", result=" + result + "]";
=======
		return "Match [club 1 = " +club1 + "club2= "+club2+", result=" + resultat + "]";
>>>>>>> branch 'master' of https://github.com/adaoust2/C-Users-alexa-git-repository.git
	}
    
}
