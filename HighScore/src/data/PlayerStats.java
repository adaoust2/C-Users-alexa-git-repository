package data;

public class PlayerStats {
	private float shoot2Points;
	private float shoot3Points;
	private float dribble;
	private float endurrance;
	private float clutch;
	private float defense;
	private float rebDefense;
	private float rebAttack;
	
	public PlayerStats() {
		super();
	}

	public PlayerStats(float shoot2Points, float shoot3Points, float dribble, float endurrance, float clutch,
			float defense, float rebDefense, float rebAttack) {
		super();
		this.shoot2Points = shoot2Points;
		this.shoot3Points = shoot3Points;
		this.dribble = dribble;
		this.endurrance = endurrance;
		this.clutch = clutch;
		this.defense = defense;
		this.rebDefense = rebDefense;
		this.rebAttack = rebAttack;
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

	public float getEndurrance() {
		return endurrance;
	}

	public void setEndurrance(float endurrance) {
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

	public float getRebDefense() {
		return rebDefense;
	}

	public void setRebDefense(float rebDefense) {
		this.rebDefense = rebDefense;
	}

	public float getRebAttack() {
		return rebAttack;
	}

	public void setRebAttack(float rebAttack) {
		this.rebAttack = rebAttack;
	}

	public void setStatPlayer(String type, float value){
		switch (type){
			case "SHOOT_2":
				this.setShoot2Points(value);
				break;

			case "SHOOT_3":
				this.setShoot3Points(value);
				break;

			case "DRIBBLE":
				this.setDribble(value);
				break;

			case "ENDURANCE":
				this.setEndurrance(value);
				break;

			case "CLUTCH":
				this.setClutch(value);
				break;

			case "DEFENSE":
				this.setDefense(value);
				break;

			case "REBOND_DEF":
				this.setRebDefense(value);
				break;

			case "REBOND_ATK":
				this.setRebAttack(value);
				break;
		}
	}

	public String toString(){
		return "\n   ENDURANCE : "+this.endurrance;
	}
	
}
