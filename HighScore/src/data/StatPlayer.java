package data;

public class StatPlayer {
	private float shoot2Points;
	private float shoot3Points;
	private float dribble;
	private int endurrance;
	private float clutch;
	private float defense;
	private float attack;
	
	
	public StatPlayer() {
		super();
	}
	
	public StatPlayer(float shoot2Points, float shoot3Points, float dribble, int endurrance, float clutch,
			float defense, float attack) {
		super();
		this.shoot2Points = shoot2Points;
		this.shoot3Points = shoot3Points;
		this.dribble = dribble;
		this.endurrance = endurrance;
		this.clutch = clutch;
		this.defense = defense;
		this.attack = attack;
	}

	public float getShoot2Points() {
		return shoot2Points;
	}
	public void setShoot2Points(float shoot2Points) {
		this.shoot2Points = shoot2Points;
	}
	public float getShoot3Points() {
		return shoot3Points;
	}
	public void setShoot3Points(float shoot3Points) {
		this.shoot3Points = shoot3Points;
	}
	public float getDribble() {
		return dribble;
	}
	public void setDribble(float dribble) {
		this.dribble = dribble;
	}
	public int getEndurrance() {
		return endurrance;
	}
	public void setEndurrance(int endurrance) {
		this.endurrance = endurrance;
	}
	public float getClutch() {
		return clutch;
	}
	public void setClutch(float clutch) {
		this.clutch = clutch;
	}
	public float getDefense() {
		return defense;
	}
	public void setDefense(float defense) {
		this.defense = defense;
	}
	public float getAttack() {
		return attack;
	}
	public void setAttack(float attack) {
		this.attack = attack;
	}
}