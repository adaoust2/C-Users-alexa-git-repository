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

	/**
	 * @param float shoot2points
	 * @param float shoot3points
	 * @param float dribble 
	 * @param float endurance 
	 * @param float clutch
	 * @param float defense
	 * @param float rebrebDefense 
	 * @param float rebAttack
	 **/
	public PlayerStats(float shoot2Points, float shoot3Points, float dribble, float endurance, float clutch,
			float defense, float rebDefense, float rebAttack) {
		super();
		this.shoot2Points = shoot2Points;
		this.shoot3Points = shoot3Points;
		this.dribble = dribble;
		this.endurrance = endurance;
		this.clutch = clutch;
		this.defense = defense;
		this.rebDefense = rebDefense;
		this.rebAttack = rebAttack;
	}

	/**
	 * @return float shoot2points
	 **/
	public float getShoot2Points() {
		return shoot2Points;
	}

	/**
	 * @param float shoot2points
	 **/
	public void setShoot2Points(float shoot2Points) {
		this.shoot2Points = shoot2Points;
	}

	/**
	 * @return float shoot3points
	 **/
	public float getShoot3Points() {
		return shoot3Points;
	}

	/**
	 * @param float shoot3points
	 **/
	public void setShoot3Points(float shoot3Points) {
		this.shoot3Points = shoot3Points;
	}

	/**
	 * @return float dribble
	 **/
	public float getDribble() {
		return dribble;
	}

	/**
	 * @param float dribble
	 **/
	public void setDribble(float dribble) {
		this.dribble = dribble;
	}

	/**
	 * @return float endurrance
	 **/
	public float getEndurrance() {
		return endurrance;
	}

	/**
	 * @param float endurrance
	 **/
	public void setEndurrance(float endurrance) {
		this.endurrance = endurrance;
	}

	/**
	 * @return float clutch
	 **/
	public float getClutch() {
		return clutch;
	}

	/**
	 * @param float clutch
	 **/
	public void setClutch(float clutch) {
		this.clutch = clutch;
	}

	/**
	 * @return float defense
	 **/
	public float getDefense() {
		return defense;
	}

	/**
	 * @param float defense
	 **/
	public void setDefense(float defense) {
		this.defense = defense;
	}

	/**
	 * @return float rebDefense
	 **/
	public float getRebDefense() {
		return rebDefense;
	}

	/**
	 * @param float rebDefense
	 **/
	public void setRebDefense(float rebDefense) {
		this.rebDefense = rebDefense;
	}

	/**
	 * @return float rebAttack
	 **/
	public float getRebAttack() {
		return rebAttack;
	}

	/**
	 * @param float rebAttack
	 **/
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

	public float getMoyenne(){
		return (this.clutch +
				this.endurrance+
				this.defense+
				this.shoot2Points+
				this.shoot3Points+
				this.dribble+
				this.rebDefense+
				this.rebAttack)/8;
	}

	public String toString(){
		return "\n   ENDURANCE : "+this.endurrance;
	}
	
}