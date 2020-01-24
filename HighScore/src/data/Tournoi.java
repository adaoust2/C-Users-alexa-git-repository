package data;
/**
 * @author oumar
 * */
public class Tournoi {
	private Groups groups ;

	public Tournoi(Groups groups) {
		super();
		this.groups = groups;
	}

	public Groups getGroups() {
		return groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Tournoi [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
