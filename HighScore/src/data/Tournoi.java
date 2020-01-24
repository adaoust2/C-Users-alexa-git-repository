package data;

public class Tournoi {
	private Groupe groups ;

	public Tournoi(Groupe groups) {
		super();
		this.groups = groups;
	}

	public Groupe getGroups() {
		return groups;
	}

	public void setGroups(Groupe groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Tournoi [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
